package com.mozhimen.libk.airbnb.epoxy3.test

import android.graphics.Rect
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mozhimen.bindk.bases.viewdatabinding.activity.BaseActivityVDB
import com.mozhimen.libk.airbnb.epoxy3.test.databinding.ActivitySecondBinding
import com.mozhimen.libk.airbnb.epoxy3.test.second.helpers.PhotoController
import com.mozhimen.libk.airbnb.epoxy3.test.second.helpers.PhotoEpoxyModel_

/**
 * @ClassName SecondActivity
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2025/1/5 14:10
 * @Version 1.0
 */
class SecondActivity : BaseActivityVDB<ActivitySecondBinding>() {
    lateinit var controller: PhotoController

    override fun initView(savedInstanceState: Bundle?) {
        initToolbar()
        initEpoxyRecyclerView()
        initSmartLayout()
    }

    private fun initToolbar() {
        vdb.toolbar.setOnMenuItemClickListener { item ->
            when (item?.itemId) {
                R.id.showData -> {
                    controller.setLoading(false)
                    controller.setPhoto(listOf(1, 2, 3, 4, 5, 6, 7))
                }

                R.id.switchLayout -> {

                }
            }
            true
        }
    }

    //都用了Epoxy當然就順便用他們的EpoxyRecyclerView
    private fun initEpoxyRecyclerView() {
        controller = PhotoController()
        //EpoxyRecyclerView預設的layoutManager就是Linear垂直的了
        vdb.rv.layoutManager = GridLayoutManager(this, 2)
        //設置Controller順便buildModel
        vdb.rv.setControllerAndBuildModels(controller)

        //設置ItemDecoration
        vdb.rv.addItemDecoration(object : RecyclerView.ItemDecoration() {
            override fun getItemOffsets(
                outRect: Rect,
                view: View,
                parent: RecyclerView,
                state: RecyclerView.State
            ) {
                super.getItemOffsets(outRect, view, parent, state)
                val position = parent.getChildLayoutPosition(view)
                val model = controller.adapter.getModelAtPosition(position)

                if (model is PhotoEpoxyModel_) {
                    if (model.position % 2 == 0) {
                        outRect.left = 16
                        outRect.right = 8
                    } else {
                        outRect.left = 8
                        outRect.right = 16
                    }
                    outRect.bottom = 12
                }

            }
        })
    }

    //測試搭配SmartLayout載入更多方法
    private fun initSmartLayout() {
        vdb.smartLayout.setHeaderHeight(0f)
        vdb.smartLayout.setEnableRefresh(false)
//        smartLayout.setEnableLoadMore(false)
        vdb.smartLayout.setOnLoadMoreListener {
            Handler().postDelayed({
                controller.setPhoto(listOf(1, 1))
                vdb.smartLayout.finishLoadMore()
            }, 1000)
        }
    }
}