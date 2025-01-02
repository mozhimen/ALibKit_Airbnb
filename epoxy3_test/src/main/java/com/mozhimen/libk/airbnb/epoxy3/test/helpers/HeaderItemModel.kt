package com.mozhimen.libk.airbnb.epoxy3.test.helpers

import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.mozhimen.libk.airbnb.epoxy3.test.R

/**
 * @ClassName HeaderItemModel
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2025/1/2 23:12
 * @Version 1.0
 */
@EpoxyModelClass
abstract class HeaderItemModel: EpoxyModelWithHolder<HeaderItemModel.Holder>() {
    @EpoxyAttribute
    lateinit var title: String

    override fun getDefaultLayout(): Int {
        return R.layout.view_holder_header_item
    }

    override fun bind(holder: Holder) {
        super.bind(holder)
        holder.title.text = title
    }

    class Holder : EpoxyHolder() {

        lateinit var title: AppCompatTextView

        override fun bindView(itemView: View) {
            title = itemView.findViewById(R.id.header_title)
        }
    }
}