package com.quyunshuo.drawingbasis.view

import android.content.Context
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View
import com.quyunshuo.drawingbasis.R

/**
 * 圆形头像View 用于演示画布的裁切
 *
 * @author Qu Yunshuo
 * @since 12/6/20 5:26 PM
 */
class CustomCircleView(context: Context, attrs: AttributeSet) : View(context, attrs) {

    private val mBitmap = BitmapFactory.decodeResource(resources, R.drawable.android_kotlin)

    private val mPaint = Paint()

    private val mPath = Path().apply {
        val width = mBitmap.width.toFloat()
        val height = mBitmap.height.toFloat()
        // 添加圆形路径
        addCircle(width / 2, height / 2, width / 2, Path.Direction.CCW)
    }

    init {
        // 禁用硬件加速功能
        setLayerType(LAYER_TYPE_SOFTWARE, null)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        // 先保存画布的状态
        canvas.save()
        // 将画布裁切成圆形
        canvas.clipPath(mPath)
        // 将位图画上去
        canvas.drawBitmap(mBitmap, 0F, 0F, mPaint)
        // 将画布复原
        // 由于我们后续没有对画布进行其他的操作  所以这里的restore()也可以不调用
        canvas.restore()
    }
}