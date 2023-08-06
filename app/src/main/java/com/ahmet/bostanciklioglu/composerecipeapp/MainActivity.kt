package com.ahmet.bostanciklioglu.composerecipeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ahmet.bostanciklioglu.composerecipeapp.ui.theme.ComposeRecipeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeRecipeAppTheme {
                // A surface container using the 'background' color from the theme

                val scrollState = rememberScrollState()
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(scrollState)
                        .background(color = Color(0xFFF2F2F2))

                ) {
                    Image(
                        bitmap = ImageBitmap.imageResource(id = R.drawable.happy_meal_small),
                        contentDescription = null,
                        modifier = Modifier.height(300.dp),
                        contentScale = ContentScale.Crop
                    )
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(
                            text = "Happy Meal",
                            style = TextStyle(fontSize = 26.sp)
                        )
                        Spacer(modifier = Modifier.padding(top = 8.dp))
                        Text(
                            text = "800 calories",
                            style = TextStyle(fontSize = 17.sp)
                        )
                        Spacer(modifier = Modifier.padding(top = 8.dp))
                        Text(
                            text = "$5.99",
                            style = TextStyle(
                                color = Color(0xFF85bb65),
                                fontSize = 17.sp
                            )
                        )
                    }
                }
            }
        }
    }
}

