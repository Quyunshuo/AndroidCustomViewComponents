package com.quyunshuo.androidcanvas.doc

import android.graphics.drawable.shapes.ArcShape

/**
 * ArcShape
 *
 * @author Qu Yunshuo
 * @since 12/27/20 11:03 PM
 */
class ArcShapeDoc : ArcShape {

    /**
     *
     * @param startAngle Float 开始角度，扇形开始的0度在椭圆的X轴正方向上
     * @param sweepAngle Float 扇形所扫过的角度
     * @constructor
     */
    constructor(startAngle: Float, sweepAngle: Float) : super(startAngle, sweepAngle)
}