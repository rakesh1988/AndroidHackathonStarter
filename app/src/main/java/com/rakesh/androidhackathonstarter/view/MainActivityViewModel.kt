package com.rakesh.androidhackathonstarter.view

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor() : ViewModel() {

    private val TAG = "MainActivityViewModel"

    fun doSomeMagic() {
        Log.v(TAG, "here i made some magic")
    }
}