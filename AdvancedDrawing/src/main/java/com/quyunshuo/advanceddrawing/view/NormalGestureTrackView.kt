package com.quyunshuo.advanceddrawing.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View

/**
 * 捕捉手势轨迹（二阶贝塞尔曲线）
 *
 * @author Qu Yunshuo
 * @since 12/13/20 8:36 PM
 */
class NormalGestureTrackView : View {

    private val mPaint = Paint().apply {
        color = Color.BLACK
        style = Paint.Style.STROKE
        strokeWidth = 5F
    }

    private val mPath = Path()

    private var mPreX = 0F

    private var mPreY = 0F

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

    /**
     * 重写onTouchEvent()，捕获手势轨迹
     */
    override fun onTouchEvent(event: MotionEvent): Boolean {
        when (event.action) {
            // 按下手势
            MotionEvent.ACTION_DOWN -> {
                // 设置直线的起始点
                mPath.moveTo(event.x, event.y)
                // 保存此次的点，供使用贝塞尔曲线绘制下一个点时使用
                mPreX = event.x
                mPreY = event.y
                // 返回true表示当前控件已经消费了下按动作，之后的ACTION_MOVE、ACTION_UP动作也会继续传递到当前控件中
                // 如果返回false那么后续的ACTION_MOVE、ACTION_UP动作就不会再传递到这个控件中
                return true
            }
            // 移动手势
            MotionEvent.ACTION_MOVE -> {
                // 计算控制点
                val endX = (mPreX + event.x) / 2
                val endY = (mPreY + event.y) / 2
                // 使用二阶贝塞尔曲线函数quadTo()
                mPath.quadTo(mPreX, mPreY, endX, endY)
                // 记录本次的点
                mPreX = event.x
                mPreY = event.y
                // 重绘
                invalidate()
            }
        }
        return super.onTouchEvent(event)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.drawColor(Color.WHITE)
        // 绘制手势路径
        canvas.drawPath(mPath, mPaint)
    }
}