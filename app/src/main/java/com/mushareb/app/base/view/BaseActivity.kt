package com.mushareb.app.base.view

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.FragmentActivity

/**
 * Created by Musharib Ali on 20/11/21.
 * ali.musharib1@gmail.com
 */
abstract class  BaseActivity<DB: ViewDataBinding>(@LayoutRes pLayoutId:Int) : FragmentActivity() {
    private val layoutId :Int = pLayoutId
    open lateinit var binding: DB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setUpView()
    }
    open fun onViewModelSetup() {
    }

    private fun setUpView(){
        if (layoutId == 0) return

        binding = DataBindingUtil.setContentView(this,layoutId) as DB
        binding.lifecycleOwner = this
        onViewModelSetup()

    }
}