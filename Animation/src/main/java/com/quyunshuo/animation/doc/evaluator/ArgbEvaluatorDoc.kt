package com.quyunshuo.animation.doc.evaluator

import android.animation.ArgbEvaluator

/**
 * 特殊的Evaluator-ArgbEvaluator
 * ArgbEvaluator是用来做颜色过渡的
 *
 * @author Qu Yunshuo
 * @since 12/11/20 10:38 PM
 */
class ArgbEvaluatorDoc : ArgbEvaluator() {

    /**
     * ArgbEvaluator的使用方式见[com.quyunshuo.animation.activity.MainActivity]
     * 需要注意的是必须使用[android.animation.ValueAnimator.ofInt]函数定义颜色的取值范围
     * 并且颜色必须包含A,R,G,B四个值
     */
    private fun test() {}
}