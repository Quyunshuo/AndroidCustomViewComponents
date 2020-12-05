package com.quyunshuo.drawingbasis.view

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View
import com.quyunshuo.drawingbasis.doc.RegionDoc

/**
 * 展示自定义的绘制区域的View
 *
 * @author Qu Yunshuo
 * @since 12/5/20 4:51 PM
 */
class DrawRegionView(context: Context, attrs: AttributeSet) : View(context, attrs) {

    private val mPaint = Paint().apply {
        color = Color.RED
        // 设置为描边 更好的展示
        style = Paint.Style.STROKE
    }

    private val mOvalPath = Path().apply {
        // 构造生成椭圆的矩形
        val rectF = RectF(150F, 50F, 600F, 850F)
        // 添加椭圆路径 逆时针方向
        addOval(rectF, Path.Direction.CCW)
    }

    private val mRegion = RegionDoc().apply {
        setPath(mOvalPath, Region(150, 50, 600, 850))
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        // 进行绘制
        // 从效果图就可以看出在绘制Region对象是，其实就是先将其转换成矩形集，然后利用画笔将每个矩形画出来
        drawRegion(canvas, mRegion, mPaint)
    }

    /**
     * ## 自定义的用于绘制区域的函数
     * 通过[RegionIterator]类构造矩形集来逼近显示区域
     * @param canvas Canvas
     * @param region Region
     * @param paint Paint
     */
    private fun drawRegion(canvas: Canvas, region: Region, paint: Paint) {
        // 1.构造出区域的矩形集
        val regionIterator = RegionIterator(region)
        val rect = Rect()
        // 2.利用next()函数来逐个获取所有矩形并绘制出来
        while (regionIterator.next(rect)) {
            canvas.drawRect(rect, paint)
        }
    }
}