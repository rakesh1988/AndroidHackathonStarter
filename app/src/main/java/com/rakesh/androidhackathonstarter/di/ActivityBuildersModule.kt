package com.rakesh.androidhackathonstarter.di

import com.rakesh.androidhackathonstarter.view.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(
        modules = [
            MainActivityModule::class
        ]
    )
    abstract fun providesMainActivity(): MainActivity
}