package com.example.demo.controllers.koin

import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

import android.app.Application

class MainApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MainApplication)
            modules(appModule)
        }
    }
}