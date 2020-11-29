package com.quyunshuo.drawingbasis.doc

import android.graphics.Canvas
import android.graphics.Paint

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
    // TODO: 11/29/20 矩形类相关及绘制矩形相关函数
}