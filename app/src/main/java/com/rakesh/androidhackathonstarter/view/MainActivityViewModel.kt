package com.rakesh.androidhackathonstarter.view

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rakesh.androidhackathonstarter.api.remotemodel.People
import com.rakesh.androidhackathonstarter.repository.StarWarsApiRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(val starWarsApiRepository: StarWarsApiRepository) :
    ViewModel() {

    private val TAG = "MainActivityViewModel"

    fun doSomeMagic() {
        Log.v(TAG, "here i made some magic")
        viewModelScope.launch {
            starWarsApiRepository.getStarWarsPeople().results?.forEach {
                Log.d(TAG, "doSomeMagic: " + it.name)
            }
        }
    }
}