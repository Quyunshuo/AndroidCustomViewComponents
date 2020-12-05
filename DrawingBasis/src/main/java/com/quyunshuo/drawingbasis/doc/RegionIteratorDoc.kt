package com.quyunshuo.drawingbasis.doc

import android.graphics.Rect
import android.graphics.Region
import android.graphics.RegionIterator

/**
 * 枚举区域
 * 提供了获取组成区域的矩形集的功能
 *
 * @author Qu Yunshuo
 * @since 12/5/20 4:42 PM
 */
class RegionIteratorDoc : RegionIterator {

    /**
     * ## 根据区域构建对应的矩形集
     * @param region Region
     * @constructor
     */
    constructor(region: Region) : super(region)

    /**
     * ## 获取下一个矩形，将结果保存在参数Rect r中
     * @param r Rect
     * @return Boolean
     */
    fun test(r: Rect): Boolean = this.next(Rect())
}