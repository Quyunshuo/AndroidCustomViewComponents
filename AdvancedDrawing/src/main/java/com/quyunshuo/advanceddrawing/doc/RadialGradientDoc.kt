package com.quyunshuo.advanceddrawing.doc

import android.graphics.RadialGradient

/**
 * 放射渐变着色器
 *
 * @author Qu Yunshuo
 * @since 12/23/20 6:55 PM
 */
class RadialGradientDoc : RadialGradient {
    /**
     * 多色渐变
     * @param centerX Float 渐变中心点X坐标
     * @param centerY Float 渐变中心点X坐标
     * @param radius Float 渐变半径
     * @param colors IntArray 表示所需的渐变颜色数组
     * @param stops FloatArray? 表示每种渐变颜色所在的位置百分点，取值范围是0～1，数量必须与[colors]保持一致，一般第一个数值取0，最后一个数值取1
     * @param tileMode TileMode 用于指定当控件区域大于指定的渐变区域时，空白区域的颜色填充方式
     * @constructor
     */
    constructor(
        centerX: Float,
        centerY: Float,
        radius: Float,
        colors: IntArray,
        stops: FloatArray?,
        tileMode: TileMode
    ) : super(centerX, centerY, radius, colors, stops, tileMode)

    constructor(
        centerX: Float,
        centerY: Float,
        radius: Float,
        colors: LongArray,
        stops: FloatArray?,
        tileMode: TileMode
    ) : super(centerX, centerY, radius, colors, stops, tileMode)

    /**
     * 双色渐变
     * @param centerX Float 渐变中心点X坐标
     * @param centerY Float 渐变中心点X坐标
     * @param radius Float 渐变半径
     * @param centerColor Int 渐变的起始颜色，即渐变中心点的颜色，取值类型必须是8位的0xAARRGGBB色值
     * @param edgeColor Int 渐变结束时的颜色，即渐变圆边缘的颜色，取值类型必须是8位的0xAARRGGBB色值
     * @param tileMode TileMode 用于指定当控件区域大于指定的渐变区域时，空白区域的颜色填充方式
     * @constructor
     */
    constructor(
        centerX: Float,
        centerY: Float,
        radius: Float,
        centerColor: Int,
        edgeColor: Int,
        tileMode: TileMode
    ) : super(centerX, centerY, radius, centerColor, edgeColor, tileMode)

    constructor(
        centerX: Float,
        centerY: Float,
        radius: Float,
        centerColor: Long,
        edgeColor: Long,
        tileMode: TileMode
    ) : super(centerX, centerY, radius, centerColor, edgeColor, tileMode)
}