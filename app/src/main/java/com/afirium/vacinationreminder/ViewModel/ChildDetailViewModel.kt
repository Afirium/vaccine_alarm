package com.afirium.vacinationreminder.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.afirium.vacinationreminder.Data.Child
import com.afirium.vacinationreminder.Data.Repo
import com.afirium.vacinationreminder.Data.Vaccination

class ChildDetailViewModel (private val repo : Repo): ViewModel() {


    lateinit var child: LiveData<Child>
    lateinit var vaccinations: LiveData<List<Vaccination>>
    var childId :Long = -1
    set(value) {
        child = repo.getChild(value)
        vaccinations = repo.getVaccinationsForChild(value)
    }


}