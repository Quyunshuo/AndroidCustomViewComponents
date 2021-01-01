package com.quyunshuo.encapsulationwidget.view

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import com.quyunshuo.encapsulationwidget.R

/**
 * 演示自定义属性
 *
 * @author Qu Yunshuo
 * @since 1/1/21 9:59 PM
 */
class MyTextView : AppCompatTextView {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        attrs?.run { init(this) }
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        attrs?.run { init(this) }
    }

    private fun init(attrs: AttributeSet) {
        // 获取TypedArray实例
        val typedArray: TypedArray = context.obtainStyledAttributes(attrs, R.styleable.MyTextView)
        val headerHeight = typedArray.getDimension(R.styleable.MyTextView_headerHeight, -1F)
        val age = typedArray.getInt(R.styleable.MyTextView_age, -1)
        // 使用完 一定要释放
        typedArray.recycle()

        this.text = "headerHeight:$headerHeight age:$age"
    }
}