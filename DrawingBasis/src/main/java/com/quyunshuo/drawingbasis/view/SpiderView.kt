package com.quyunshuo.drawingbasis.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View
import kotlin.math.cos
import kotlin.math.sin

/**
 * 蜘蛛网格分析图
 *
 * @author Qu Yunshuo
 * @since 12/2/20 8:48 PM
 */
class SpiderView(context: Context?, attrs: AttributeSet?) : View(context, attrs) {

    /**
     * 用于绘制网格的画笔
     */
    private val mRadarPaint = Paint().apply {
        style = Paint.Style.STROKE
        color = 0xFFFFFFFF.toInt()
        strokeWidth = 3F
    }

    /**
     * 用于绘制结果图的画笔
     */
    private val mValuePaint = Paint().apply {
        style = Paint.Style.FILL
        color = Color.BLUE
    }

    /**
     * 网格最大半径
     */
    private var mRadius: Float = 0.0F

    /**
     * 中心X
     */
    private var mCenterX = 0F

    /**
     * 中心Y
     */
    private var mCenterY = 0F

    /**
     * 数据个数
     */
    private var mCount = 6

    /**
     * 每个夹角的度数
     */
    private val mAngle = ((Math.PI * 2) / mCount).toFloat()

    /**
     * 端点最大值
     */
    private val mMaxValue = 6

    /**
     * 各项模拟数据
     */
    private val mData = arrayOf(2F, 5F, 1F, 6F, 4F, 5F)

    /**
     * 重写该函数 根据View的长、宽，获取整个布局的中心坐标
     * @param w Int
     * @param h Int
     * @param oldw Int
     * @param oldh Int
     */
    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        // 计算网格的最大半径
        mRadius = h.coerceAtMost(w) / 2 * 0.9F
        // 计算中心坐标
        mCenterX = (w / 2).toFloat()
        mCenterY = (h / 2).toFloat()
        postInvalidate()
        super.onSizeChanged(w, h, oldw, oldh)
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.run {
            // 绘制蜘蛛网格
            drawPolygon(this)
            // 画网格中线
            drawLines(this)
            // 画数据图
            drawRegion(this)
        }
    }

    /**
     * 绘制蜘蛛网格
     * 蜘蛛网格是利用Path的moveTo()和lineTo()函数一圈圈画出来的，我们需要计算出每一个折点的位置
     * @param canvas Canvas
     */
    private fun drawPolygon(canvas: Canvas) {
        val path = Path()
        // 计算蜘蛛丝之间的间距
        val r = mRadius / 6
        (1..6).forEach {
            // 当前半径
            val curR = r * it
            path.reset()
            (0 until 6).forEach { it2 ->
                if (it2 == 0) {
                    path.moveTo(mCenterX + curR, mCenterY)
                } else {
                    // 根据半径，计算蜘蛛丝上每一个点的坐标
                    val x = mCenterX + curR * cos(mAngle.toDouble() * it2)
                    val y = mCenterY + curR * sin(mAngle.toDouble() * it2)
                    path.lineTo(x.toFloat(), y.toFloat())
                }
            }
            // 闭合路径
            path.close()
            canvas.drawPath(path, mRadarPaint)
        }
    }

    /**
     * 画网格中心到各个端点末端的直线
     * 先找到各个末端点的坐标，然后画一条从中心到末端点的连线
     * @param canvas Canvas
     */
    private fun drawLines(canvas: Canvas) {
        val path = Path()
        (0 until mCount).forEach {
            path.reset()
            path.moveTo(mCenterX, mCenterY)
            val x = mCenterX + mRadius * cos((mAngle * it))
            val y = mCenterY + mRadius * sin((mAngle * it))
            path.lineTo(x, y)
            canvas.drawPath(path, mRadarPaint)
        }
    }

    /**
     * 绘制数据区域
     * 首先确定各个点的位置，然后根据点的位置画出对应的原点，再将各个点用path连接起来填充颜色
     * @param canvas Canvas
     */
    private fun drawRegion(canvas: Canvas) {
        val path = Path()
        mValuePaint.alpha = 255
        (0 until mCount).forEach {
            val percent = mData[it] / mMaxValue
            val x = mCenterX + mRadius * cos(mAngle * it) * percent
            val y = mCenterY + mRadius * sin(mAngle * it) * percent
            if (it == 0) {
                path.moveTo(x, mCenterY)
            } else {
                path.lineTo(x, y)
            }
            // 绘制小圆点
            canvas.drawCircle(x, y, 10F, mValuePaint)
        }
        // 绘制填充区域
        mValuePaint.alpha = 127
        mValuePaint.style = Paint.Style.FILL_AND_STROKE
        canvas.drawPath(path, mValuePaint)
    }
}

































