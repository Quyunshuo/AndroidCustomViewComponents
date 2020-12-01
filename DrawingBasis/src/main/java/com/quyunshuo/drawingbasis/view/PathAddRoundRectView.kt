package com.quyunshuo.drawingbasis.view

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View

/**
 * 添加圆角矩形路径示例View
 *
 * @author Qu Yunshuo
 * @since 12/1/20 7:46 PM
 */
class PathAddRoundRectView : View {

    private val mPaint = Paint().apply {
        color = Color.RED
        strokeWidth = 5F
        style = Paint.Style.STROKE
    }

    private val mPath = Path()
    private val mRect1 = RectF(50F, 50F, 240F, 200F)

    private val mRect2 = RectF(290F, 50F, 480F, 200F)

    private val mRadii = floatArrayOf(10F, 15F, 20F, 25F, 30F, 35F, 40F, 45F)

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
        mPath.addRoundRect(mRect1, 10F, 15F, Path.Direction.CCW)  // 统一圆角度数
        mPath.addRoundRect(mRect2, mRadii, Path.Direction.CCW)           // 指定各个角的度数
        canvas.drawPath(mPath, mPaint)
    }
}