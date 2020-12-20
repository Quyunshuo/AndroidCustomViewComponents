package com.quyunshuo.advanceddrawing.doc

import android.graphics.LinearGradient

/**
 * 线性渐变效果
 *
 * @author Qu Yunshuo
 * @since 12/20/20 8:56 PM
 */
class LinearGradientDoc : LinearGradient {
    /**
     * 多种颜色之间的渐变
     * @param x0 Float 起始渐变点X坐标
     * @param y0 Float 起始渐变点Y坐标
     * @param x1 Float 结束渐变点X坐标
     * @param y1 Float 结束渐变点Y坐标
     * @param colors IntArray 用于指定渐变的颜色值数组
     * @param positions FloatArray 与渐变的颜色相对应，取值是0～1的Float类型数据，表示每种颜色在整条渐变线中的百分比位置
     * @param tile TileMode
     * @constructor
     */
    constructor(
        x0: Float,
        y0: Float,
        x1: Float,
        y1: Float,
        colors: IntArray,
        positions: FloatArray?,
        tile: TileMode
    ) : super(x0, y0, x1, y1, colors, positions, tile)

    constructor(
        x0: Float,
        y0: Float,
        x1: Float,
        y1: Float,
        colors: LongArray,
        positions: FloatArray?,
        tile: TileMode
    ) : super(x0, y0, x1, y1, colors, positions, tile)

    /**
     * 两种颜色之间的渐变
     * @param x0 Float 起始渐变点X坐标
     * @param y0 Float 起始渐变点Y坐标
     * @param x1 Float 结束渐变点X坐标
     * @param y1 Float 结束渐变点Y坐标
     * @param color0 Int 起始颜色，颜色值必须使用0xAARRGGBB形式十六进制数表示
     * @param color1 Int 终止颜色，颜色值必须使用0xAARRGGBB形式十六进制数表示
     * @param tile TileMode 与BitmapShader一样
     * @constructor
     */
    constructor(
        x0: Float,
        y0: Float,
        x1: Float,
        y1: Float,
        color0: Int,
        color1: Int,
        tile: TileMode
    ) : super(x0, y0, x1, y1, color0, color1, tile)

    constructor(
        x0: Float,
        y0: Float,
        x1: Float,
        y1: Float,
        color0: Long,
        color1: Long,
        tile: TileMode
    ) : super(x0, y0, x1, y1, color0, color1, tile)
}