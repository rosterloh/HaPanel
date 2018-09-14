package com.rosterloh.things.hapanel

import android.app.Application
import com.rosterloh.things.hapanel.di.appModule
import com.rosterloh.things.hapanel.util.CrashlyticsTree
import org.koin.android.ext.android.startKoin
import timber.log.Timber

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        } else {
            Timber.plant(CrashlyticsTree())
        }

        startKoin(this, listOf(appModule))
    }
}