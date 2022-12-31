package jsy.test.mvvmsample

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MvvmSampleApplication : Application() {

    companion object {
        lateinit var instance: MvvmSampleApplication
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}