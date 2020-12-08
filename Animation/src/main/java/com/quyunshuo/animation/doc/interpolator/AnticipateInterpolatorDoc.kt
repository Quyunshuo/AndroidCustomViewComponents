package com.quyunshuo.animation.doc.interpolator

import android.view.animation.AnticipateInterpolator

/**
 * 初始偏移插值器
 * 在动画开始的时候向前偏移一段距离，然后应用动画
 *
 * @author Qu Yunshuo
 * @since 12/8/20 10:53 PM
 */
class AnticipateInterpolatorDoc : AnticipateInterpolator {

    /**
     * 该构造方法可以设置偏移量
     * @param tension Float 张力值 也就是偏移量 默认是2，值越大，初始偏移量就越大，而且速度越快
     * @constructor
     */
    constructor(tension: Float) : super(tension)
}