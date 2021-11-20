package com.mushareb.app.logoGame.view.fragment

import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.viewModelScope
import com.mushareb.app.R
import com.mushareb.app.base.view.BaseFragment
import com.mushareb.app.databinding.FragmentLogoGameBinding
import com.mushareb.app.logoGame.viewModel.LogoGameFragmentViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch


/**
 * Created by Musharib Ali on 20/11/21.
 * ali.musharib1@gmail.com
 */
class LogoGameFragment : BaseFragment<FragmentLogoGameBinding>(R.layout.fragment_logo_game) {
    private val viewModel by viewModels<LogoGameFragmentViewModel>()

    override fun onViewModelSetup() {
        super.onViewModelSetup()

        binding.model = viewModel
    }

    override fun onResume() {
        super.onResume()
        viewModel.viewModelScope.launch {
            viewModel.logoStart.emit(true)
        }
    }

    override fun onPause() {
        super.onPause()
        viewModel.viewModelScope.launch {
            viewModel.logoStart.emit(false)
        }
    }
}