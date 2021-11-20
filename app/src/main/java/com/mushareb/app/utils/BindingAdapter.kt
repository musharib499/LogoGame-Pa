package com.mushareb.app.utils

import androidx.appcompat.widget.AppCompatImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.mushareb.app.R
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.transform

/**
 * Created by Musharib Ali on 20/11/21.
 * ali.musharib1@gmail.com
 */

@BindingAdapter("thumbnailFull")
fun AppCompatImageView.setImageFull(url: String?) {
    Glide.with(this.context)
        .load(url)
        .placeholder(R.drawable.placeholder)
        .apply(RequestOptions.bitmapTransform(RoundedCorners(10)))
        .into(this)

}
