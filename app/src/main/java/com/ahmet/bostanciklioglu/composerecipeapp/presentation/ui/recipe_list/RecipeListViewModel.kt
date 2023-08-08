package com.ahmet.bostanciklioglu.composerecipeapp.presentation.ui.recipe_list

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ahmet.bostanciklioglu.composerecipeapp.domain.model.Recipe
import com.ahmet.bostanciklioglu.composerecipeapp.network.model.RecipeDtoMapper
import com.ahmet.bostanciklioglu.composerecipeapp.network.repository.RecipeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class RecipeListViewModel
@Inject
constructor(
    private val repository: RecipeRepository,
    private @Named("auth_token") val token: String
) : ViewModel() {

    //First method for persisting data
    /*private val _recipes: MutableLiveData<List<Recipe>> = MutableLiveData()
    val recipes: LiveData<List<Recipe>> get() = _recipes
    init {
        //1st method for persisting data in viewModels
        viewModelScope.launch { 
            val result = repository.search(token = token, page = 1, query = "chicken")
            _recipes.value = result
        }
    }*/

    //2nd method for persisting data
    val recipes: MutableState<List<Recipe>> = mutableStateOf(listOf())
    init {
        //1st method for persisting data in viewModels
        viewModelScope.launch {
            val result = repository.search(token = token, page = 1, query = "chicken")
            recipes.value = result
        }
    }
}