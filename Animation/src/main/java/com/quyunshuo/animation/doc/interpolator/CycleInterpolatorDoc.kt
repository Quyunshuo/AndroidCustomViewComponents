package com.quyunshuo.animation.doc.interpolator

import android.view.animation.CycleInterpolator

/**
 * 循环插值器
 * 表示动画循环播放特定的次数，速率沿正弦曲线改变
 *
 * @author Qu Yunshuo
 * @since 12/8/20 11:07 PM
 */
class CycleInterpolatorDoc : CycleInterpolator {
    /**
     * 构造函数
     * @param cycles Float 循环次数
     * @constructor
     */
    constructor(cycles: Float) : super(cycles)
}