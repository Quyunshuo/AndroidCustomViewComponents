package com.quyunshuo.androidcanvas.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Rect
import android.graphics.RectF
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.OvalShape
import android.graphics.drawable.shapes.RectShape
import android.graphics.drawable.shapes.RoundRectShape
import android.util.AttributeSet
import android.view.View

/**
 * RoundRectShape
 *
 * @author Qu Yunshuo
 * @since 12/27/20 10:43 PM
 */
class RoundRectShapeView : View {

    private val mShapeDrawable by lazy {
        val outerR = floatArrayOf(12F, 12F, 12F, 12F, 0F, 0F, 0F, 0F)
        val inset = RectF(6F, 6F, 6F, 6F)
        val innerR = floatArrayOf(50F, 12F, 0F, 0F, 12F, 50F, 0F, 0F)
        // 生成一个ShapeDrawable 并且通过RoundRectShape设置为圆角镂空矩形
        ShapeDrawable(RoundRectShape(outerR, inset, innerR)).apply {
            // 指定ShapeDrawable在当前控件中的显示位置及椭圆
            bounds = Rect(50, 50, 200, 100)
            // 拿到自带的画笔
            paint.color = Color.BLACK
        }
    }

    constructor(context: Context?) : super(context) {
        setLayerType(LAYER_TYPE_SOFTWARE, null)
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        setLayerType(LAYER_TYPE_SOFTWARE, null)
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        setLayerType(LAYER_TYPE_SOFTWARE, null)
    }

    constructor(
        context: Context?,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int
    ) : super(context, attrs, defStyleAttr, defStyleRes) {
        setLayerType(LAYER_TYPE_SOFTWARE, null)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        mShapeDrawable.draw(canvas)
    }
}