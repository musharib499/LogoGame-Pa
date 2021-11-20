package com.mushareb.app.base.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

/**
 * Created by Musharib Ali on 20/11/21.
 * ali.musharib1@gmail.com
 */
open abstract class BaseFragment<DB : ViewDataBinding>(@LayoutRes pLayoutId: Int) : Fragment() {
    open var layoutId = pLayoutId
    open lateinit var binding: DB
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = DataBindingUtil.inflate(inflater, layoutId, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        onViewModelSetup()

        return binding.root
    }

    open fun onViewModelSetup() {

    }
}