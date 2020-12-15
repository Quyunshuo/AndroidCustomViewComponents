package com.quyunshuo.advanceddrawing.view

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View
import com.quyunshuo.advanceddrawing.R

/**
 * 阴影View
 *
 * @author Qu Yunshuo
 * @since 12/15/20 10:10 PM
 */
class ShadowLayerView : View {

    private val mPaint = Paint().apply {
        color = Color.BLACK
        textSize = 30F
    }

    /**
     * 是否显示阴影
     */
    private var mSetShadow = true

    private var mBitmap: Bitmap

    constructor(context: Context?) : super(context) {
        // 关闭硬件加速
        setLayerType(LAYER_TYPE_SOFTWARE, null)
        mBitmap = BitmapFactory.decodeResource(resources, R.drawable.android_kotlin)
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        setLayerType(LAYER_TYPE_SOFTWARE, null)
        mBitmap = BitmapFactory.decodeResource(resources, R.drawable.android_kotlin)
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        setLayerType(LAYER_TYPE_SOFTWARE, null)
        mBitmap = BitmapFactory.decodeResource(resources, R.drawable.android_kotlin)
    }

    constructor(
        context: Context?,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int
    ) : super(context, attrs, defStyleAttr, defStyleRes) {
        setLayerType(LAYER_TYPE_SOFTWARE, null)
        mBitmap = BitmapFactory.decodeResource(resources, R.drawable.android_kotlin)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        if (mSetShadow) {
            // 设置阴影
            mPaint.setShadowLayer(15F, 10F, 10F, Color.GRAY)
        } else {
            // 清除阴影
            mPaint.clearShadowLayer()
        }
        canvas.drawColor(Color.WHITE)
        canvas.drawText("Quyunshuo", 100F, 100F, mPaint)
        canvas.drawCircle(400F, 100F, 50F, mPaint)
        // 图片的阴影是不受阴影画笔颜色控制的，它是一张图片的副本
        canvas.drawBitmap(
            mBitmap,
            null,
            Rect(600, 50, 600 + mBitmap.width, 50 + mBitmap.height),
            mPaint
        )
    }

    /**
     * 设置是否显示阴影
     * @param showShadow Boolean 是否显示
     */
    fun setShadow(showShadow: Boolean) {
        mSetShadow = showShadow
        postInvalidate()
    }
}