package com.mushareb.app.logoGame.viewModel

import android.util.Log
import androidx.lifecycle.viewModelScope
import com.mushareb.app.base.viewModel.BaseViewModel
import com.mushareb.app.logoGame.model.logoListResponse
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

/**
 * Created by Musharib Ali on 20/11/21.
 * ali.musharib1@gmail.com
 */
class LogoGameFragmentViewModel : BaseViewModel() {
    val logoUrl = MutableStateFlow("")
    private val logoHashMap = HashMap<String, String>()

    init {
        logoListResponse.map {
            logoHashMap.put(it.name ?: "", it.imgUrl ?: "")
        }

    }

    fun onTextChanged(s: CharSequence) {
         viewModelScope.launch {
             if (logoHashMap.containsKey(s.toString())) {
                 logoUrl.emit(logoHashMap.getValue(s.toString()))
             } else {
                 logoUrl.emit("")
             }
         }
    }
}