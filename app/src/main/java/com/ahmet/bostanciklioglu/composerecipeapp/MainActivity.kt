package com.ahmet.bostanciklioglu.composerecipeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.ahmet.bostanciklioglu.composerecipeapp.ui.theme.ComposeRecipeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeRecipeAppTheme {
                // A surface container using the 'background' color from the theme

                Column(
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                        .border(border = BorderStroke(width = 1.dp, color = Color.Black))
                ) {
                    Text(text = "ITEM 1", modifier = Modifier.align(Alignment.CenterHorizontally))
                }
                Row(
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                        .border(border = BorderStroke(width = 1.dp, color = Color.Black))
                ) {
                    Text(text = "ITEM 2", modifier = Modifier.align(Alignment.CenterVertically))
                }

            }
        }
    }
}

