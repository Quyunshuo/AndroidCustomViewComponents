package com.quyunshuo.drawingbasis.doc

import android.graphics.*

/**
 * 画布文档类 用于展示画布的主要函数
 *
 * @author Qu Yunshuo
 * @since 11/29/20 10:48 PM
 */
class CanvasDoc : Canvas() {

    /**
     * ## 用于设置画布背景
     * @param color Int 8位的0xAARRGGBB样式颜色值
     */
    override fun drawColor(color: Int) {
        super.drawColor(color)
    }

    /**
     * ## 用于设置画布背景
     * @param a Int Alpha
     * @param r Int Red
     * @param g Int Green
     * @param b Int Blue
     */
    override fun drawARGB(a: Int, r: Int, g: Int, b: Int) {
        super.drawARGB(a, r, g, b)
    }

    /**
     * ## 用于设置画布背景
     * 透明度Alpha的取值固定为255
     * @param r Int Red
     * @param g Int Green
     * @param b Int Blue
     */
    override fun drawRGB(r: Int, g: Int, b: Int) {
        super.drawRGB(r, g, b)
    }

    /**
     * ## 用于画一条直线
     * @param startX Float 起始点X坐标
     * @param startY Float 起始点Y坐标
     * @param stopX Float 终点X坐标
     * @param stopY Float 终点Y坐标
     * @param paint Paint 画笔
     */
    override fun drawLine(startX: Float, startY: Float, stopX: Float, stopY: Float, paint: Paint) {
        super.drawLine(startX, startY, stopX, stopY, paint)
    }

    /**
     * ## 用于画多条直线
     * @param pts FloatArray 点的集合 每两个点形成一条直线 [pts]的组织方式为{x1,y1,x2,y2,...} x1、y1是起始点，x2、y2是终点
     * @param paint Paint 画笔
     */
    override fun drawLines(pts: FloatArray, paint: Paint) {
        super.drawLines(pts, paint)
    }

    /**
     * ## 用于画多条直线
     * @param pts FloatArray 点的集合，每两个点形成一条直线，[pts]的组织方式为{x1,y1,x2,y2,...} x1、y1是起始点，x2、y2是终点
     * @param offset Int 集合中跳过的数值的个数 不是点的个数
     * @param count Int 参与绘制的数值个数，指[pts]数组中数值的个数，而不是点的个数
     * @param paint Paint 画笔
     */
    override fun drawLines(pts: FloatArray, offset: Int, count: Int, paint: Paint) {
        super.drawLines(pts, offset, count, paint)
    }

    /**
     * ## 用于画一个点
     * @param x Float 点的X坐标
     * @param y Float 点的Y坐标
     * @param paint Paint 画笔
     */
    override fun drawPoint(x: Float, y: Float, paint: Paint) {
        super.drawPoint(x, y, paint)
    }

    /**
     * ## 用于画多个点
     * @param pts FloatArray 点的集合，[pts]的组织方式为{x1,y1,x2,y2,...} x1、y1两个坐标形成一个点
     * @param paint Paint 画笔
     */
    override fun drawPoints(pts: FloatArray, paint: Paint) {
        super.drawPoints(pts, paint)
    }

    /**
     * ## 用于画多个点
     * @param pts FloatArray 点的集合，[pts]的组织方式为{x1,y1,x2,y2,...} x1、y1两个坐标形成一个点
     * @param offset Int 集合中跳过的数值个数
     * @param count Int 参与绘制的数值个数
     * @param paint Paint 画笔
     */
    override fun drawPoints(pts: FloatArray?, offset: Int, count: Int, paint: Paint) {
        super.drawPoints(pts, offset, count, paint)
    }

    /**
     * ## 用于绘制一个矩形
     * @param left Float 第一个点的X坐标
     * @param top Float 第一个点的Y坐标
     * @param right Float 第二个点的X坐标
     * @param bottom Float 第二个点的Y坐标
     * @param paint Paint 画笔
     */
    override fun drawRect(left: Float, top: Float, right: Float, bottom: Float, paint: Paint) {
        super.drawRect(left, top, right, bottom, paint)
    }

    /**
     * ## 用于绘制一个矩形
     * @param rect RectF RectF实例
     * @param paint Paint 画笔
     */
    override fun drawRect(rect: RectF, paint: Paint) {
        super.drawRect(rect, paint)
    }

    /**
     * ## 用于绘制一个矩形
     * @param r Rect Rect实例
     * @param paint Paint 画笔
     */
    override fun drawRect(r: Rect, paint: Paint) {
        super.drawRect(r, paint)
    }

    /**
     * ## 用于绘制一个圆角矩形
     * 圆角矩形的圆角其实是由椭圆的一角形成的
     * @param rect RectF 要绘制的矩形
     * @param rx Float 生成圆角的椭圆的X轴半径
     * @param ry Float 生成圆角的椭圆的Y轴半径
     * @param paint Paint 画笔
     */
    override fun drawRoundRect(rect: RectF, rx: Float, ry: Float, paint: Paint) {
        super.drawRoundRect(rect, rx, ry, paint)
    }

    /**
     * ## 用于绘制一个椭圆
     * 椭圆是根据矩形生成的，以矩形的长为椭圆的X轴，以矩形的宽为椭圆的Y轴
     * @param oval RectF
     * @param paint Paint
     */
    override fun drawOval(oval: RectF, paint: Paint) {
        super.drawOval(oval, paint)
    }

    /**
     * ## 用于绘制一个圆
     * @param cx Float 圆心点的X轴坐标
     * @param cy Float 圆心点的Y轴坐标
     * @param radius Float 圆的半径
     * @param paint Paint 画笔
     */
    override fun drawCircle(cx: Float, cy: Float, radius: Float, paint: Paint) {
        super.drawCircle(cx, cy, radius, paint)
    }

