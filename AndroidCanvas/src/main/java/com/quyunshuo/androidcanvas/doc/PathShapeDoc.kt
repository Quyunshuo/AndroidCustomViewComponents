package com.quyunshuo.androidcanvas.doc

import android.graphics.Path
import android.graphics.drawable.shapes.PathShape

/**
 * PathShape 可根据路径绘制的Shape
 *
 * @author Qu Yunshuo
 * @since 12/28/20 7:54 PM
 */
class PathShapeDoc : PathShape {
    /**
     *
     * @param path Path 表示所要画的路径
     * @param stdWidth Float 表示标准宽度，即整个ShapeDrawable的宽度分成多少份。
     * @param stdHeight Float 表示标准高度，即整个ShapeDrawable的高度分成多少份。
     * @constructor
     */
    constructor(path: Path, stdWidth: Float, stdHeight: Float) : super(path, stdWidth, stdHeight)
}