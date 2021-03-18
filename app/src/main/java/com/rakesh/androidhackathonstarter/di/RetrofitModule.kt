package com.rakesh.androidhackathonstarter.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named

@Module
@InstallIn(SingletonComponent::class)
class RetrofitModule {

    @Provides
    @Named("BASE_URL")
    fun provideBaseUrl(): String {
        return "YOUR_API_URL"
    }

    @Provides
    fun provideRetrofit(
        gsonConverterFactory: GsonConverterFactory,
        @Named("BASE_URL") baseUrl: String
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(gsonConverterFactory)
            .build()
    }

    @Provides
    fun provideGsonConverterFactory(): GsonConverterFactory {
        return GsonConverterFactory.create()
    }
}