package com.quyunshuo.androidcanvas.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Path
import android.graphics.Rect
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.OvalShape
import android.graphics.drawable.shapes.PathShape
import android.graphics.drawable.shapes.RectShape
import android.util.AttributeSet
import android.view.View

/**
 * PathShape
 *
 * @author Qu Yunshuo
 * @since 12/28/20 7:53 PM
 */
class PathShapeView : View {

    private val mShapeDrawable by lazy {
        val path = Path()
        path.moveTo(0F, 0F)
        path.lineTo(100F, 0F)
        path.lineTo(100F, 100F)
        path.lineTo(0F, 100F)
        path.close()

        // 生成一个ShapeDrawable 将宽度设置为100份 高度设置为200份 path的数值也是基于这个份数的  不再是普通的px
        ShapeDrawable(PathShape(path, 100F, 200F)).apply {
            // 指定ShapeDrawable在当前控件中的显示位置
            bounds = Rect(0, 0, 250, 150)
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