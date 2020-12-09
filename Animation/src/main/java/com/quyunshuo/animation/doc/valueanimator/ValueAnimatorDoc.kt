package com.quyunshuo.animation.doc.valueanimator

import android.animation.ValueAnimator
import android.util.Log

/**
 * 属性动画中的ValueAnimator
 * ValueAnimator是针对值的，不会对控件执行任何操作
 * 我们可以通过给它设定从哪个值运动到哪个值，通过监听这些值的渐变过程来自己操作控件
 *
 * @author Qu Yunshuo
 * @since 12/9/20 9:41 PM
 */
class ValueAnimatorDoc : ValueAnimator() {

    /**
     * ValueAnimator的基本使用
     */
    private fun startValueAnim() {
        // 创建一个值从0到400的ValueAnimator
        val valueAnimator = ValueAnimator.ofInt(400)
        // 设置动画时长为1000毫秒
        valueAnimator.duration = 1000
        // 添加ValueAnimator更新监听
        valueAnimator.addUpdateListener {
            // 获取ValueAnimator更新时的当前值
            val value = it.animatedValue as Int
            Log.d("qqq", "valueAnim: $value")
        }
        // 开始动画
        valueAnimator.start()
    }

    /**
     * ## 用于创建一个ValueAnimator
     *
     * @param values IntArray 动画时的变化范围 比如ofInt(2,90,45)，就是从2->90->45，值越多，动画就越复杂
     */
    private fun ofInt(vararg values: Int) {
        ValueAnimator.ofInt()
    }

    /**
     * ## 同ofInt()
     * @param values FloatArray
     */
    private fun ofFloat(vararg values: Float) {
        ValueAnimator.ofFloat()
    }

    /**
     * ## 用于设置动画时长，单位是毫秒
     * @param duration Long 动画时长
     * @return ValueAnimator
     */
    override fun setDuration(duration: Long): ValueAnimator {
        return super.setDuration(duration)
    }

    /**
     * ## 用于获取ValueAnimator在运动时当前运动点的值
     * @return Any 运动点的值 类型取决于创建动画时设置的值，需要强转
     */
    override fun getAnimatedValue(): Any {
        return super.getAnimatedValue()
    }

    /**
     * ## 开始动画
     */
    override fun start() {
        super.start()
    }

    /**
     * ## 用于设置循环次数
     * @param value Int 循环次数 设置为[ValueAnimator.INFINITE]时表示无限循环，设置为0时表示不循环
     */
    override fun setRepeatCount(value: Int) {
        super.setRepeatCount(INFINITE)
    }

    /**
     * ## 用于设置循环模式
     * @param value Int 取值有[ValueAnimator.RESTART]正序重新开始和[ValueAnimator.REVERSE]倒序重新开始
     */
    override fun setRepeatMode(value: Int) {
        super.setRepeatMode(value)
    }

    /**
     * ## 取消动画
     */
    override fun cancel() {
        super.cancel()
    }

    /**
     * ## 添加更新监听
     * 监听动画过程中值的实时变化
     * @param listener AnimatorUpdateListener
     */
    override fun addUpdateListener(listener: AnimatorUpdateListener?) {
        super.addUpdateListener(listener)
    }

    /**
     * ## 添加动画状态监听
     * 监听动画变化时的4个状态
     * @param listener AnimatorListener 主要监听四个状态，start、end、cancel、repeat
     */
    override fun addListener(listener: AnimatorListener?) {
        super.addListener(listener)
    }

    /**
     * ## 用于移除指定AnimatorUpdateListener
     * @param listener AnimatorUpdateListener
     */
    override fun removeUpdateListener(listener: AnimatorUpdateListener?) {
        super.removeUpdateListener(listener)
    }

    /**
     * ## 用于移除全部AnimatorUpdateListener
     */
    override fun removeAllUpdateListeners() {
        super.removeAllUpdateListeners()
    }

    /**
     * ## 用于移除指定AnimatorListener
     * @param listener AnimatorListener
     */
    override fun removeListener(listener: AnimatorListener?) {
        super.removeListener(listener)
    }

    /**
     * ## 用于移除全部AnimatorListener
     */
    override fun removeAllListeners() {
        super.removeAllListeners()
    }

    /**
     * ## 用于设置延时多久开始
     * @param startDelay Long 延时时间 单位是毫秒
     */
    override fun setStartDelay(startDelay: Long) {
        super.setStartDelay(startDelay)
    }

    /**
     * ## 用于克隆一个ValueAnimator实例，包括它所有的设置以及所有对监听器代码的处理
     * @return ValueAnimator
     */
    override fun clone(): ValueAnimator {
        return super.clone()
    }
}