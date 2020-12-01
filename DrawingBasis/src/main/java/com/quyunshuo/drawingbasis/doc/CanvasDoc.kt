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
}