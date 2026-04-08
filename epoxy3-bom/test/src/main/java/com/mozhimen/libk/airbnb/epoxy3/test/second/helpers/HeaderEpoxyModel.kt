package com.mozhimen.libk.airbnb.epoxy3.test.second.helpers

import android.view.View
import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.mozhimen.libk.airbnb.epoxy3.test.R

/**
 * @ClassName HeaderEpoxyModel
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2025/1/5 14:35
 * @Version 1.0
 */
@EpoxyModelClass
abstract class HeaderEpoxyModel : EpoxyModelWithHolder<HeaderEpoxyModel.Holder>() {
    @EpoxyAttribute
    var text = ""

    override fun getDefaultLayout(): Int {
        return R.layout.second_item_header
    }

    override fun bind(holder: Holder) {
        super.bind(holder)
        holder.textView.text=text
    }

    class Holder : EpoxyHolder() {
        lateinit var textView: TextView
        override fun bindView(itemView: View) {
            textView = itemView.findViewById(R.id.textView)
        }
    }
}