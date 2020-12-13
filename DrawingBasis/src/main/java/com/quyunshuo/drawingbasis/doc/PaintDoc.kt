package com.quyunshuo.drawingbasis.doc

import android.graphics.Paint
import android.graphics.PathEffect
import android.graphics.Typeface

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

    /**
     * ## 设置是否为粗体文字
     * @param fakeBoldText Boolean
     */
    override fun setFakeBoldText(fakeBoldText: Boolean) {
        super.setFakeBoldText(fakeBoldText)
    }

    /**
     * ## 设置是否有下划线
     * @param underlineText Boolean
     */
    override fun setUnderlineText(underlineText: Boolean) {
        super.setUnderlineText(underlineText)
    }

    /**
     * ## 设置字体水平倾斜度
     * @param skewX Float 默认值为0，取负值时文字向右倾斜，取正值时文字向左倾斜，普通斜体字设置为-0.25
     */
    override fun setTextSkewX(skewX: Float) {
        super.setTextSkewX(skewX)
    }

    /**
     * ## 设置带有删除线效果
     * @param strikeThruText Boolean
     */
    override fun setStrikeThruText(strikeThruText: Boolean) {
        super.setStrikeThruText(strikeThruText)
    }

    /**
     * ## 设置文本的绘画水平缩放比例
     * @param scaleX Float 默认值为1.0，值 > 1.0会使文本更宽，值 < 1.0将缩小文本范围
     */
    override fun setTextScaleX(scaleX: Float) {
        super.setTextScaleX(scaleX)
    }

    /**
     * ## 用于设置所要绘制的字符串与起始点的相对位置
     * @param align Align [Paint.Align.LEFT] 居左绘制，即通过drawText()函数指定的起始点的在最左侧，文字从起始点位置开始绘制
     * [Paint.Align.CENTER] 居中绘制，即通过drawText()函数指定的起始点在文字中间位置
     * [Paint.Align.RIGHT] 居右绘制，即通过drawText()函数指定的起始点在文字右侧位置
     */
    override fun setTextAlign(align: Align) {
        super.setTextAlign(align)
    }

    /**
     * ## 用于设置字体样式
     * @param typeface Typeface是专门用来设置字体样式的类
     * @return Typeface
     */
    override fun setTypeface(typeface: Typeface): Typeface {
        return super.setTypeface(typeface)
    }

    /**
     * ## 用于设置路径样式
     * 能实现复杂的路径效果样式
     * @param effect PathEffect 样式 取值类型是PathEffect的子类
     * @return PathEffect
     */
    override fun setPathEffect(effect: PathEffect?): PathEffect {
        return super.setPathEffect(effect)
    }

    /**
     * ## 用于设置线帽样式
     * @param cap Cap 线帽样式 取值有[Paint.Cap.BUTT]无线帽，[Paint.Cap.ROUND]圆形线帽，[Paint.Cap.SQUARE]方形线帽
     */
    override fun setStrokeCap(cap: Cap?) {
        super.setStrokeCap(cap)
    }

    /**
     * ## 用于设置路径的转角样式
     * @param join Join 转角样式 取值有[Paint.Join.MITER]结合处为锐角，[Paint.Join.ROUND]结合处为圆弧，[Paint.Join.BEVEL]结合处为直线
     */
    override fun setStrokeJoin(join: Join?) {
        super.setStrokeJoin(join)
    }

    /**
     * ## 用于开关抗抖动效果
     * 抖动效果是指，在RGB颜色下很多色彩变化无法呈现，所以图像颜色渐变时，会有类似大马赛克的效果出现
     * Android为了让色彩过渡不那么生硬，于是将相邻像素之间的颜色进行"中和"以呈现一种更为细腻的过渡色
     * @param dither Boolean 是否开启
     */
    override fun setDither(dither: Boolean) {
        super.setDither(dither)
    }

    /**
     * ## 用于设置文字大小
     * @param textSize Float 文字大小 单位是px
     */
    override fun setTextSize(textSize: Float) {
        super.setTextSize(textSize)
    }

    /**
     * ## 用于设置是否开启线性文本标识  目前基本不使用了
     * @param linearText Boolean 是否开启
     */
    override fun setLinearText(linearText: Boolean) {
        super.setLinearText(linearText)
    }

    /**
     * ## 用于设置是否开启亚像素设置来绘制文本  有局限性和缺陷
     * @param subpixelText Boolean 是否开启
     */
    override fun setSubpixelText(subpixelText: Boolean) {
        super.setSubpixelText(subpixelText)
    }

}