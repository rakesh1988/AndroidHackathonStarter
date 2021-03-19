package com.rakesh.androidhackathonstarter.view

import android.util.Log
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MainActivityViewModel @Inject constructor() : ViewModel() {

    fun makeMagic() {
        Log.d(TAG, "makeMagic: now")
    }

    companion object {
        private const val TAG = "MainActivityViewModel"
    }
}