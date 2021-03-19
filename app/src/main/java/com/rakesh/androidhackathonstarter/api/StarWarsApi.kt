package com.rakesh.androidhackathonstarter.api

import com.rakesh.androidhackathonstarter.api.remotemodel.People
import retrofit2.http.GET

interface StarWarsApi {

    @GET("people/")
    suspend fun getPeople(): People
}