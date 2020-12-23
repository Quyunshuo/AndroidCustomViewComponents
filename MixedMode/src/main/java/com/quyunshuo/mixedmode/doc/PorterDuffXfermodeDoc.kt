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
}