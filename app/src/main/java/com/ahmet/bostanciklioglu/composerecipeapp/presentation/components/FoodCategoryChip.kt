package com.ahmet.bostanciklioglu.composerecipeapp.presentation.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun FoodCategoryChip(
    category: String,
    isSelected: Boolean = false,
    onSelectedCategoryChanged: (String) -> Unit,
    onExecuteSearch: () -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = Modifier.padding(end = 8.dp),
        shape = MaterialTheme.shapes.small,
        color = if (isSelected) Color.LightGray else MaterialTheme.colorScheme.primary
    ) {
        Row(
            modifier = Modifier
                .toggleable(
                    value = isSelected,
                    onValueChange = {
                        onSelectedCategoryChanged(category)
                        onExecuteSearch()
                    }
                )
        ) {
            Text(
                text = category,
                modifier = Modifier.padding(8.dp),
                style = MaterialTheme.typography.bodySmall,
                color = Color.White,
            )
        }
    }
}