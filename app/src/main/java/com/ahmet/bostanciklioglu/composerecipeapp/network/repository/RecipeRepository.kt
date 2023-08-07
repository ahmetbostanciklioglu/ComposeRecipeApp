package com.ahmet.bostanciklioglu.composerecipeapp.network.repository

import com.ahmet.bostanciklioglu.composerecipeapp.domain.model.Recipe

interface RecipeRepository {

    suspend fun search(token: String, page: Int, query: String): List<Recipe>

    suspend fun get(token: String, id: Int): Recipe
}