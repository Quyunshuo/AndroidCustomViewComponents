package com.quyunshuo.advanceddrawing.view

import android.animation.ValueAnimator
import android.content.Context
import android.graphics.Canvas
import android.graphics.LinearGradient
import android.graphics.Matrix
import android.graphics.Shader
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

/**
 * 流光文字View
 *
 * @author Qu Yunshuo
 * @since 12/20/20 9:14 PM
 */
class ShimmerTextView : AppCompatTextView {

    private var mDx = 0F

    private val mPaint by lazy { paint }

    private lateinit var mLinearGradient: LinearGradient

    private val mMatrix = Matrix()

    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init()
    }

    private fun init() {
        // 测量文字的长度
        val length = mPaint.measureText(text.toString())
        createAnim(length)
        createLinearGradient(length)
    }

    /**
     * 创建ValueAnimator
     * @param length Float 文字长度
     */
    private fun createAnim(length: Float) {
        val animator = ValueAnimator.ofFloat(0F, 2 * length).apply {
            addUpdateListener {
                mDx = it.animatedValue as Float
                postInvalidate()
            }
            repeatMode = ValueAnimator.RESTART
            repeatCount = ValueAnimator.INFINITE
            duration = 2000L
        }
        animator.start()
    }

    /**
     * 创建线性渐变效果
     * 渐变点从(-[length],0)到(0,0),渐变色采用三色渐变，从文字颜色到绿色再到文字颜色
     * @param length Float 文字长度
     */
    private fun createLinearGradient(length: Float) {
        mLinearGradient = LinearGradient(
            -length, 0F, 0F, 0F,
            intArrayOf(currentTextColor, 0xff00ff00.toInt(), currentTextColor),
            floatArrayOf(0F, 0.5F, 1F),
            Shader.TileMode.CLAMP
        )
    }

    /**
     * 由于此处的onDraw是父类方法，所以我们要在调用父类方法之前设置Shader，又由于Shader需要设置给绘制文字的画笔才有效
     * 所以画笔使用的是父类的画笔，通过getPaint()获取的
     * @param canvas Canvas
     */
    override fun onDraw(canvas: Canvas) {
        mMatrix.setTranslate(mDx, 0F)
        mLinearGradient.setLocalMatrix(mMatrix)
        mPaint.shader = mLinearGradient
        super.onDraw(canvas)
    }
}