package com.quyunshuo.mixedmode.view

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View
import com.quyunshuo.mixedmode.R

/**
 * 使用混合模式的[PorterDuff.Mode.MULTIPLY] 正片叠底模式来实现推特的icon
 *
 * @author Qu Yunshuo
 * @since 12/26/20 4:58 PM
 */
class TwitterView : View {

    private val mPaint = Paint()

    private val mPorterDuffXfermode = PorterDuffXfermode(PorterDuff.Mode.MULTIPLY)

    /**
     * 目标图像
     */
    private val mBitmapDST by lazy {
        BitmapFactory.decodeResource(resources, R.drawable.twiter_bg, null)
    }

    /**
     * 源图像
     */
    private val mBitmapSRC by lazy {
        BitmapFactory.decodeResource(resources, R.drawable.twiter_light, null)
    }

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

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.save()

        // 画出目标图像
        canvas.drawBitmap(mBitmapDST, 0F, 0F, mPaint)
        // 设置混合模式
        mPaint.xfermode = mPorterDuffXfermode
        // 画出源图像与目标图像结合
        canvas.drawBitmap(mBitmapSRC, 0F, 0F, mPaint)
        // 清除混合模式
        mPaint.xfermode = null

        canvas.restore()
    }
}