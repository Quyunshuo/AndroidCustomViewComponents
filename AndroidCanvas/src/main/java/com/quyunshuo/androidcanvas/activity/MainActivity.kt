package com.quyunshuo.androidcanvas.activity

import android.graphics.drawable.GradientDrawable
import com.quyunshuo.androidcanvas.databinding.ActivityMainBinding
import com.quyunshuo.base.BaseActivity

/**
 * Android 画布
 *
 * @author Qu Yunshuo
 * @since 12/27/20 10:26 PM
 */
class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun ActivityMainBinding.initView() {
        // 点击获取到Tv的Shape实例并添加圆角
        mAddFilletBtn.setOnClickListener {
            val gradientDrawable = mShapeTv.background as GradientDrawable
            gradientDrawable.cornerRadius = 20F
        }
    }
}