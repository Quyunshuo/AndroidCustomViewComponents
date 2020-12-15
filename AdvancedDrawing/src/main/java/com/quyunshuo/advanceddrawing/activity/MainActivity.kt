package com.quyunshuo.advanceddrawing.activity

import com.quyunshuo.advanceddrawing.databinding.ActivityMainBinding
import com.quyunshuo.base.BaseActivity

/**
 * 绘图进阶
 *
 * @author Qu Yunshuo
 * @since 12/13/20 8:35 PM
 */
class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun ActivityMainBinding.initView() {
        var isShow = false
        mShadowLayerView.setOnClickListener {
            mShadowLayerView.setShadow(isShow)
            isShow = !isShow
        }
    }
}