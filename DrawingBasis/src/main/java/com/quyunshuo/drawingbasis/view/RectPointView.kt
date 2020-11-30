package com.quyunshuo.drawingbasis.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View

/**
 * 判断手指点击位置是是否在区域内的View
 *
 * @author Qu Yunshuo
 * @since 11/30/20 7:20 PM
 */
class RectPointView : View {

    private var mX: Int = 0

    private var mY: Int = 0

    private val mPaint = Paint().apply {
        style = Paint.Style.STROKE
    }

    private val mRect = Rect(100, 10, 300, 100)

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int)
            : super(context, attrs, defStyleAttr)

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int)
            : super(context, attrs, defStyleAttr, defStyleRes)

    /**
     * 拦截手指的触屏事件
     * @param event MotionEvent
     * @return Boolean
     */
    override fun onTouchEvent(event: MotionEvent): Boolean {
        mX = event.x.toInt()
        mY = event.y.toInt()
        if (event.action == MotionEvent.ACTION_DOWN) {
            // 重绘
            invalidate()
            return true
        } else if (event.action == MotionEvent.ACTION_UP) {
            mX = -1
            mY = -1
        }
        invalidate()
        return super.onTouchEvent(event)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        mPaint.color = if (mRect.contains(mX, mY)) Color.RED else Color.GREEN
        canvas.drawRect(mRect, mPaint)
    }
}