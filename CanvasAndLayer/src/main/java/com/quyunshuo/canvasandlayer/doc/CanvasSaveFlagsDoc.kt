package com.quyunshuo.canvasandlayer.doc

/**
 * 画布保存的Flag标识Doc
 *
 * @author Qu Yunshuo
 * @since 12/26/20 10:06 PM
 */
object CanvasSaveFlagsDoc {

    /**
     * Restore the current matrix when restore() is called.
     * 该标识只会保存位置矩阵，在恢复时也只会恢复画布的位置信息，除此之外的任何信息是不会被恢复的，这一点save()和saveLayer()相同
     * 当saveLayer()函数在使用该标识时，需要配合[HAS_ALPHA_LAYER_SAVE_FLAG]标识一起使用，否则新建画布所在区域原来的图像会被清空
     * @removed
     */
    @Deprecated(
        """Use the flagless version of {@link #save()}, {@link #saveLayer(RectF, Paint)} or
                  {@link #saveLayerAlpha(RectF, int)}. For saveLayer() calls the matrix
                  was always restored for {@link #isHardwareAccelerated() Hardware accelerated}
                  canvases and as of API level {@value Build.VERSION_CODES#O} that is the default
                  behavior for all canvas types."""
    )
    val MATRIX_SAVE_FLAG = 0x01

    /**
     * Restore the current clip when restore() is called.
     * 该标识只会保存裁剪信息，在恢复时也只会恢复画布的裁剪信息，除此之外的任何信息是不会被恢复的，这一点save()和saveLayer()相同
     * 当saveLayer()函数在使用该标识时，需要配合[HAS_ALPHA_LAYER_SAVE_FLAG]标识一起使用，否则新建画布所在区域原来的图像会被清空
     * @removed
     */
    @Deprecated(
        """Use the flagless version of {@link #save()}, {@link #saveLayer(RectF, Paint)} or
                  {@link #saveLayerAlpha(RectF, int)}. For saveLayer() calls the clip
                  was always restored for {@link #isHardwareAccelerated() Hardware accelerated}
                  canvases and as of API level {@value Build.VERSION_CODES#O} that is the default
                  behavior for all canvas types."""
    )
    val CLIP_SAVE_FLAG = 0x02

    /**
     * The layer requires a per-pixel alpha channel.
     *
     * @removed
     */
    @Deprecated(
        """This flag is ignored. Use the flagless version of {@link #saveLayer(RectF, Paint)}
                  {@link #saveLayerAlpha(RectF, int)}."""
    )
    val HAS_ALPHA_LAYER_SAVE_FLAG = 0x04

    /**
     * The layer requires full 8-bit precision for each color channel.
     *
     * @removed
     */
    @Deprecated(
        """This flag is ignored. Use the flagless version of {@link #saveLayer(RectF, Paint)}
                  {@link #saveLayerAlpha(RectF, int)}."""
    )
    val FULL_COLOR_LAYER_SAVE_FLAG = 0x08

    /**
     * Clip drawing to the bounds of the offscreen layer, omit at your own peril.
     *
     * **Note:** it is strongly recommended to not
     * omit this flag for any call to `saveLayer()` and
     * `saveLayerAlpha()` variants. Not passing this flag generally
     * triggers extremely poor performance with hardware accelerated rendering.
     *
     * @removed
     */
    @Deprecated(
        """This flag results in poor performance and the same effect can be achieved with
                  a single layer or multiple draw commands with different clips."""
    )
    val CLIP_TO_LAYER_SAVE_FLAG = 0x10

    /**
     * Restore everything when restore() is called (standard save flags).
     *
     * **Note:** for performance reasons, it is
     * strongly recommended to pass this - the complete set of flags - to any
     * call to `saveLayer()` and `saveLayerAlpha()`
     * variants.
     *
     *
     * **Note:** all methods that accept this flag
     * have flagless versions that are equivalent to passing this flag.
     */
    const val ALL_SAVE_FLAG = 0x1F
}