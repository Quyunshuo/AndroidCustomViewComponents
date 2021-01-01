package com.quyunshuo.encapsulationwidget

import android.content.Context
import android.view.View

/**
 * 绘制流程相关函数文档
 *
 * @author Qu Yunshuo
 * @since 1/1/21 10:15 PM
 */
class ViewDoc(context: Context?) : View(context) {

    /**
     * ## 用来测量当前View大小
     * [widthMeasureSpec]和[heightMeasureSpec]的含义和组成
     * 含义是指 父类传递过来给当前View的一个建议值，即想把当前View的尺寸设置为宽[widthMeasureSpec]、高[heightMeasureSpec]
     * 组成是由mode+size两部分组成的 将他们转为二进制数字表示，它们就是32位的，前2位代表模式，后30位代表数值
     * 模式分类
     * [View.MeasureSpec.UNSPECIFIED]未指定 父元素不对子元素施加任何束缚，子元素可以得到任意想要的大小
     * [View.MeasureSpec.EXACTLY]完全 父元素决定子元素的确定大小，子元素将被限定在给定的边界里而忽略它本身的大小
     * [View.MeasureSpec.AT_MOST]至多 子元素至多达到指定大小的值
     * 模式提取
     * [View.MeasureSpec.getMode] 获取模式
     * [View.MeasureSpec.getSize] 获取数值
     * 简单来说 XML布局和模式有如下的对应关系
     * wrap_content -> [View.MeasureSpec.AT_MOST]
     * match_parent -> [View.MeasureSpec.EXACTLY]
     * 具体值 -> [View.MeasureSpec.EXACTLY]
     */
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        // 设置计算好的值
//        setMeasuredDimension()
    }

    /**
     * ## 实现所有子控件布局
     * @param changed Boolean
     * @param left Int
     * @param top Int
     * @param right Int
     * @param bottom Int
     */
    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
    }
}