package com.quyunshuo.drawingbasis.doc

import android.graphics.Paint

/**
 * 画笔文档类 用于展示画笔的主要函数
 *
 * @author Qu Yunshuo
 * @since 11/29/20 10:08 PM
 */
class PaintDoc : Paint() {

    /**
     * ## 表示是否打开抗锯齿功能
     * 抗锯齿是依赖算法的，一般在绘制不规则的图形时使用
     * @param aa Boolean 是否打开
     */
    override fun setAntiAlias(aa: Boolean) {
        super.setAntiAlias(aa)
    }

    /**
     * ## 用于设置画笔的颜色
     * 一个颜色值是由红、绿、蓝三色合成出来的，所以，参数color只能取8位的0xAARRGGBB样式的颜色值
     * A 代表透明度（Alpha）
     * R 代表红色（Red）
     * G 代表绿色（Green）
     * B 代表蓝色（Blue）
     * 四个取值范围都为0～255（对应16进制的0x00～0xFF）
     * 除手动组合颜色的方法以外，系统还提供了一个专门解析颜色的类 - [android.graphics.Color]
     * @param color Int 0xAARRGGBB
     */
    override fun setColor(color: Int) {
        super.setColor(color)
    }

    /**
     * ## 用于设置填充样式
     * 对文字和几何图形都有效
     * [android.graphics.Paint.Style] 取值如下:
     * [android.graphics.Paint.Style.FILL]: 仅填充内部
     * [android.graphics.Paint.Style.FILL_AND_STROKE]: 填充内部和描边
     * [android.graphics.Paint.Style.STROKE]: 仅描边
     * @param style Style
     */
    override fun setStyle(style: Style?) {
        super.setStyle(style)
    }

    /**
     * ## 用于设置描边宽度，单位是px
     * 当画笔的[android.graphics.Paint.Style]样式为[android.graphics.Paint.Style.FILL_AND_STROKE]
     * 和[android.graphics.Paint.Style.STROKE]时有效
     * 一般而言，在Style起作用时，该函数的作用用于设置描边宽度，当Style不起作用时，用于设置画笔宽度
     * @param width Float
     */
    override fun setStrokeWidth(width: Float) {
        super.setStrokeWidth(width)
    }
}