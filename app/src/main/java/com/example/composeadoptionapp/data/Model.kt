package com.example.composeadoptionapp.data

data class Pet(
    val id: String,
    val name: String,
    val description: String,
    val imageUrl: String,
    val gender: Gender,
    val weightKg: Float,
    val breed: String,
    val location: String,
    val age: Int,
    val label: PetLabel,
    val behavior: Behaviour,
    val vaccination: Vaccination,
    val health: String

)

enum class PetLabel {
    Puppy,
    Young,
    Elder
}

enum class Behaviour {
    Friendly,
    Stubborn,
    Angry,
    Happy,
    Excited,
    Lazy,
    Loyal
}

enum class Gender {
    Male,
    Female,
    NotSpecified
}

enum class Vaccination {
    Vaccinated,
    Unvaccinated
}