package com.shabinder.common.di.analytics

import org.koin.dsl.bind
import org.koin.dsl.module

// TODO("Not yet implemented")
private val webAnalytics =
    object : AnalyticsManager {
        override fun init() {}

        override fun onStart() {}

        override fun onStop() {}

        override fun giveConsent() {}

        override fun isTracking(): Boolean = false

        override fun revokeConsent() {}

        override fun sendView(name: String, extras: Map<String, Any>) {}

        override fun sendEvent(eventName: String, extras: Map<String, Any>) {}

        override fun sendCrashReport(error: Throwable, extras: Map<String, Any>) {}
    }

actual fun analyticsModule() = module {
    single { webAnalytics } bind AnalyticsManager::class
}