package com.quyunshuo.animation.doc.interpolator

import android.view.animation.OvershootInterpolator

/**
 * 结束偏移插值器
 * 在动画结束时，沿动画方向继续运动一段距离后再结束动画
 *
 * @author Qu Yunshuo
 * @since 12/8/20 10:57 PM
 */
class OvershootInterpolatorDoc : OvershootInterpolator {
    /**
     * 该构造方法可以设置偏移量
     * @param tension Float 张力值，默认值是2，值越大，结束时的偏移量越大，速度越快
     * @constructor
     */
    constructor(tension: Float) : super(tension)
}