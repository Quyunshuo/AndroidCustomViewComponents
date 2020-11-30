package com.quyunshuo.drawingbasis.doc

import android.graphics.Rect
import android.graphics.RectF

/**
 * 矩形工具类RectF的文档类 用于展示主要函数
 * 由于Rect无法被继承 就写在这个类中 而又因为两个类的函数基本相同，所以相同部分拿RectF来举例
 *
 * @author Qu Yunshuo
 * @since 11/30/20 5:56 PM
 */
class RectFDoc : RectF {
    constructor() : super()

    /**
     * ## 一般用来构造矩形类实例最常用的还是该构造方法
     * 根据四个点构造除一个矩形
     * @param left Float
     * @param top Float
     * @param right Float
     * @param bottom Float
     * @constructor
     */
    constructor(left: Float, top: Float, right: Float, bottom: Float) : super(
        left,
        top,
        right,
        bottom
    )

    constructor(r: RectF?) : super(r)
    constructor(r: Rect?) : super(r)

    /**
     * RectF与Rect的构造函数基本相同，不同的只是RectF所保存的数值类型是Float，而Rect所保存的数值类型是Int
     * 一般而言 构造一个矩形结构，可以通过以下两种方法来实现
     */
    private fun test() {
        // 方法一：直接构造
        val rect = Rect(10, 0, 100, 100)
        // 方法二：间接构造
        val rect2 = Rect()
        rect2.set(10, 10, 100, 100)
    }

    /**
     * ## 用于判断某个点是否在当前矩形中
     * @param x Float 需要判断的点的X坐标
     * @param y Float 需要判断的点的Y坐标
     * @return Boolean
     * @see [com.quyunshuo.drawingbasis.view.RectPointView]
     */
    override fun contains(x: Float, y: Float): Boolean {
        return super.contains(x, y)
    }

    /**
     * ## 用于判断是否包含某个矩形
     * @param r RectF 需要判断的矩形
     * @return Boolean
     */
    override fun contains(r: RectF): Boolean {
        return super.contains(r)
    }

    /**
     * ## 用于根据矩形的四个点判断是否包含某个矩形
     * @param left Float
     * @param top Float
     * @param right Float
     * @param bottom Float
     * @return Boolean
     */
    override fun contains(left: Float, top: Float, right: Float, bottom: Float): Boolean {
        return super.contains(left, top, right, bottom)
    }
}