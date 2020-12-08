package com.quyunshuo.animation.doc.interpolator

import android.view.animation.AnticipateOvershootInterpolator

/**
 * 是AnticipateInterpolator和OvershootInterpolator的合体
 * 在动画开始时向前移动一段距离，在动画结束时向后偏移一段距离
 *
 * @author Qu Yunshuo
 * @since 12/8/20 11:01 PM
 */
class AnticipateOvershootInterpolatorDoc : AnticipateOvershootInterpolator {

    /**
     * 该构造函数可以统一设置开始和结束的偏移量
     * @param tension Float 张力值
     * @constructor
     */
    constructor(tension: Float) : super(tension)

    /**
     * 该构造函数可以设置额外张力值
     * @param tension Float 张力值
     * @param extraTension Float 额外张力值 默认值1.5
     * @constructor
     */
    constructor(tension: Float, extraTension: Float) : super(tension, extraTension)
}