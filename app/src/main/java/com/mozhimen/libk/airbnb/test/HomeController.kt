package com.mozhimen.libk.airbnb.test

import com.airbnb.epoxy.EpoxyController
import com.mozhimen.libk.airbnb.test.mos.Message

/**
 * @ClassName HomeController
 * @Description TODO
 * @Author mozhimen
 * @Date 2025/1/2
 * @Version 1.0
 */
class HomeController : EpoxyController() {

    var allMessages: List<Message> = emptyList()
        set(value) {
            field = value
            requestModelBuild()
        }

    override fun buildModels() {
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