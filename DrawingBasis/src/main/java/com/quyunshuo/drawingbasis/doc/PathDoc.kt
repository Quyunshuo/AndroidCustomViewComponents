package com.quyunshuo.drawingbasis.doc

import android.graphics.Path
import android.graphics.RectF

/**
 * 路径文档类 用于展示路径的常用函数
 *
 * @author Qu Yunshuo
 * @since 12/1/20 7:12 PM
 */
class PathDoc : Path() {
    /**
     * ## 画一条直线所用到的函数 直线的起始点
     * @param x Float
     * @param y Float
     */
    override fun moveTo(x: Float, y: Float) {
        super.moveTo(x, y)
    }

    /**
     * ## 画一条直线所用到的函数
     * 直线的终点
     * 又是下一次绘制直线路径的起始点
     * 该函数可以一直使用
     * @param x Float
     * @param y Float
     */
    override fun lineTo(x: Float, y: Float) {
        super.lineTo(x, y)
    }

    /**
     * ## 如果连续画了几条直线，但没有形成闭环，那么调用该函数会将路径首尾点连接起来，形成闭环
     */
    override fun close() {
        super.close()
    }

    /**
     * ## 这是一个画弧线路径的方法
     * 弧线是从椭圆上截取的一部分
     * 该方法会将起始点连接起来
     * @param oval RectF 生成椭圆的矩形
     * @param startAngle Float 弧开始的角度，以X轴正方向为0度
     * @param sweepAngle Float 弧持续的角度
     */
    override fun arcTo(oval: RectF, startAngle: Float, sweepAngle: Float) {
        super.arcTo(oval, startAngle, sweepAngle)
    }

    /**
     * ## 这是一个画弧线路径的方法
     * @param oval RectF 生成椭圆的矩形
     * @param startAngle Float 弧开始的角度，以X轴正方向为0度
     * @param sweepAngle Float 弧持续的角度
     * @param forceMoveTo Boolean 是否强制将弧的起始点作为绘制起始位置
     */
    override fun arcTo(oval: RectF, startAngle: Float, sweepAngle: Float, forceMoveTo: Boolean) {
        super.arcTo(oval, startAngle, sweepAngle, forceMoveTo)
    }

    /**
     * ## 这是一个画弧线路径的方法
     * @param left Float
     * @param top Float
     * @param right Float
     * @param bottom Float
     * @param startAngle Float 弧开始的角度，以X轴正方向为0度
     * @param sweepAngle Float 弧持续的角度
     * @param forceMoveTo Boolean 是否强制将弧的起始点作为绘制起始位置
     */
    override fun arcTo(
        left: Float,
        top: Float,
        right: Float,
        bottom: Float,
        startAngle: Float,
        sweepAngle: Float,
        forceMoveTo: Boolean
    ) {
        super.arcTo(left, top, right, bottom, startAngle, sweepAngle, forceMoveTo)
    }

    /**
     * ## 添加一个矩形路径
     * @param rect RectF 矩形
     * @param dir Direction [Direction.CCW] 创建逆时针方向的矩形/[Direction.CW]创建顺时针方向的矩形路径
     */
    override fun addRect(rect: RectF, dir: Direction) {
        super.addRect(rect, dir)
    }

    /**
     * ## 添加一个矩形路径
     * @param left Float
     * @param top Float
     * @param right Float
     * @param bottom Float
     * @param dir Direction [Direction.CCW] 创建逆时针方向的矩形/[Direction.CW]创建顺时针方向的矩形路径
     */
    override fun addRect(left: Float, top: Float, right: Float, bottom: Float, dir: Direction) {
        super.addRect(left, top, right, bottom, dir)
    }

    /**
     * ## 添加圆角矩形路径
     * @param rect RectF
     * @param radii FloatArray 必须传入8个数值，分4组，分别对应每个角所使用的椭圆的横轴半径和纵轴半径
     * @param dir Direction
     */
    override fun addRoundRect(rect: RectF, radii: FloatArray, dir: Direction) {
        super.addRoundRect(rect, radii, dir)
    }

    /**
     * ## 添加圆角矩形路径
     * 该函数只能构建统一的圆角大小
     * @param rect RectF
     * @param rx Float 生成圆角的椭圆的横轴半径
     * @param ry Float 生成圆角的椭圆的纵轴半径
     * @param dir Direction
     */
    override fun addRoundRect(rect: RectF, rx: Float, ry: Float, dir: Direction) {
        super.addRoundRect(rect, rx, ry, dir)
    }

    /**
     * ## 添加圆形路径
     * @param x Float 圆心X轴坐标
     * @param y Float 圆心Y轴坐标
     * @param radius Float 圆半径
     * @param dir Direction
     */
    override fun addCircle(x: Float, y: Float, radius: Float, dir: Direction) {
        super.addCircle(x, y, radius, dir)
    }

    /**
     * ## 添加椭圆路径
     * @param oval RectF 生成椭圆的矩形
     * @param dir Direction
     */
    override fun addOval(oval: RectF, dir: Direction) {
        super.addOval(oval, dir)
    }

    /**
     * ## 添加弧形路径
     * @param oval RectF 生成椭圆的矩形
     * @param startAngle Float 弧开始的角度，以X轴正方向为0度
     * @param sweepAngle Float 弧持续的角度
     */
    override fun addArc(oval: RectF, startAngle: Float, sweepAngle: Float) {
        super.addArc(oval, startAngle, sweepAngle)
    }

    /**
     * ## 添加弧形路径
     * @param left Float
     * @param top Float
     * @param right Float
     * @param bottom Float
     * @param startAngle Float
     * @param sweepAngle Float
     */
    override fun addArc(
        left: Float,
        top: Float,
        right: Float,
        bottom: Float,
        startAngle: Float,
        sweepAngle: Float
    ) {
        super.addArc(left, top, right, bottom, startAngle, sweepAngle)
    }
}