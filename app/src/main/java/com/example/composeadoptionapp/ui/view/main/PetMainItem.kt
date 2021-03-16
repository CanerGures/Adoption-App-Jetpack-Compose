package com.example.composeadoptionapp.ui.view.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeadoptionapp.R
import com.example.composeadoptionapp.data.*
import com.example.composeadoptionapp.ui.theme.*
import com.example.composeadoptionapp.ui.view.customcomponent.Chip
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun PetCardListItem(pet: Pet, onPetClick: (Pet) -> Unit) {
    Card(
        modifier = Modifier
            .padding(start = 4.dp, end = 4.dp, top = 4.dp, bottom = 8.dp)
            .clip(RoundedCornerShape(20.dp))
            .clickable {
                onPetClick(pet)
            },
        elevation = 8.dp
    ) {

        Row {
            Column {
                Row {
                    AgeChip(pet = pet)
                    GenderIcon(pet = pet)
                }
                BehaviourChip(pet)
                Text(
                    pet.name,
                    style = MaterialTheme.typography.h6,
                    modifier = Modifier
                        .padding(start = 8.dp, end = 8.dp)
                        .width(120.dp),
                    fontWeight = FontWeight.SemiBold
                )
                Text(
                    pet.breed,
                    style = MaterialTheme.typography.body2,
                    modifier = Modifier.padding(start = 8.dp, end = 8.dp, top = 2.dp, bottom = 0.dp)
                )
                Text(
                    pet.weightKg.toString() + " kg",
                    style = MaterialTheme.typography.body2,
                    modifier = Modifier.padding(start = 8.dp, end = 8.dp, top = 0.dp, bottom = 8.dp)
                )
                Text(
                    pet.vaccination.name,
                    style = MaterialTheme.typography.body2,
                    modifier = Modifier.padding(start = 8.dp, end = 8.dp, top = 0.dp, bottom = 8.dp)
                )
            }
            CoilImage(
                fadeIn = true,
                data = pet.imageUrl,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .clip(
                        RoundedCornerShape(
                            topStart = 120.dp,
                            topEnd = 20.dp,
                            bottomStart = 0.dp,
                            bottomEnd = 20.dp
                        )
                    )
            )
        }
    }
}

@Composable
fun AgeChip(pet: Pet) {
    when (pet.label) {
        PetLabel.Puppy -> {
            Chip(
                "Puppy",
                color = purpleButtonLight,
                textColor = purple500,
                modifier = Modifier
                    .padding(start = 8.dp, top = 24.dp)
                    .width(60.dp)
            )
        }
        PetLabel.Young -> {
            Chip(
                "Young",
                color = orangeButtonLight,
                textColor = orangeText,
                modifier = Modifier
                    .padding(start = 8.dp, top = 24.dp)
                    .width(60.dp)
            )
        }
        PetLabel.Elder -> {
            Chip(
                "Elder",
                color = elderBackground,
                textColor = elderTextColor,
                modifier = Modifier
                    .padding(start = 8.dp, top = 24.dp)
                    .width(60.dp)
            )
        }
    }
}

@Composable
fun GenderIcon(pet: Pet) {
    if (pet.gender == Gender.Male) {
        Image(
            painterResource(R.drawable.ic_male),
            "male",
            modifier = Modifier
                .size(42.dp)
                .padding(start = 8.dp, end = 8.dp, top = 30.dp, bottom = 0.dp)
        )
    } else if (pet.gender == Gender.Female) {
        Image(
            painterResource(R.drawable.ic_femenine),
            contentDescription = "female",
            modifier = Modifier
                .size(42.dp)
                .padding(start = 8.dp, end = 8.dp, top = 30.dp, bottom = 0.dp)
        )
    }
}

@Composable
fun BehaviourChip(pet: Pet) {
    when (pet.behavior) {
        Behaviour.Loyal -> {
            Chip(
                "Loyal",
                color = behaviourBackground,
                textColor = behaviourTextColor,
                modifier = Modifier.padding(start = 8.dp, top = 4.dp)
            )
        }
        Behaviour.Angry -> {
            Chip(
                "Angry",
                color = behaviourBackground,
                textColor = behaviourTextColor,
                modifier = Modifier.padding(start = 8.dp, top = 4.dp)
            )
        }
        Behaviour.Excited -> {
            Chip(
                "Excited",
                color = behaviourBackground,
                textColor = behaviourTextColor,
                modifier = Modifier.padding(start = 8.dp, top = 4.dp)
            )
        }
        Behaviour.Friendly -> {
            Chip(
                "Friendly",
                color = behaviourBackground,
                textColor = behaviourTextColor,
                modifier = Modifier.padding(start = 8.dp, top = 4.dp)
            )
        }
        Behaviour.Happy -> {
            Chip(
                "Happy",
                color = behaviourBackground,
                textColor = behaviourTextColor,
                modifier = Modifier.padding(start = 8.dp, top = 4.dp)
            )
        }
        Behaviour.Lazy -> {
            Chip(
                "Lazy",
                color = behaviourBackground,
                textColor = behaviourTextColor,
                modifier = Modifier.padding(start = 8.dp, top = 4.dp)
            )
        }
        Behaviour.Stubborn -> {
            Chip(
                "Stubborn",
                color = behaviourBackground,
                textColor = behaviourTextColor,
                modifier = Modifier.padding(start = 8.dp, top = 4.dp)
            )
        }
    }
}

@Preview
@Composable
fun PetPreview() {
    PetCardListItem(pet = dog3, onPetClick = { })
}
