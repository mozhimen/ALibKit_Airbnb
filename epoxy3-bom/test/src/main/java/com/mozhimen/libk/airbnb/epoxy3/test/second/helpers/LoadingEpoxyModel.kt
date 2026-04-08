package com.mozhimen.libk.airbnb.epoxy3.test.second.helpers

import android.view.View
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.mozhimen.libk.airbnb.epoxy3.test.R

/**
 * @ClassName LoadingEpoxyModel
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2025/1/5 14:37
 * @Version 1.0
 */
@EpoxyModelClass
abstract class LoadingEpoxyModel : EpoxyModelWithHolder<LoadingEpoxyModel.Holder>() {
    override fun getDefaultLayout(): Int {
        return R.layout.second_item_loading
    }

    override fun bind(view: Holder) {
        super.bind(view)
    }

    class Holder : EpoxyHolder() {
        override fun bindView(itemView: View) {

        }
    }
}