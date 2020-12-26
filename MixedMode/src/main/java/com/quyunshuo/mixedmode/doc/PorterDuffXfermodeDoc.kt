package com.quyunshuo.mixedmode.doc

import android.graphics.PorterDuff
import android.graphics.PorterDuffXfermode

/**
 * 混合模式 现Xfermode唯一子类
 *
 * @author Qu Yunshuo
 * @since 12/23/20 7:22 PM
 */
class PorterDuffXfermodeDoc : PorterDuffXfermode {
    /**
     * 有两个概念 目标图像（DST）  源图像（SRC）
     * 在Xfermode设置之前画出来的叫做目标图像，即给谁应用Xfermode，在Xfermode设置设置之后画出的图像叫源图像，即拿什么应用Xfermode
     * @param mode Mode 用来表示混合模式 其枚举值有18个，表示各种混合模式，每一种都对应着一种算法
     * [PorterDuff.Mode.ADD] 饱和度相加
     * @constructor
     */
    constructor(mode: PorterDuff.Mode?) : super(mode)

    /**
     * 颜色叠加相关模式
     * 这几种模式都是PS中存在的模式，是通过计算改变相交区域的颜色值的
     * @see com.quyunshuo.mixedmode.view.TwitterView
     *
     * [PorterDuff.Mode.ADD] 饱和度相加
     * 对SRC和DST两张图片相交区域的饱和度进行相加
     *
     * [PorterDuff.Mode.LIGHTEN] 变亮
     * 对SRC和DST两张图片相交区域的亮度进行提高
     *
     * [PorterDuff.Mode.DARKEN] 变暗
     * 对SRC和DST两张图片相交区域进行变暗
     *
     * [PorterDuff.Mode.MULTIPLY] 正片叠底
     *
     * [PorterDuff.Mode.OVERLAY] 叠加
     *
     * [PorterDuff.Mode.SCREEN] 滤色
     */

    /**
     * 源图像模式
     *
     * [PorterDuff.Mode.SRC]
     * 在处理源图像所在区域的相交问题时，全部以源图像显示
     *
     * [PorterDuff.Mode.SRC_IN]
     * 类似于[PorterDuff.Mode.SRC]模式，但是不同之处在于，在相交区域中当目标图像是空白像素时，与[PorterDuff.Mode.SRC_IN]模式所对应的区域也将变成空白区域
     *
     * [PorterDuff.Mode.SRC_OUT]
     * 以目标图像的透明度的补值来调节源图像的透明度和饱和度，即当目标图像为空白像素时，就可以完全显示源图像，当目标图像的不透明度为100%时，相交区域为空白像素。
     * 简单来说就是当目标图像有图像时结果显示空白像素，当目标图像没有图像时结果显示源图像
     *
     * [PorterDuff.Mode.SRC_OVER]
     * 在目标图像的顶部绘制源图像
     *
     * [PorterDuff.Mode.SRC_ATOP]
     */
}