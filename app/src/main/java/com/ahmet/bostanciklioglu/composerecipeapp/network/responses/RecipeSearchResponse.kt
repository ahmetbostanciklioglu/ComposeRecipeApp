package com.ahmet.bostanciklioglu.composerecipeapp.network.responses

import com.ahmet.bostanciklioglu.composerecipeapp.network.model.RecipeDto
import com.google.gson.annotations.SerializedName

data class RecipeSearchResponse (
    @SerializedName("count")
    var count: Int,

    @SerializedName("results")
    var recipes: List<RecipeDto>
)