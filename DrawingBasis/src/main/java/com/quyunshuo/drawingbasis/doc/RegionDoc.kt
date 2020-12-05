package com.quyunshuo.drawingbasis.doc

import android.graphics.*

/**
 * 区域的文档类 用于展示其主要函数
 * 区域是一块任意形状恶封闭图形
 * Canvas并没有提供针对Region的绘图方法，说明Region的本意并不是用来绘画的，它重要的功能在于区域的相交操作
 *
 * @author Qu Yunshuo
 * @since 12/5/20 4:16 PM
 */
class RegionDoc : Region {
    constructor() : super()

    /**
     * ## 复制一个Region的范围
     * @param region Region 需要被复制的Region
     * @constructor
     */
    constructor(region: Region) : super(region)

    /**
     * ## 创建一个矩形区域
     * @param r Rect 需要被创建的矩形
     * @constructor
     */
    constructor(r: Rect) : super(r)

    /**
     * ## 创建一个矩形区域
     * @param left Int
     * @param top Int
     * @param right Int
     * @param bottom Int
     * @constructor
     */
    constructor(left: Int, top: Int, right: Int, bottom: Int) : super(left, top, right, bottom)

    /**
     * ## 置空
     */
    override fun setEmpty() {
        super.setEmpty()
    }

    /**
     * ## 利用矩形所代表的区域替换原来的区域
     * @param r Rect
     * @return Boolean
     */
    override fun set(r: Rect): Boolean {
        return super.set(r)
    }

    /**
     * ## 利用新的区域替换原来的区域
     * @param region Region
     * @return Boolean
     */
    override fun set(region: Region): Boolean {
        return super.set(region)
    }

    /**
     * ## 根据矩形的两个角点构造出矩形区域来替换原来的区域
     * @param left Int
     * @param top Int
     * @param right Int
     * @param bottom Int
     * @return Boolean
     */
    override fun set(left: Int, top: Int, right: Int, bottom: Int): Boolean {
        return super.set(left, top, right, bottom)
    }

    /**
     * ## 根据路径的区域与某区域的交集构造出新的区域
     * @param path Path 用来构造区域的路径
     * @param clip Region 与前面的path所构成的路径取交集，并将该交集设置为最终区域
     * @return Boolean
     */
    override fun setPath(path: Path, clip: Region): Boolean {
        return super.setPath(path, clip)
    }

    /**
     * ## 自定义的用于绘制区域的函数
     * 通过[RegionIterator]类构造矩形集来逼近显示区域
     * 示例[com.quyunshuo.drawingbasis.view.DrawRegionView]
     * @param canvas Canvas
     * @param region Region
     * @param paint Paint
     */
    fun drawRegion(canvas: Canvas, region: Region, paint: Paint) {
        // 1.构造出区域的矩形集
        val regionIterator = RegionIterator(region)
        val rect = Rect()
        // 2.利用next()函数来逐个获取所有矩形并绘制出来
        while (regionIterator.next(rect)) {
            canvas.drawRect(rect, paint)
        }
    }

    /**
     * ## 用于与指定矩形取并集，并将Rect所指定的矩形加入当前区域中
     * @param r Rect
     * @return Boolean
     */
    fun union_text(r: Rect) = this.union(r)

    /**
     * ## op系列方法一
     * 用于用当前的Region对象与指定的一个Rect对象或者Region对象执行相交操作
     * 并将结果赋给当前的Region对象，最重要的参数就是Op op
     * 如果计算成功就返回true
     * @param r Rect
     * @param op Op [Region.Op.DIFFERENCE] 最终区域为region1 与 region2不同的区域 补集
     * [Region.Op.INTERSECT] 最终区域为region1 与 region2 相交的区域 交集
     * [Region.Op.UNION] 最终区域为region1 与 region2 组合在一起的区域 并集
     * [Region.Op.XOR] 最终区域为region1 与 region2 相交之外的区域 异并集
     * [Region.Op.REVERSE_DIFFERENCE] 最终区域为region2 与 region1 不同的区域 反转补集
     * [Region.Op.REPLACE] 最终区域为region2的区域 替换
     * @return Boolean
     */
    override fun op(r: Rect, op: Op): Boolean {
        return super.op(r, op)
    }

    /**
     * ## op系列方法一
     * @param region Region
     * @param op Op
     * @return Boolean
     */
    override fun op(region: Region, op: Op): Boolean {
        return super.op(region, op)
    }

