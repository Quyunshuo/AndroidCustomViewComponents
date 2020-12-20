package com.quyunshuo.advanceddrawing.view

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import com.quyunshuo.advanceddrawing.R

/**
 * 望远镜效果View
 *
 * @author Qu Yunshuo
 * @since 12/20/20 3:48 PM
 */
class TelescopeView : View {

    private val mBitmap by lazy {
        BitmapFactory.decodeResource(resources, R.drawable.android_kotlin)
    }

    /**
     * 透明背景Bitmap
     */
    private val mBitmapBg by lazy { Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888) }

    private val mCanvasBg by lazy { Canvas(mBitmapBg) }

    private val mPaint by lazy { Paint().apply { isAntiAlias = true } }

    private val bitmapShader by lazy {
        BitmapShader(mBitmapBg, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT)
    }

    private var isDraw = false

    private var mDx: Float = -1F
    private var mDy: Float = -1F

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

    override fun onTouchEvent(event: MotionEvent): Boolean {
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                mDx = event.x
                mDy = event.y
                invalidate()
                return true
            }
            MotionEvent.ACTION_MOVE -> {
                mDx = event.x
                mDy = event.y
            }
            MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                mDx = -1F
                mDy = -1F
            }
        }
        invalidate()
        return super.onTouchEvent(event)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        if (!isDraw) {
            isDraw = true
            mCanvasBg.drawBitmap(mBitmap, null, Rect(0, 0, width, height), mPaint)
            mPaint.shader = bitmapShader
        }
        if (mDx != -1F && mDy != -1F) {
            canvas.drawCircle(mDx, mDy, 150F, mPaint)
        }
    }
}