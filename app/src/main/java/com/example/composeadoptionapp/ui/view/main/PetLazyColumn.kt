package com.example.composeadoptionapp.ui.view.main

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.composeadoptionapp.data.Pet

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PetLazyColumn(modifier: Modifier, pets: List<Pet>, onPetClick: (Pet) -> Unit) {
    val scrollState = rememberLazyListState()
    LazyColumn(
        modifier = modifier, scrollState,
        content = {

            items(pets.size) { index ->
                PetCardListItem(pet = pets[index], onPetClick = onPetClick)
            }
        },
    )
}