package com.quyunshuo.base

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import java.lang.reflect.ParameterizedType

/**
 * Activity 基类
 *
 * @author Qu Yunshuo
 * @since 11/29/20 9:16 PM
 */
abstract class BaseActivity<VB : ViewBinding> : AppCompatActivity() {

    protected val mBinding: VB by lazy(mode = LazyThreadSafetyMode.NONE) {
        val vbClass: Class<VB> =
            (javaClass.genericSuperclass as ParameterizedType).actualTypeArguments[0] as Class<VB>
        val inflate = vbClass.getDeclaredMethod("inflate", LayoutInflater::class.java)
        inflate.invoke(null, layoutInflater) as VB
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mBinding.root)
        mBinding.initView()
    }

    protected abstract fun VB.initView()
}