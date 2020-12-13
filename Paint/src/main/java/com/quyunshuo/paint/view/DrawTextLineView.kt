package com.quyunshuo.paint.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

/**
 * 绘制文字的四线格
 *
 * @author Qu Yunshuo
 * @since 12/13/20 3:34 PM
 */
class DrawTextLineView : View {

    /**
     * 画笔
     */
    private val mPaint = Paint().apply {
        color = Color.BLACK
        isAntiAlias = true
        textSize = 120F         // px
        textAlign = Paint.Align.LEFT
    }

    /**
     * 基线的X坐标
     */
    private val mBaseLineX = 50F

    /**
     * 基线的Y坐标
     */
    private val mBaseLineY = 200F

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
        // 先将文字绘制出来
        canvas.drawText("Hello,World", mBaseLineX, mBaseLineY, mPaint)
        // 然后计算各线的Y坐标
        val fontMetrics = mPaint.fontMetrics
        val ascentY = mBaseLineY + fontMetrics.ascent
        val descentY = mBaseLineY + fontMetrics.descent
        val topY = mBaseLineY + fontMetrics.top
        val bottomY = mBaseLineY + fontMetrics.bottom
        // 利用计算出的各线的Y坐标，将这些线绘制出来
        mPaint.color = Color.BLUE
        canvas.drawLine(mBaseLineX, mBaseLineY, 1000F, mBaseLineY + 1, mPaint)
        mPaint.color = Color.RED
        canvas.drawLine(mBaseLineX, topY, 1000F, topY + 1, mPaint)
        mPaint.color = Color.GREEN
        canvas.drawLine(mBaseLineX, ascentY, 1000F, ascentY + 1, mPaint)
        mPaint.color = Color.GREEN
        canvas.drawLine(mBaseLineX, descentY, 1000F, descentY + 1, mPaint)
        mPaint.color = Color.RED
        canvas.drawLine(mBaseLineX, bottomY, 1000F, bottomY + 1, mPaint)
    }
}