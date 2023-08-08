package com.ahmet.bostanciklioglu.composerecipeapp.util

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import com.ahmet.bostanciklioglu.composerecipeapp.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition

val DEFAULT_RECIPE_IMAGE = R.drawable.empty_plate

@Composable
fun loadPicture(url: String, @DrawableRes defaultImage: Int): MutableState<Bitmap?> {

    val bitmapState: MutableState<Bitmap?> = remember { mutableStateOf(null) }

    Glide
        .with(LocalContext.current)
        .asBitmap()
        .load(defaultImage)
        .into(
            object : CustomTarget<Bitmap>() {
                override fun onResourceReady(resource: Bitmap, transition: Transition<in Bitmap>?) {
                    bitmapState.value = resource
                }
                override fun onLoadCleared(placeholder: Drawable?) {
                    TODO("Not yet implemented")
                }
            }
        )

    Glide
        .with(LocalContext.current)
        .asBitmap()
        .load(url)
        .into(
            object : CustomTarget<Bitmap>() {
                override fun onResourceReady(resource: Bitmap, transition: Transition<in Bitmap>?) {
                    bitmapState.value = resource
                }
                override fun onLoadCleared(placeholder: Drawable?) {
                    TODO("Not yet implemented")
                }
            }
        )

    return bitmapState
}