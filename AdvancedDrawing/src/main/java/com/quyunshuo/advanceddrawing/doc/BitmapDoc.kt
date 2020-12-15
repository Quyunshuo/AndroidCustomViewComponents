package com.quyunshuo.advanceddrawing.doc

import android.graphics.Bitmap

/**
 * BitmapDoc Bitmap不可派生子类
 *
 * @author Qu Yunshuo
 * @since 12/15/20 11:01 PM
 */
class BitmapDoc {

    /**
     * 提取只有Alpha值的图片
     * 该函数的功能是新建一张空白图片，该图片具有与原图片一样的Alpha值，把这个新建的Bitmap作为结果返回
     * 这幅图像的颜色是在使用canvas.drawBitmap()函数时由传入的画笔颜色指定的
     * @return Bitmap?
     */
    private fun extractAlpha(): Bitmap? {
        return null
    }
}