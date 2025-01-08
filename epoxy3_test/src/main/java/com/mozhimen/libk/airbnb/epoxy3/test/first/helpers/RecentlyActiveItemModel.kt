package com.mozhimen.libk.airbnb.epoxy3.test.first.helpers

import android.view.View
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatTextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.mozhimen.libk.airbnb.epoxy3.test.R
import com.mozhimen.libk.airbnb.epoxy3.test.first.mos.Profile

/**
 * @ClassName RecentlyActiveItemModel
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2025/1/2 23:25
 * @Version 1.0
 */
@EpoxyModelClass
abstract class RecentlyActiveItemModel : EpoxyModelWithHolder<RecentlyActiveItemModel.Holder>() {

    @EpoxyAttribute
    lateinit var profile: Profile

    override fun getDefaultLayout(): Int {
        return R.layout.view_holder_recently_active_item
    }

    override fun bind(holder: Holder) {
        super.bind(holder)
        with(profile) {
            holder.profileName.text = name
            holder.lastSeen.text = lastSeen
        }
    }

    class Holder : EpoxyHolder() {

        lateinit var profileImage: ImageView
        lateinit var profileName: AppCompatTextView
        lateinit var lastSeen: AppCompatTextView

        override fun bindView(itemView: View) {
            profileImage = itemView.findViewById(R.id.recently_added_profile_image)
            profileName = itemView.findViewById(R.id.recently_added_profile_name)
            lastSeen = itemView.findViewById(R.id.recently_added_last_seen)
        }
    }
}