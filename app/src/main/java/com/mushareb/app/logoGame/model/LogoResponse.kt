package com.mushareb.app.logoGame.model

import com.google.gson.Gson

/**
 * Created by Musharib Ali on 20/11/21.
 * ali.musharib1@gmail.com
 */


data class LogoListItem(
    val imgUrl: String?,
    val name: String?
)
const val logoJsonString  = "[{\"imgUrl\":\"http://www.dsource.in/sites/default/files/resource/logo-design/logos/logos-representing-india/images/01.jpeg\",\"name\":\"AADHAAR\"},{\"imgUrl\":\"https://static.digit.in/default/thumb_101067_default_td_480x480.jpeg\",\"name\":\"PHONEPE\"},{\"imgUrl\":\"https://cdn.iconscout.com/icon/free/png-256/bhim-3-69845.png\",\"name\":\"BHIM\"},{\"imgUrl\":\"https://media.glassdoor.com/sqll/300494/flipkart-com-squarelogo-1433217726546.png\",\"name\":\"FLIPKART\"},{\"imgUrl\":\"http://logok.org/wp-content/uploads/2014/05/Walmart-Logo-880x645.png\",\"name\":\"WALMART\"},{\"imgUrl\":\"http://www.thestylesymphony.com/wp-content/uploads/2015/05/Myntra-logo.png\",\"name\":\"MYNTRA\"}]"
val logoListResponse : List<LogoListItem> = Gson().fromJson(logoJsonString, Array<LogoListItem>::class.java).toList()
