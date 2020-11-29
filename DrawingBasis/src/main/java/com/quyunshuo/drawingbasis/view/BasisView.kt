package com.quyunshuo.drawingbasis.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

/**
 * 自定义View 画笔和画布初识
 *
 * @author Qu Yunshuo
 * @since 11/29/20 10:01 PM
 */
class BasisView : View {

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

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        val paint = Paint()                 // 创建画笔实例
        paint.color = Color.RED             // 设置画笔颜色 - 红色
        paint.style = Paint.Style.STROKE    // 设置填充样式 - 描边
        paint.strokeWidth = 50F             // 设置画笔宽度 - 50px

        canvas?.drawCircle(190F, 200F, 150F, paint) // 画圆
    }
}