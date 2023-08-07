package com.ahmet.bostanciklioglu.composerecipeapp.network.responses

import com.ahmet.bostanciklioglu.composerecipeapp.network.model.RecipeNetworkEntity
import com.google.gson.annotations.SerializedName

class RecipeSearchResponse (
    @SerializedName("count")
    var count: Int,

    @SerializedName("results")
    var recipes: List<RecipeNetworkEntity>
)