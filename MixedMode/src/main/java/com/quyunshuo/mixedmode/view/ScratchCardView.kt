package com.quyunshuo.mixedmode.view

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import com.quyunshuo.mixedmode.R

/**
 * 从橡皮擦View改造成刮刮卡View
 *
 * @author Qu Yunshuo
 * @since 12/26/20 9:11 PM
 */
class ScratchCardView : View {

    private val mPaint = Paint().apply {
        color = Color.RED
        style = Paint.Style.STROKE
        strokeWidth = 45F
        strokeCap = Paint.Cap.ROUND
        isAntiAlias = true
    }

    private val mBitmapSRC by lazy {
        val options = BitmapFactory.Options().apply {
            // 设置采样率 将源图像设置为原来的1/2
            inSampleSize = 2
            inMutable = true
        }
        BitmapFactory.decodeResource(resources, R.drawable.dog, options)
    }

    private val mBitmapDST by lazy {
        Bitmap.createBitmap(mBitmapSRC.width, mBitmapSRC.height, Bitmap.Config.ARGB_8888)
    }

    private val mBitmapBg by lazy {
        BitmapFactory.decodeResource(resources, R.drawable.guaguaka_text, null)
    }

    private val mPath = Path()

    private var mPreX = 0F

    private var mPreY = 0F

    private val mXfermode = PorterDuffXfermode(PorterDuff.Mode.SRC_OUT)

    constructor(context: Context?) : super(context) {
        setLayerType(LAYER_TYPE_SOFTWARE, null)
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        setLayerType(LAYER_TYPE_SOFTWARE, null)
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        setLayerType(LAYER_TYPE_SOFTWARE, null)
    }

    constructor(
        context: Context?,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int
    ) : super(context, attrs, defStyleAttr, defStyleRes) {
        setLayerType(LAYER_TYPE_SOFTWARE, null)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                // 设置路径的起始点
                mPath.moveTo(event.x, event.y)
                // 保存此次的点
                mPreX = event.x
                mPreY = event.y
                return true
            }
            MotionEvent.ACTION_MOVE -> {
                // 使用二阶贝塞尔曲线
                mPath.quadTo(mPreX, mPreY, (mPreX + event.x) / 2, (mPreY + event.y) / 2)
                // 保存此次的点

                mPreX = event.x
                mPreY = event.y
            }
            MotionEvent.ACTION_UP -> {
            }
        }
        // 重绘
        invalidate()
        return super.onTouchEvent(event)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        // 先画出底层的结果图片
        canvas.drawBitmap(mBitmapBg, 0F, 0F, mPaint)

        val layerId =
            canvas.saveLayer(0F, 0F, width.toFloat(), height.toFloat(), null, Canvas.ALL_SAVE_FLAG)

        // 将手势轨迹画到目标图像上
        val canvas1 = Canvas(mBitmapDST)
        canvas1.drawPath(mPath, mPaint)

        // 然后将目标图像画到画布上
        canvas.drawBitmap(mBitmapDST, 0F, 0F, mPaint)

        // 计算源图像区域
        mPaint.xfermode = mXfermode
        canvas.drawBitmap(mBitmapSRC, 0F, 0F, mPaint)

        mPaint.xfermode = null
        canvas.restoreToCount(layerId)
    }
}