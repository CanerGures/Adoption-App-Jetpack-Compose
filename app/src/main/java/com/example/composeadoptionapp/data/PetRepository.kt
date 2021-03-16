package com.example.composeadoptionapp.data

class PetRepository {
    private val listOfPets = listOf(
        dog1, dog2, dog3, dog4, dog5, dog6, dog7,
        dog8, dog9, dog10
    )

    fun getListPets(): List<Pet> {
        return listOfPets
    }

    fun getPetById(id: String): Pet? {
        return listOfPets.find { it.id == id }
    }
}

val dog1 = Pet(
    "1",
    "Brodie",
    "Brodie is gorgeous, 4 year old female (whelped 4/22/17) German Shepherd in desperate need of a good home with an active lifestyle, experienced owner . She has been living outside but is in great physical condition. Brodie is housebroken, current on vaccinations and was spayed on 1/27/21. She is wary of new people, prefers women over men and needs some socialization and work on her leash manners. Brodie has tested positive for heartworms, but we have already begun her treatment and she is doing great ! We believe once socialized, Brodie will be OK with other dogs, but for now she needs to be the only pet in the home.",
    "https://images.unsplash.com/photo-1589941013453-ec89f33b5e95?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1003&q=80",
    Gender.Male,
    39.4f,
    "German Sheppard",
    "Iverness, Florida",
    4,
    PetLabel.Young,
    Behaviour.Loyal,
    Vaccination.Vaccinated,
    "Healthy"
)

val dog2 = Pet(
    "2",
    "Nelson",
    "Nelson is a young sweet Akita that loves people. He may get along with a female dog of his size, with proper introduction. Nelson needs a secure home and yard and some basic obedience training. He is currently boarding in Memphis TN.",
    "https://images.unsplash.com/photo-1523171067267-bb96f975c4bb?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=1000&q=80",
    Gender.Female,
    29.3f,
    "Akita Inu",
    "JacksonVille, Florida",
    2,
    PetLabel.Young,
    Behaviour.Happy,
    Vaccination.Unvaccinated,
    "Healthy"
)

val dog3 = Pet(
    "3",
    "Herman",
    "Herman has been patiently waiting in a foster home where he cannot get enough playtime with other dogs or annoying the family cat. He foster mom says he's crate and house-trained, a goofy cuddler and a bit vocal when he really wants the treat in your hand. You could never tell Joker was a throw-away since he is constantly wanting to give you kisses.",
    "https://images.unsplash.com/photo-1547407139-3c921a66005c?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=934&q=80",
    Gender.Male,
    32.2f,
    "Husky",
    "Colorado Springs, Colorado",
    9,
    PetLabel.Elder,
    Behaviour.Stubborn,
    Vaccination.Vaccinated,
    "Healthy"
)

val dog4 = Pet(
    "4",
    "Daisy",
    "Daisy is a bright, sensitive dog who enjoys play with his human family and responds well to training. As herders bred to move cattle, they are fearless and independent. They are vigilant watchdogs, with acute senses and a “big dog” bark. Families who can meet their bold but kindly Pembroke’s need for activity and togetherness will never have a more loyal, loving pet.",
    "https://images.unsplash.com/photo-1611170874942-4f4bed56a14a?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=1600&q=80",
    Gender.Female,
    9.8f,
    "Golden Retriever",
    "Whitewright, Texas",
    1,
    PetLabel.Puppy,
    Behaviour.Excited,
    Vaccination.Vaccinated,
    "Healthy"
)

val dog5 = Pet(
    "5",
    "Micy",
    "Micy is a bright, sensitive dog who enjoys play with his human family and responds well to training. As herders bred to move cattle, they are fearless and independent. They are vigilant watchdogs, with acute senses and a “big dog” bark. Families who can meet their bold but kindly Pembroke’s need for activity and togetherness will never have a more loyal, loving pet.",
    "https://images.unsplash.com/photo-1587790311640-50b019663f01?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1100&q=80",
    Gender.Female,
    19.5f,
    "Pitbull",
    "Starkville, Mississippi",
    12,
    PetLabel.Elder,
    Behaviour.Angry,
    Vaccination.Vaccinated,
    "Disabled"
)
val dog6 = Pet(
    "6",
    "Skippy",
    "Skippy came to Mutt Love as a stray from NC. Skippy is about three years old and weighs 12kg. Skippy is heartworm positive and will need to undergo heartworm treatment. He would benefit from a foster home while recouping from the treatment.",
    "https://images.unsplash.com/photo-1543466835-00a7907e9de1?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1567&q=80",
    Gender.Female,
    12.3f,
    "Beagle",
    "Fairfax, Virginia",
    2,
    PetLabel.Young,
    Behaviour.Friendly,
    Vaccination.Unvaccinated,
    "Diarrhoea"
)

val dog7 = Pet(
    "7",
    "Yuki",
    "Yuki is a 3 year old Samoyed breed, who just wants all the attention and affection he can get! He is dog friendly but NOT cat friendly (unsure of how he is with smaller dogs). He is very vocal and treat motivated and will let you know when he doesn't like something. He loves to run around outside and go for walks but mostly wants to stay right next to his humans. Yuki is an Alpha, but plays well with others.",
    "https://images.unsplash.com/photo-1529429617124-95b109e86bb8?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=975&q=80",
    Gender.Male,
    22.4f,
    "Samoyed",
    "Quinlan, Texas",
    3,
    PetLabel.Young,
    Behaviour.Friendly,
    Vaccination.Unvaccinated,
    "Heartworm"
)

val dog8 = Pet(
    "8",
    "Lilly",
    "Lilly has been patiently waiting in a foster home where she cannot get enough playtime with other dogs or annoying (and taking naps next to) the family cat. Her foster mom says she's crate and house-trained, a goofy cuddler and a bit vocal when she really wants the treat in your hand. You could never tell Lilly was a throw-away since she is constantly wanting to give you kisses.",
    "https://images.unsplash.com/photo-1478991031579-5f22c0ee9c9f?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1650&q=80",
    Gender.Female,
    4.7f,
    "Yorkshire Terrier",
    "Sharon, Connecticut",
    1,
    PetLabel.Puppy,
    Behaviour.Stubborn,
    Vaccination.Unvaccinated,
    "Healthy"
)

val dog9 = Pet(
    "9",
    "Joker",
    "Joker has been patiently waiting in a foster home where he cannot get enough playtime with other dogs or annoying the family cat. He foster mom says he's crate and house-trained, a goofy cuddler and a bit vocal when he really wants the treat in your hand. You could never tell Joker was a throw-away since he is constantly wanting to give you kisses.",
    "https://images.unsplash.com/photo-1516131537578-9ca049cc6b59?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=1650&q=80",
    Gender.Male,
    35.8f,
    "Alaskan Malamute",
    "Norco, California",
    10,
    PetLabel.Elder,
    Behaviour.Stubborn,
    Vaccination.Vaccinated,
    "Arthritis"
)

val dog10 = Pet(
    "10",
    "Libby",
    "Libby has been patiently waiting in a foster home where she cannot get enough playtime with other dogs or annoying (and taking naps next to) the family cat. Her foster mom says she's crate and house-trained, a goofy cuddler and a bit vocal when she really wants the treat in your hand. You could never tell Libby was a throw-away since she is constantly wanting to give you kisses.",
    "https://images.unsplash.com/photo-1599765625577-61a6e65e3567?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1077&q=80",
    Gender.Female,
    8.3f,
    "Dalmatian",
    "Houston, Texas",
    1,
    PetLabel.Puppy,
    Behaviour.Excited,
    Vaccination.Vaccinated,
    "Healthy"
)
