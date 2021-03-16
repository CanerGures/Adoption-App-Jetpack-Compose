package com.example.composeadoptionapp.ui.view.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.composeadoptionapp.data.Pet
import com.example.composeadoptionapp.data.PetRepository
import kotlinx.coroutines.launch

class PetDetailsViewModel : ViewModel() {

    private val petRepository = PetRepository()
    private val petLiveData = MutableLiveData<Pet>()
    val petData: LiveData<Pet>
        get() = petLiveData

    fun loadPetInfo(petId: String) {
        viewModelScope.launch {
            petLiveData.value = petRepository.getPetById(petId)
        }
    }
}