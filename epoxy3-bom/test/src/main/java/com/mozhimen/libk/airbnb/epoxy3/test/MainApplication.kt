package com.mozhimen.libk.airbnb.epoxy3.test

import android.app.Application
import com.airbnb.epoxy.Carousel

/**
 * @ClassName MainApplication
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2025/1/2 23:10
 * @Version 1.0
 */
class MainApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        Carousel.setDefaultGlobalSnapHelperFactory(null)
    }
}