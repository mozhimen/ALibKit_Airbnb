package com.mozhimen.libk.airbnb.epoxy3.test.helpers

import com.airbnb.epoxy.Carousel
import com.airbnb.epoxy.EpoxyController
import com.airbnb.epoxy.carousel
import com.mozhimen.libk.airbnb.epoxy3.test.mos.Message
import com.mozhimen.libk.airbnb.epoxy3.test.mos.Profile

/**
 * @ClassName HomeController
 * @Description TODO
 * @Author mozhimen
 * @Date 2025/1/2
 * @Version 1.0
 */
class HomeController : EpoxyController() {
    var recentlyActive: List<Profile> = emptyList()
        set(value) {
            field = value
            requestModelBuild()
        }
    var allMessages: List<Message> = emptyList()
        set(value) {
            field = value
            requestModelBuild()
        }

    override fun buildModels() {
        headerItem {
            id("recently_active")
            title("Recently Active")
        }
        val models = recentlyActive.map {
            RecentlyActiveItemModel_()
                .id(it.id)
                .profile(it)
        }
        carousel {
            id("recent")
            padding(Carousel.Padding.dp(0, 4, 0, 16, 8))
            models(models)
        }
        headerItem {
            id("all_messages")
            title("All Messages")
        }
        allMessages.forEach {
            messageItem {
                id(it.id)
                message(it)
            }
        }
    }
}