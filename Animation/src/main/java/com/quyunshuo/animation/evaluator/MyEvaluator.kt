package com.quyunshuo.animation.evaluator

import android.animation.TypeEvaluator

/**
 * 自定义的Evaluator
 * 该Evaluator实现与[android.animation.IntEvaluator]一致
 *
 * @author Qu Yunshuo
 * @since 12/11/20 10:20 PM
 */
class MyEvaluator : TypeEvaluator<Int> {

    /**
     * TypeEvaluator<T>的唯一函数，也是进行数值转换的地方
     * @param fraction Float 插值器中的返回值，表示当前动画的数值进度，以百分制小数表示
     * @param startValue Int 对应ofInt(start:Int,end:Int)函数中 start的值
     * @param endValue Int 对应ofInt(start:Int,end:Int)函数中 end的值
     * @return Int 当前数值进度所对应的具体数值，这个值就是在[android.animation.ValueAnimator.AnimatorUpdateListener]监听器中得到的值
     */
    override fun evaluate(fraction: Float, startValue: Int, endValue: Int): Int {
        return (startValue + fraction * (endValue - startValue)).toInt()
    }
}