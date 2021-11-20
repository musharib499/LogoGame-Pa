package com.mushareb.app.logoGame.view.fragment

import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.viewModels
import com.mushareb.app.R
import com.mushareb.app.base.view.BaseFragment
import com.mushareb.app.databinding.FragmentLogoGameBinding
import com.mushareb.app.logoGame.viewModel.LogoGameFragmentViewModel
import android.text.Editable

import android.text.TextWatcher
import androidx.core.widget.doOnTextChanged


/**
 * Created by Musharib Ali on 20/11/21.
 * ali.musharib1@gmail.com
 */
class LogoGameFragment: BaseFragment<FragmentLogoGameBinding>(R.layout.fragment_logo_game)  {
    val viewModel by viewModels<LogoGameFragmentViewModel>()

    override fun onViewModelSetup() {
        super.onViewModelSetup()
        with(viewModel) {
            binding.model = this

        }
    }
}