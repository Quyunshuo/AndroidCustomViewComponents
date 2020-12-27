package com.quyunshuo.androidcanvas.doc

import android.graphics.RectF
import android.graphics.drawable.shapes.RoundRectShape

/**
 *
 * @author Qu Yunshuo
 * @since 12/27/20 11:04 PM
 */
class RoundRectShapeDoc : RoundRectShape {

    /**
     *
     * @param outerRadii FloatArray? 外围矩形的各个角的角度大小，需要填充8哥数字，每两个数字一组，分别对应（左上角，右上角，右下角，左下角）4个角的角度
     * 每两个一组的数字构成一个椭圆，第一个数字代表椭圆的X轴半径，第二个数字代表椭圆的Y轴半径，如果不需要指定外围矩形的各个角角度可以传null
     * @param inset RectF? 表示内部矩形和外部矩形各边的边距，如果不需要内部矩形的镂空效果，可以传null
     * @param innerRadii FloatArray? 表示内部矩形的4个角的角度大小，同[outerRadii]
     * @constructor
     */
    constructor(outerRadii: FloatArray?, inset: RectF?, innerRadii: FloatArray?) : super(
        outerRadii,
        inset,
        innerRadii
    )
}