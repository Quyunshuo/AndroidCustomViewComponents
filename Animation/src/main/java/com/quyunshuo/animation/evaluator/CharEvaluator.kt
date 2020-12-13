package com.quyunshuo.animation.evaluator

import android.animation.TypeEvaluator
import android.util.Log

/**
 * 自定义的Evaluator 用于转换Char类型
 *
 * @author Qu Yunshuo
 * @since 12/13/20 1:53 PM
 */
class CharEvaluator : TypeEvaluator<Char> {

    /**
     * 将进度值转换为Char类型
     * 在ASCII码表中，每个字符都有数字与之对应，字母A~Z之间所有的字母对应的数字区间为65-90
     * 而且程序中我们能将数字强转为对应的字符
     * 我们利用A~Z字符在ASCII码表中对应数字是连续且递增的原理，先求出对应字符的数字，然后在转为对应的字符
     * @param fraction Float 进度
     * @param startValue Char 开始字符
     * @param endValue Char 结束字符
     * @return Char 当前进度对应的字符
     */
    override fun evaluate(fraction: Float, startValue: Char, endValue: Char): Char {
        val startInt = startValue.toInt()
        val endInt = endValue.toInt()
        val curInt = (startInt + fraction * (endInt - startInt)).toInt()
        Log.d("qqq", "evaluate: ${curInt.toChar()}")
        return curInt.toChar()
    }
}