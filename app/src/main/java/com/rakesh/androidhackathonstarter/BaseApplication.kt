package com.rakesh.androidhackathonstarter

import android.app.Application
import com.rakesh.androidhackathonstarter.di.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class BaseApplication : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        val applicationComponent = DaggerApplicationComponent.builder().application(this).build()
        applicationComponent.inject(this)
        return applicationComponent

    }
}