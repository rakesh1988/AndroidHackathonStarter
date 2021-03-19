package com.rakesh.androidhackathonstarter.di

import com.rakesh.androidhackathonstarter.BaseApplication
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ActivityBuildersModule::class
    ]
)
interface ApplicationComponent : AndroidInjector<BaseApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: BaseApplication): Builder

        fun build(): ApplicationComponent
    }

    override fun inject(instance: BaseApplication)
}