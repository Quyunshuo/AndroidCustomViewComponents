package com.quyunshuo.advanceddrawing.doc

import android.graphics.Bitmap
import android.graphics.BitmapShader
import android.graphics.Shader.TileMode

/**
 * Shader的派生类 相当于PS中的印章
 *
 * @author Qu Yunshuo
 * @since 12/20/20 3:34 PM
 */
class BitmapShaderDoc : BitmapShader {
    /**
     * ## 构造函数
     * 填充顺序都是先填充Y轴再填充X轴
     * 无论利用绘图函数绘制多大的图像、在哪里绘制，都与Shader无关，因为Shader总是从控件的左上角开始绘制，
     * 而我们绘制的至少显示出来的部分而已，没有绘制的部分虽然已经生成，但是不会显示出来
     * TileMode的取值如下:
     * [TileMode.CLAMP] 用边缘色彩来填充多余的空间
     * [TileMode.MIRROR] 重复使用镜像模式的图像来填充多余空间
     * [TileMode.REPEAT] 重复原图像来填充多余空间
     * @param bitmap Bitmap 用来指定图案
     * @param tileX TileMode 用来指定当X轴超出单张图片大小时所使用重复策略
     * @param tileY TileMode 用来指定当Y轴超出单张图片大小时所使用重复策略
     * @constructor
     */
    constructor(bitmap: Bitmap, tileX: TileMode, tileY: TileMode) : super(bitmap, tileX, tileY)
}