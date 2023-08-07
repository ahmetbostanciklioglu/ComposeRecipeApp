package com.ahmet.bostanciklioglu.composerecipeapp.network.model

import com.ahmet.bostanciklioglu.composerecipeapp.domain.model.Recipe
import com.ahmet.bostanciklioglu.composerecipeapp.domain.util.DomainMapper

class RecipeDtoMapper : DomainMapper<RecipeDto, Recipe> {

    //Map from recipe entity[network data class] to recipe[domain recipe which is shared to Ui data class]
    override fun mapToDomainModel(model: RecipeDto): Recipe {
        return Recipe(
            id = model.pk,
            title = model.title,
            publisher = model.publisher,
            featuredImage = model.featuredImage,
            rating = model.rating,
            sourceUrl = model.sourceUrl,
            description = model.description,
            cookingInstructions = model.cookingInstructions,
            dateAdded = model.dateAdded,
            dateUpdated = model.dateUpdated,
            ingredients = model.ingredients ?: listOf()
        )
    }

    //Map from recipe [domain recipe which is shared to Ui data class] to recipe[network data class]
    override fun mapFromDomainModel(domainModel: Recipe): RecipeDto {
        return RecipeDto(
            pk = domainModel.id,
            title = domainModel.title,
            publisher = domainModel.publisher,
            featuredImage = domainModel.featuredImage,
            rating = domainModel.rating,
            sourceUrl = domainModel.sourceUrl,
            description = domainModel.description,
            cookingInstructions = domainModel.cookingInstructions,
            dateAdded = domainModel.dateAdded,
            dateUpdated = domainModel.dateUpdated,
            ingredients = domainModel.ingredients
        )
    }

    fun fromEntityList(initial: List<RecipeDto>): List<Recipe> {
        return initial.map {
            mapToDomainModel(it)
        }
    }

    fun toEntityList(initial: List<Recipe>): List<RecipeDto> {
        return initial.map {
            mapFromDomainModel(it)
        }
    }

}