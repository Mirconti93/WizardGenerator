package com.example.wizardgenerator

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class WizardApplication : Application() {


    companion object {
        lateinit var instance: WizardApplication
    }

    init {
        instance = this
    }

    fun getStringById(id: Int): String {
        return getString(id)
    }




}