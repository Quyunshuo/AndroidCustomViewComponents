package com.quyunshuo.androidcanvas.doc

import android.graphics.Paint
import android.graphics.Rect
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.Shape

/**
 * ShapeDrawable
 *
 * @author Qu Yunshuo
 * @since 12/28/20 8:13 PM
 */
class ShapeDrawableDoc : ShapeDrawable {
    constructor() : super()
    constructor(s: Shape?) : super(s)

    /**
     * ## 用来指定当前ShapeDrawable在当前控件中的显示位置
     * @param bounds Rect
     */
    override fun setBounds(bounds: Rect) {
        super.setBounds(bounds)
    }

    /**
     * ## 用来指定当前ShapeDrawable在当前控件中的显示位置
     * @param left Int
     * @param top Int
     * @param right Int
     * @param bottom Int
     */
    override fun setBounds(left: Int, top: Int, right: Int, bottom: Int) {
        super.setBounds(left, top, right, bottom)
    }

    /**
     * Shade
     * @return Paint
     */
    override fun getPaint(): Paint {
        return super.getPaint()
    }
}