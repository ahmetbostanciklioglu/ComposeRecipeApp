package com.ahmet.bostanciklioglu.composerecipeapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ahmet.bostanciklioglu.composerecipeapp.domain.model.Recipe
import com.ahmet.bostanciklioglu.composerecipeapp.network.model.RecipeNetworkEntity
import com.ahmet.bostanciklioglu.composerecipeapp.network.model.RecipeNetworkMapper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mapper = RecipeNetworkMapper()

        val recipe = Recipe()

        val networkEntity: RecipeNetworkEntity = mapper.mapToEntity(recipe)

        val r : Recipe = mapper.mapFromEntity(networkEntity)
    }
}

