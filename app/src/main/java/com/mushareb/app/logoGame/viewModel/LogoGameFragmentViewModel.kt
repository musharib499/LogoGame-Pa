package com.mushareb.app.logoGame.viewModel

import android.util.Log
import androidx.lifecycle.viewModelScope
import com.mushareb.app.base.viewModel.BaseViewModel
import com.mushareb.app.logoGame.model.LogoListItem
import com.mushareb.app.logoGame.model.logoListResponse
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

/**
 * Created by Musharib Ali on 20/11/21.
 * ali.musharib1@gmail.com
 */
class LogoGameFragmentViewModel : BaseViewModel() {
    private val delayInterval:Long = 5000
    val logoUrl = MutableStateFlow(logoListResponse[0])
    val earnPoint = MutableStateFlow(0)
    val logoStart = MutableStateFlow(true)

    init {
       onLogoRandom()


    }

    private fun onLogoRandom(){
        viewModelScope.launch {
           logoStart.collect {
               while (it) {
                   val value = logoListResponse.random()
                   logoUrl.emit(value)
                   delay(delayInterval)
               }
           }
        }
    }


    fun onTextChanged(s: CharSequence) {
         viewModelScope.launch {
             if (logoUrl.value.name.equals(s.toString())) {
                 earnPoint.emit(earnPoint.value+10)
             }
         }
    }
}