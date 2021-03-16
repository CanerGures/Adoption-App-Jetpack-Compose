package com.example.composeadoptionapp.ui.view.main

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.example.composeadoptionapp.R
import com.example.composeadoptionapp.data.Pet
import com.example.composeadoptionapp.data.dog1
import com.example.composeadoptionapp.data.dog3
import com.example.composeadoptionapp.data.dog4
import com.example.composeadoptionapp.ui.theme.background

@Composable
fun PetMainScreen(navController: NavController, viewModel: PetMainScreenViewModel) {
    val pets = viewModel.petsData.observeAsState(emptyList())
    PetListScreenContent(pets = pets.value) { pet ->
        val petId = pet.id
        navController.navigate(route = "details/$petId")
    }
}

@Preview
@Composable
fun PetListPreview() {
    PetListScreenContent(pets = listOf(dog1, dog3, dog4), onPetSelected = {})
}

@Composable
fun PetListScreenContent(pets: List<Pet>, onPetSelected: (Pet) -> Unit) {
    Surface(color = background, elevation = 4.dp) {
        Column {
            Row(
                modifier = Modifier
                    .height(80.dp)
                    .fillMaxWidth()
                    .padding(end = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = stringResource(id = R.string.app_name),
                    style = MaterialTheme.typography.h5,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(
                            start = 24.dp,
                            end = 24.dp,
                            top = 24.dp,
                            bottom = 8.dp
                        )
                )
            }

            PetLazyColumn(
                modifier = Modifier.padding(
                    start = 12.dp,
                    end = 12.dp
                ),
                pets
            ) { pet ->
                onPetSelected(pet)
            }
        }
    }
}
