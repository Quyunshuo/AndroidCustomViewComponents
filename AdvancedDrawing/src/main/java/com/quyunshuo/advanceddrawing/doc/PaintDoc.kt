package com.quyunshuo.advanceddrawing.doc

import android.graphics.Paint

/**
 * Paint进阶
 *
 * @author Qu Yunshuo
 * @since 12/15/20 10:02 PM
 */
class PaintDoc : Paint() {

    /**
     * ##用于添加阴影效果
     * 该函数使用的是高斯模糊算法
     * 图片的阴影是不受阴影画笔颜色控制的，它是一张图片的副本
     * 该函数只有在文字绘制阴影支持硬件加速，其他都不支持硬件加速
     * @param radius Float 模糊半径，值越大越模糊，越小越清晰，如果为0阴影则消失不见
     * @param dx Float 阴影的横向偏移距离，正值向右偏移，负值向左偏移
     * @param dy Float 阴影的纵向偏移距离，正值向下偏移，负值向上偏移
     * @param shadowColor Int 绘制阴影的画笔颜色，即阴影的颜色（对图片阴影无效）
     */
    override fun setShadowLayer(radius: Float, dx: Float, dy: Float, shadowColor: Int) {
        super.setShadowLayer(radius, dx, dy, shadowColor)
    }

    /**
     * ## 用于清除阴影
     * 使用方式很简单，直接在重绘时调用该方法即可
     */
    override fun clearShadowLayer() {
        super.clearShadowLayer()
    }
}