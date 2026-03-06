package com.example.assignment

import android.app.Application
import com.example.assignment.di.AppComponent
import com.example.assignment.di.AppModule
import com.example.assignment.di.DaggerAppComponent

class MyApp : Application() {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()
    }
}