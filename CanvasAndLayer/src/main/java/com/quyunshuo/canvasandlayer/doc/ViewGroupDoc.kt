package com.quyunshuo.canvasandlayer.doc

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.view.ViewGroup

/**
 * ViewGroup
 *
 * @author Qu Yunshuo
 * @since 12/26/20 9:44 PM
 */
class ViewGroupDoc : ViewGroup {
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

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {

    }

    /**
     * ## 用于绘制视图自身
     * 无论是View还是ViewGroup 这两个函数的调用顺序都是 onDraw() -> dispatchDraw()
     * 当有背景时会调用该函数 否则会直接略过
     * @param canvas Canvas View中的Canvas对象，利用这个Canvas对象绘图，效果会直接反映在View中
     */
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
    }

    /**
     * ## 用于绘制子视图
     * 无论是View还是ViewGroup 这两个函数的调用顺序都是 onDraw() -> dispatchDraw()
     * @param canvas Canvas View中的Canvas对象，利用这个Canvas对象绘图，效果会直接反映在View中
     */
    override fun dispatchDraw(canvas: Canvas?) {
        super.dispatchDraw(canvas)
    }
}