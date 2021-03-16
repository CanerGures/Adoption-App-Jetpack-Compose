package com.example.composeadoptionapp.ui.view.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.composeadoptionapp.data.Pet
import com.example.composeadoptionapp.data.PetRepository
import kotlinx.coroutines.launch

class PetMainScreenViewModel : ViewModel() {
    private val petRepository = PetRepository()
    private val petLiveData = MutableLiveData<List<Pet>>()
    val petsData: LiveData<List<Pet>>
        get() = petLiveData

    init {
        viewModelScope.launch {
            petLiveData.value = petRepository.getListPets()
        }
    }
}