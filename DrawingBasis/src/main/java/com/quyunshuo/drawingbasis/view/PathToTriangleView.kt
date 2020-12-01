package com.quyunshuo.drawingbasis.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View

/**
 * 利用Path绘制一个三角形
 *
 * @author Qu Yunshuo
 * @since 12/1/20 7:18 PM
 */
class PathToTriangleView : View {

    private val mPaint = Paint().apply {
        color = Color.RED
        strokeWidth = 5F
        style = Paint.Style.STROKE
    }

    private val mPath = Path().apply {
        moveTo(10F, 10F)    // 设置起始点
        lineTo(10F, 100F)   // 第一条直线的终点，也是第二条直线的起始点
        lineTo(300F, 100F)  // 第二条直线的终点
        close()                   // 闭环
    }

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
        // 绘制一条路径
        canvas.drawPath(mPath, mPaint)
    }
}