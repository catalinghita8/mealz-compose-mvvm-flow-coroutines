package com.codingtroops.mealzapp.ui.details

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import coil.transform.CircleCropTransformation
import com.codingtroops.model.response.MealResponse

@Composable
fun MealDetailsScreen(meal: MealResponse?) {
    var isExpanded by remember { mutableStateOf(false) }
    val imageSizeDp: Dp by animateDpAsState(
        targetValue = if (isExpanded) 200.dp else 100.dp
    )
    Column {
        Row {
            Card {
                Image(
                    painter = rememberImagePainter(data = meal?.imageUrl,
                        builder = {
                            transformations(CircleCropTransformation())
                        }),
                    contentDescription = null,
                    modifier = Modifier
                        .size(imageSizeDp)
                        .padding(8.dp)
                )
            }
            Text(
                text = meal?.name ?: "default name",
                modifier = Modifier
                    .padding(16.dp)
                    .align(Alignment.CenterVertically)
            )
        }
        Button(modifier = Modifier
            .padding(16.dp),
            onClick = {
                isExpanded = !isExpanded
            }) {
            Text("Change state of meal profile picture")
        }
    }
}