package com.quyunshuo.androidcanvas.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Rect
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.ArcShape
import android.graphics.drawable.shapes.OvalShape
import android.graphics.drawable.shapes.RectShape
import android.util.AttributeSet
import android.view.View

/**
 * ArcShape
 *
 * @author Qu Yunshuo
 * @since 12/27/20 10:43 PM
 */
class ArcShapeView : View {

    private val mShapeDrawable by lazy {
        // 生成一个ShapeDrawable 并且通过ArcShape设置弧形
        ShapeDrawable(ArcShape(0F, 300F)).apply {
            // 指定ShapeDrawable在当前控件中的显示位置
            bounds = Rect(50, 50, 200, 100)
            // 拿到自带的画笔 设置为黄色 将整个Drawable填充为黄色
            paint.color = Color.YELLOW
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