package com.ahmet.bostanciklioglu.composerecipeapp.network.model

import com.ahmet.bostanciklioglu.composerecipeapp.domain.model.Recipe
import com.ahmet.bostanciklioglu.composerecipeapp.domain.util.EntityMapper

class RecipeNetworkMapper : EntityMapper<RecipeNetworkEntity, Recipe> {

    //Map from recipe entity[network data class] to recipe[domain recipe which is shared to Ui data class]
    override fun mapFromEntity(entity: RecipeNetworkEntity): Recipe {
        return Recipe(
            id = entity.pk,
            title = entity.title,
            publisher = entity.publisher,
            featuredImage = entity.featuredImage,
            rating = entity.rating,
            sourceUrl = entity.sourceUrl,
            description = entity.description,
            cookingInstructions = entity.cookingInstructions,
            dateAdded = entity.dateAdded,
            dateUpdated = entity.dateUpdated,
            ingredients = entity.ingredients ?: listOf()
        )
    }

    //Map from recipe [domain recipe which is shared to Ui data class] to recipe[network data class]
    override fun mapToEntity(domainModel: Recipe): RecipeNetworkEntity {
        return RecipeNetworkEntity(
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

    fun fromEntityList(initial: List<RecipeNetworkEntity>): List<Recipe> {
        return initial.map {
            mapFromEntity(it)
        }
    }

    fun toEntityList(initial: List<Recipe>): List<RecipeNetworkEntity> {
        return initial.map {
            mapToEntity(it)
        }
    }

}