    /**
     * ## op系列方法一
     * @param left Int
     * @param top Int
     * @param right Int
     * @param bottom Int
     * @param op Op
     * @return Boolean
     */
    override fun op(left: Int, top: Int, right: Int, bottom: Int, op: Op): Boolean {
        return super.op(left, top, right, bottom, op)
    }

    /**
     * ## op系列方法二
     * 用于传入两个Region对象进行操作，并将结果赋值给Region对象
     * @param rect Rect
     * @param region Region
     * @param op Op
     * @return Boolean
     */
    override fun op(rect: Rect, region: Region, op: Op): Boolean {
        return super.op(rect, region, op)
    }

    /**
     * ## op系列方法二
     * @param region1 Region
     * @param region2 Region
     * @param op Op
     * @return Boolean
     */
    override fun op(region1: Region, region2: Region, op: Op): Boolean {
        return super.op(region1, region2, op)
    }

    /**
     * ## 用于判断该区域是否为空
     * @return Boolean
     */
    override fun isEmpty(): Boolean {
        return super.isEmpty()
    }

    /**
     * ## 用于判断该区域是否是一个矩阵
     * @return Boolean
     */
    override fun isRect(): Boolean {
        return super.isRect()
    }

    /**
     * ## 用于判断该区域是否是多个矩阵的组合
     * @return Boolean
     */
    override fun isComplex(): Boolean {
        return super.isComplex()
    }

    /**
     * ## 用于返回能够包裹当前路径的最小矩形
     * @return Rect
     */
    override fun getBounds(): Rect {
        return super.getBounds()
    }

    /**
     * ## 用于返回能够包裹当前路径的最小矩形
     * @param r Rect
     * @return Boolean
     */
    override fun getBounds(r: Rect): Boolean {
        return super.getBounds(r)
    }

    /**
     * ## 用于返回当前矩形所对应的Path对象
     * @return Path
     */
    override fun getBoundaryPath(): Path {
        return super.getBoundaryPath()
    }

    /**
     * ## 用于返回当前矩形所对应的Path对象
     * @param path Path
     * @return Boolean
     */
    override fun getBoundaryPath(path: Path): Boolean {
        return super.getBoundaryPath(path)
    }

    /**
     * ## 用于判断该区域是否包含某个点
     * @param x Int 点的X坐标
     * @param y Int 点的Y坐标
     * @return Boolean
     */
    override fun contains(x: Int, y: Int): Boolean {
        return super.contains(x, y)
    }

    /**
     * ## 用于判断该区域是否包含某个矩形
     * @param r Rect
     * @return Boolean
     */
    override fun quickContains(r: Rect): Boolean {
        return super.quickContains(r)
    }

    /**
     * ## 用于判断该区域是否包含某个矩形
     * @param left Int
     * @param top Int
     * @param right Int
     * @param bottom Int
     * @return Boolean
     */
    override fun quickContains(left: Int, top: Int, right: Int, bottom: Int): Boolean {
        return super.quickContains(left, top, right, bottom)
    }

    /**
     * ## 用于判断该区域是否没有和指定区域相交
     * @param r Rect
     * @return Boolean
     */
    override fun quickReject(r: Rect): Boolean {
        return super.quickReject(r)
    }

    /**
     * ## 用于判断该区域是否没有和指定区域相交
     * @param left Int
     * @param top Int
     * @param right Int
     * @param bottom Int
     * @return Boolean
     */
    override fun quickReject(left: Int, top: Int, right: Int, bottom: Int): Boolean {
        return super.quickReject(left, top, right, bottom)
    }

    /**
     * ## 用于判断该区域是否没有和指定区域相交
     * @param rgn Region
     * @return Boolean
     */
    override fun quickReject(rgn: Region): Boolean {
        return super.quickReject(rgn)
    }

    /**
     * ## 用于将Region对象向X轴平移[dx]距离，向Y轴平移[dy]距离，并将结果赋给当前的Region对象
     * X轴向右是正方向，Y轴向下是正方向
     * @param dx Int
     * @param dy Int
     */
    override fun translate(dx: Int, dy: Int) {
        super.translate(dx, dy)
    }

    /**
     * ## 用于将Region对象向X轴平移[dx]距离，向Y轴平移[dy]距离，并将结果赋给[dst]，当前Region对象不变
     * @param dx Int
     * @param dy Int
     * @param dst Region
     */
    override fun translate(dx: Int, dy: Int, dst: Region) {
        super.translate(dx, dy, dst)
    }
}