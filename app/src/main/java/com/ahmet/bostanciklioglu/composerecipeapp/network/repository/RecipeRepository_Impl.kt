package com.ahmet.bostanciklioglu.composerecipeapp.network.repository

import com.ahmet.bostanciklioglu.composerecipeapp.domain.model.Recipe
import com.ahmet.bostanciklioglu.composerecipeapp.network.RecipeService
import com.ahmet.bostanciklioglu.composerecipeapp.network.model.RecipeDtoMapper
import javax.inject.Inject
import javax.inject.Singleton

class RecipeRepository_Impl(
    private val recipeService: RecipeService,
    private val mapper: RecipeDtoMapper
) : RecipeRepository {

    override suspend fun search(token: String, page: Int, query: String): List<Recipe> {
        // val result = recipeService.search(token, page, query).recipes to prevent confusing you can use this 1st method
        //return mapper.toDomainList(result)
        return mapper.toDomainList(recipeService.search(token, page, query).recipes) // 2nd method
    }

    override suspend fun get(token: String, id: Int): Recipe {
        return mapper.mapToDomainModel(recipeService.get(token, id))
    }
}