    /**
     * ## 用于绘制一个弧
     * 弧是椭圆的一部分，而椭圆是根据矩形来生成的，所以弧也是根据矩形来生成的
     * 当画笔设置为填充模式时，填充区域只限于圆弧的起始点和终点所形成的区域
     * 当带有两边是，会讲两边及圆弧内部全部填充；如果没有两边，则只填充圆弧部分
     * @param oval RectF 生成椭圆的矩形
     * @param startAngle Float 弧开始的角度，以X轴正方向为0度
     * @param sweepAngle Float 弧持续的角度
     * @param useCenter Boolean 是否有弧的两边。为true时，表示带有两边；为false时，只有一条弧
     * @param paint Paint 画笔
     */
    override fun drawArc(
        oval: RectF,
        startAngle: Float,
        sweepAngle: Float,
        useCenter: Boolean,
        paint: Paint
    ) {
        super.drawArc(oval, startAngle, sweepAngle, useCenter, paint)
    }

    /**
     * ## 用于绘制一条路径
     * @param path Path
     * @param paint Paint
     */
    override fun drawPath(path: Path, paint: Paint) {
        super.drawPath(path, paint)
    }

    /**
     * ## 绘制文本
     * @param text String 需要绘制的文本
     * @param x Float 起始点的X坐标
     * @param y Float 起始点的Y坐标
     * @param paint Paint 画笔
     */
    override fun drawText(text: String, x: Float, y: Float, paint: Paint) {
        super.drawText(text, x, y, paint)
    }

    /**
     * ## 绘制文本
     * @param text CharSequence 需要绘制的字符序列
     * @param start Int 表示起始绘制字符所在字符串中的索引
     * @param end Int 表示结束绘制字符所在字符串中的索引
     * @param x Float 起始点的X坐标
     * @param y Float 起始点的Y坐标
     * @param paint Paint 画笔
     */
    override fun drawText(
        text: CharSequence,
        start: Int,
        end: Int,
        x: Float,
        y: Float,
        paint: Paint
    ) {
        super.drawText(text, start, end, x, y, paint)
    }

    /**
     * ## 绘制文本
     * @param text String 需要绘制的文本
     * @param start Int 表示起始绘制字符所在字符串中的索引
     * @param end Int 表示结束绘制字符所在字符串中的索引
     * @param x Float 起始点的X坐标
     * @param y Float 起始点的Y坐标
     * @param paint Paint 画笔
     */
    override fun drawText(text: String, start: Int, end: Int, x: Float, y: Float, paint: Paint) {
        super.drawText(text, start, end, x, y, paint)
    }

    /**
     * ## 绘制文本
     * @param text CharArray 需要绘制的字符数组
     * @param index Int 指定起始绘制字符的位置
     * @param count Int 指定从起始绘制字符开始绘制几个字符
     * @param x Float 起始点的X坐标
     * @param y Float 起始点的Y坐标
     * @param paint Paint 画笔
     */
    override fun drawText(
        text: CharArray,
        index: Int,
        count: Int,
        x: Float,
        y: Float,
        paint: Paint
    ) {
        super.drawText(text, index, count, x, y, paint)
    }

    /**
     * ## 用于指定每个要绘制的文字的具体位置
     * @param text String 需要绘制的字符串
     * @param pos FloatArray 要绘制的每个文字的具体位置，两两一组，{x1,y1,x2,y2}
     * @param paint Paint 画笔
     */
    override fun drawPosText(text: String, pos: FloatArray, paint: Paint) {
        super.drawPosText(text, pos, paint)
    }

    /**
     * ## 用于指定每个要绘制的文字的具体位置
     * @param text CharArray 需要绘制的字符串
     * @param index Int 第一个要绘制的文字的索引
     * @param count Int 要绘制的文字的个数，用来计算最后一个文字的位置，从第一个绘制的文字开始算起
     * @param pos FloatArray 要绘制的每个文字的具体位置，两两一组，{x1,y1,x2,y2}
     * @param paint Paint 画笔
     */
    override fun drawPosText(
        text: CharArray,
        index: Int,
        count: Int,
        pos: FloatArray,
        paint: Paint
    ) {
        super.drawPosText(text, index, count, pos, paint)
    }

    /**
     * ## 用于沿路经绘制文本
     * @param text String 需要绘制的字符串
     * @param path Path 路径
     * @param hOffset Float 与路径起始点的水平偏移量
     * @param vOffset Float 与路径中心的垂直偏移量
     * @param paint Paint 画笔
     */
    override fun drawTextOnPath(
        text: String,
        path: Path,
        hOffset: Float,
        vOffset: Float,
        paint: Paint
    ) {
        super.drawTextOnPath(text, path, hOffset, vOffset, paint)
    }

    /**
     * ## 用于沿路经绘制文本-可截取一部分文字进行绘制
     * @param text CharArray 需要绘制的字符串
     * @param index Int 第一个要绘制的文字的索引
     * @param count Int 要绘制的文字的个数，用来计算最后一个文字的位置，从第一个绘制的文字开始算起
     * @param path Path 路径
     * @param hOffset Float 与路径起始点的水平偏移量
     * @param vOffset Float 与路径中心的垂直偏移量
     * @param paint Paint 画笔
     */
    override fun drawTextOnPath(
        text: CharArray,
        index: Int,
        count: Int,
        path: Path,
        hOffset: Float,
        vOffset: Float,
        paint: Paint
    ) {
        super.drawTextOnPath(text, index, count, path, hOffset, vOffset, paint)
    }
}