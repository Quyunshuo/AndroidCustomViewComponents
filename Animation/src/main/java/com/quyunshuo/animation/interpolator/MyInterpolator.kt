package com.quyunshuo.animation.interpolator

import android.animation.TimeInterpolator

/**
 * 自定义的插值器
 *
 * @author Qu Yunshuo
 * @since 12/11/20 10:01 PM
 */
class MyInterpolator : TimeInterpolator {

    /**
     * TimeInterpolator中的唯一方法
     * @param input Float 代表当前动画的进度 取值是0-1的Float值
     * @return Float 表示动画的当前数值进度
     */
    override fun getInterpolation(input: Float): Float {
        // 相当于倒序进行
        return 1 - input
    }
}