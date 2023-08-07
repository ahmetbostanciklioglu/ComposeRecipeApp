package com.ahmet.bostanciklioglu.composerecipeapp.di

import com.ahmet.bostanciklioglu.composerecipeapp.network.RecipeService
import com.ahmet.bostanciklioglu.composerecipeapp.network.model.RecipeDtoMapper
import com.ahmet.bostanciklioglu.composerecipeapp.network.repository.RecipeRepository
import com.ahmet.bostanciklioglu.composerecipeapp.network.repository.RecipeRepository_Impl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideRecipeRepository(
        recipeService: RecipeService,
        recipeDtoMapper: RecipeDtoMapper
    ): RecipeRepository {
        return RecipeRepository_Impl(
            recipeService, recipeDtoMapper
        )
    }
}