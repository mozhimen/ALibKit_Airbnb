package com.mozhimen.libk.airbnb.epoxy3.test.second.helpers

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.mozhimen.libk.airbnb.epoxy3.test.R

/**
 * @ClassName PhotoEpoxyModel
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2025/1/5 14:39
 * @Version 1.0
 */
@EpoxyModelClass
abstract class PhotoEpoxyModel :EpoxyModelWithHolder<PhotoEpoxyModel.Holder>(){
    @EpoxyAttribute
    var position = 0

    @EpoxyAttribute
    var url: String = ""

    override fun getDefaultLayout(): Int {
        return R.layout.second_item_photo
    }

    override fun bind(holder: Holder) {
        super.bind(holder)
        holder.tvPosition.text = "$position"
    }

    class Holder : EpoxyHolder() {
        lateinit var tvPosition: TextView
        lateinit var imageView: ImageView
        override fun bindView(itemView: View) {
            tvPosition = itemView.findViewById(R.id.tvPosition)
            imageView = itemView.findViewById(R.id.imageView)
        }
    }
}