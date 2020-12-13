package com.quyunshuo.animation.activity

import android.animation.ArgbEvaluator
import android.animation.ValueAnimator
import android.view.animation.AccelerateInterpolator
import com.quyunshuo.animation.databinding.ActivityMainBinding
import com.quyunshuo.animation.evaluator.CharEvaluator
import com.quyunshuo.animation.evaluator.MyEvaluator
import com.quyunshuo.animation.interpolator.MyInterpolator
import com.quyunshuo.base.BaseActivity

/**
 * 动画
 *
 * @author Qu Yunshuo
 * @since 12/8/20 10:35 PM
 */
class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun ActivityMainBinding.initView() {
        mBtn.setOnClickListener { startAnim() }
        mArgbBtn.setOnClickListener { argbEvaluatorTest() }
        mObjectBtn.setOnClickListener { ofObjectTest() }
    }

    /**
     * 使用自定义的倒序进行的插值器和自定义的IntEvaluator
     */
    private fun startAnim() {
        val animator = ValueAnimator.ofInt(0, 500).apply {
            addUpdateListener {
                val value = it.animatedValue as Int
                mBinding.mBtn.layout(
                    mBinding.mBtn.left,
                    value,
                    mBinding.mBtn.right,
                    value + mBinding.mBtn.height
                )
                duration = 3000
            }
            // 使用自定义的插值器
            interpolator = MyInterpolator()
            // 使用自定义的Evaluator
            setEvaluator(MyEvaluator())
        }
        animator.start()
    }

    /**
     * 演示ArgbEvaluator的用法
     */
    private fun argbEvaluatorTest() {
        // 定义一个颜色从黄色变为蓝色的ValueAnimator
        val animator = ValueAnimator.ofInt(0xffffff00.toInt(), 0xff0000ff.toInt()).apply {
            addUpdateListener {
                // animatedValue的值即为创建ValueAnimator的两个颜色之间的过渡值
                val value = it.animatedValue as Int
                mBinding.mArgbBtn.setBackgroundColor(value)
            }
            duration = 2000
            setEvaluator(ArgbEvaluator())
        }
        animator.start()
    }

    /**
     * 演示ofObject()函数
     */
    private fun ofObjectTest() {
        // 使用ofObject()创建一个ValueAnimator
        // 对Char类型的参数应用动画，利用动画自动从字母A变化到字母Z
        val animator = ValueAnimator.ofObject(CharEvaluator(), 'A', 'Z').apply {
            addUpdateListener {
                val c = it.animatedValue as Char
                mBinding.mObjectBtn.text = c.toString()
            }
            duration = 6000L
            // 加速插值器
            interpolator = AccelerateInterpolator()
        }
        animator.start()
    }
}