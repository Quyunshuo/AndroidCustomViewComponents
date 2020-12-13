package com.quyunshuo.advanceddrawing.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View

/**
 * 示例贝塞尔曲线
 *
 * @author Qu Yunshuo
 * @since 12/13/20 9:59 PM
 */
class BesselView : View {

    /**
     * 用于绘制线的画笔
     */
    private val mPaint = Paint().apply {
        color = Color.BLACK
        style = Paint.Style.STROKE
        strokeWidth = 5F
    }

    /**
     * 用于绘制点画笔
     */
    private val mPointPaint = Paint().apply {
        color = Color.GREEN
        style = Paint.Style.FILL
        strokeWidth = 10F
    }

    private val mPath = Path()

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
        // 绘制 不使用quadTo()函数
        mPath.moveTo(20F, 200F)
        mPath.lineTo(80F, 100F)
        mPath.lineTo(140F, 280F)
        mPath.lineTo(200F, 150F)
        mPath.lineTo(260F, 200F)
        // 绘制出各点
        canvas.drawPoints(
            floatArrayOf(20F, 200F, 80F, 100F, 140F, 280F, 200F, 150F, 260F, 200F),
            mPointPaint
        )
        canvas.drawPath(mPath, mPaint)

        // 绘制 使用quadTo()函数 最后使用了lineTo讲最后半段线连接起来
        // quadTo(控制点坐标,终点坐标) 控制点也就是上一个点的坐标，终点是这条线段的终点 计算公式为 x=(上一个点X坐标 + 当前点X坐标)/2 ，y=(上一个点Y坐标 +当前点Y坐标)/2
        mPath.rewind()
        mPath.moveTo(20F, 400F)
        mPath.quadTo(20F, 400F, (80F + 20F) / 2, (300F + 400F) / 2)
        mPath.quadTo(80F, 300F, (140F + 80F) / 2, (480F + 300F) / 2)
        mPath.quadTo(140F, 480F, (200F + 140F) / 2, (350F + 480F) / 2)
        mPath.quadTo(200F, 350F, (260F + 200F) / 2, (400F + 350F) / 2)
        mPath.lineTo(260F, 400F)
        // 绘制出各点
        canvas.drawPoints(
            floatArrayOf(20F, 400F, 80F, 300F, 140F, 480F, 200F, 350F, 260F, 400F),
            mPointPaint
        )
        canvas.drawPath(mPath, mPaint)
    }
}