package com.example.spacexlaunches

import android.app.Application
import com.example.spacexlaunches.koin.apiModule
import com.example.spacexlaunches.koin.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            androidLogger()
            modules(
                apiModule,
                viewModelModule
            )
        }
    }

}