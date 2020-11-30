package com.quyunshuo.drawingbasis.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.util.AttributeSet
import android.view.View

/**
 * 合并两个矩形
 *
 * @author Qu Yunshuo
 * @since 11/30/20 10:20 PM
 */
class RectUnionView : View {

    private val mPaint = Paint().apply {
        color = Color.BLUE
        strokeWidth = 10F
        style = Paint.Style.STROKE
    }

    private val mRect1 = Rect(100, 100, 200, 200)
    private val mRect2 = Rect(500, 500, 600, 600)

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
        // 分别画出源矩形
        canvas.drawRect(mRect1, mPaint)
        canvas.drawRect(mRect2, mPaint)

        // 合并两个矩形
        mRect1.union(mRect2)
        // 绘制出合并后的Rect
        mPaint.color = Color.DKGRAY
        canvas.drawRect(mRect1, mPaint)
    }
}