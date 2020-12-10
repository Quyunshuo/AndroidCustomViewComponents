package com.quyunshuo.animation.view

import android.animation.Animator
import android.animation.ValueAnimator
import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.animation.AccelerateDecelerateInterpolator
import androidx.appcompat.widget.AppCompatImageView
import com.quyunshuo.animation.R

/**
 * 自定义的 Loading加载View
 *
 * @author Qu Yunshuo
 * @since 12/10/20 10:13 PM
 */
class LoadingImageView : AppCompatImageView {

    private var mTop: Int = 0

    /**
     * 当前图片索引
     */
    private var mCurImgIndex = 0

    /**
     * 图片总张数
     */
    private val mImageCount = 3

    constructor(context: Context) : super(context) {
        initView()
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        initView()
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        initView()
    }

    private fun initView() {
        val animator = ValueAnimator.ofInt(0, 100, 0).apply {
            // 重复模式 正序重新开始
            repeatMode = ValueAnimator.RESTART
            // 重复次数 无限
            repeatCount = ValueAnimator.INFINITE
            // 持续时间
            duration = 1000
            // 插值器 加速减速插值器
            interpolator = AccelerateDecelerateInterpolator()
            addUpdateListener {
                val dx = it.animatedValue as Int
                // 设置控件的top
                // setTop和getTop函数所得到的和所设置的坐标都是相对于父控件的坐标位置
                top = mTop - dx
            }
            addListener(object : Animator.AnimatorListener {
                override fun onAnimationStart(animation: Animator?) {
                    setImageResource(R.drawable.pic_1)
                }

                override fun onAnimationEnd(animation: Animator?) {
                }

                override fun onAnimationCancel(animation: Animator?) {
                }

                override fun onAnimationRepeat(animation: Animator?) {
                    mCurImgIndex++
                    when (mCurImgIndex % mImageCount) {
                        0 -> setImageResource(R.drawable.pic_1)
                        1 -> setImageResource(R.drawable.pic_2)
                        2 -> setImageResource(R.drawable.pic_3)
                    }
                }
            })
        }
        animator.start()
        Log.d("qqq", "initView: ")
    }

    /**
     * 每次布局控件时，都会调用该方法，我们重写此方法来获取View的位置数据
     * @param changed Boolean
     * @param left Int
     * @param top Int
     * @param right Int
     * @param bottom Int
     */
    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
        mTop = top
        Log.d("qqq", "onLayout: ")
    }
}