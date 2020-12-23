package com.quyunshuo.mixedmode.view

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View

/**
 * 混合模式View
 *
 * @author Qu Yunshuo
 * @since 12/23/20 7:34 PM
 */
class PorterDuffXfermodeView : View {

    private val mWidth = 200

    private val mHeight = 200

    private val mPaint = Paint()

    private val mDstBitmap by lazy { makeDst() }

    private val mSrcBitmap by lazy { mackSrc() }

    private val mXfermode = PorterDuffXfermode(PorterDuff.Mode.SRC_IN)

    constructor(context: Context?) : super(context) {
        init()
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        init()
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init()
    }

    constructor(
        context: Context?,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int
    ) : super(context, attrs, defStyleAttr, defStyleRes) {
        init()
    }

    private fun init() {
        setLayerType(LAYER_TYPE_SOFTWARE, null)
    }

    /**
     * 新建一个空白图片，然后在图片上画一个黄色的圆形
     * @return Bitmap
     */
    private fun makeDst(): Bitmap {
        val bm = Bitmap.createBitmap(mWidth, mWidth, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bm)
        val paint = Paint(Paint.ANTI_ALIAS_FLAG)
        paint.color = 0xFFFFCC44.toInt()
        canvas.drawOval(RectF(0F, 0F, mWidth.toFloat(), mWidth.toFloat()), paint)
        return bm
    }

    /**
     * 新建一张和mDstBitmap同样大小的位图，并将其填充为蓝色
     * @return Bitmap
     */
    private fun mackSrc(): Bitmap {
        val bm = Bitmap.createBitmap(mWidth, mWidth, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bm)
        val paint = Paint(Paint.ANTI_ALIAS_FLAG)
        paint.color = 0xFF66AAFF.toInt()
        canvas.drawRect(0F, 0F, mWidth.toFloat(), mWidth.toFloat(), paint)
        return bm
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val saveLayer =
            canvas.saveLayer(0F, 0F, width.toFloat(), height.toFloat(), null, Canvas.ALL_SAVE_FLAG)
        // 先画出圆形图像
        canvas.drawBitmap(mDstBitmap, 0F, 0F, mPaint)
        // 设置xfermode
        mPaint.xfermode = mXfermode
        // 再以圆心为左上角点画出矩形
        canvas.drawBitmap(mSrcBitmap, mWidth / 2F, mHeight / 2F, mPaint)
        // 清空xfermode
        mPaint.xfermode = null
        canvas.restoreToCount(saveLayer)
    }
}