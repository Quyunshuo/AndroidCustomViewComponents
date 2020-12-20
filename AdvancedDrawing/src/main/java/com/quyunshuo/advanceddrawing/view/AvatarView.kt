package com.quyunshuo.advanceddrawing.view

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View
import com.quyunshuo.advanceddrawing.R

/**
 * 生成不规则头像
 *
 * @author Qu Yunshuo
 * @since 12/20/20 8:34 PM
 */
class AvatarView : View {

    private val mPaint = Paint()
    private val mBitmap by lazy {
        BitmapFactory.decodeResource(resources, R.drawable.img)
    }
    private val mBitmapShader by lazy {
        BitmapShader(mBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP)
    }

    private val mMatrix = Matrix()

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    constructor(
        context: Context?,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int
    ) : super(context, attrs, defStyleAttr, defStyleRes)

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        // 缩放比例
        val scale = width / mBitmap.width.toFloat()
        mMatrix.setScale(scale, scale)
        mBitmapShader.setLocalMatrix(mMatrix)
        mPaint.shader = mBitmapShader

        val half = width / 2F
        canvas.drawCircle(half, half, width / 2F, mPaint)
    }
}