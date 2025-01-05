package com.mozhimen.libk.airbnb.epoxy3.test

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.mozhimen.bindk.bases.viewdatabinding.activity.BaseActivityVDB
import com.mozhimen.libk.airbnb.epoxy3.test.databinding.ActivityMainBinding
import com.mozhimen.libk.airbnb.epoxy3.test.helpers.HomeController
import com.mozhimen.libk.airbnb.epoxy3.test.mos.Data

class MainActivity : BaseActivityVDB<ActivityMainBinding>() {
    override fun initView(savedInstanceState: Bundle?) {
        val controller = HomeController()
        vdb.mainRecycler.setController(controller)
        controller.allMessages = Data.messages
        controller.recentlyActive = Data.recentlyActive
    }
}