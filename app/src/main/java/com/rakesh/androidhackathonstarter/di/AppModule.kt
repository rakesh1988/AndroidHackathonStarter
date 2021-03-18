package com.rakesh.androidhackathonstarter.di

import android.content.Context
import com.rakesh.androidhackathonstarter.BaseApplication
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    fun providesContext(application: BaseApplication): Context {
        return application.applicationContext
    }

    @Provides
    fun provideMagicString(): String = "here is the magic string"
}