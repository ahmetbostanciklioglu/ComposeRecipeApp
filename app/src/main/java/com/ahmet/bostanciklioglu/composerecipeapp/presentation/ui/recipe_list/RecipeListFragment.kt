package com.ahmet.bostanciklioglu.composerecipeapp.presentation.ui.recipe_list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.ahmet.bostanciklioglu.composerecipeapp.R
import com.ahmet.bostanciklioglu.composerecipeapp.network.model.RecipeDtoMapper
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class RecipeListFragment : Fragment() {

    private val viewModel: RecipeListViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("FRAGMENT: ${viewModel.getRepo()}")
        println("FRAGMENT: ${viewModel.getToken()}")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return ComposeView(requireContext()).apply {
            setContent {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "Recipe List",
                        style = TextStyle(
                            fontSize = 21.sp
                        )
                    )
                    Spacer(modifier = Modifier.padding(10.dp))
                    Button(
                        onClick = {
                            findNavController().navigate(R.id.viewRecipe)
                        }
                    ) {
                        Text(text = "TO RECIPE FRAGMENT")
                    }
                }
            }
        }
    }

}