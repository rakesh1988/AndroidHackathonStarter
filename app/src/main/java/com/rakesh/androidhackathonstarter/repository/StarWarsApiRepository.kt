package com.rakesh.androidhackathonstarter.repository

import com.rakesh.androidhackathonstarter.api.StarWarsApi
import com.rakesh.androidhackathonstarter.api.remotemodel.People
import retrofit2.Retrofit
import javax.inject.Inject

class StarWarsApiRepository @Inject constructor(val starWarsApi: StarWarsApi) {

    suspend fun getStarWarsPeople(): People {
        return starWarsApi.getPeople()
    }

}