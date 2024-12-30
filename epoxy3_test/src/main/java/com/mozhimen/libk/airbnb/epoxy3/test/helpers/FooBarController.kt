package com.mozhimen.libk.airbnb.epoxy3.test.helpers

import com.airbnb.epoxy.TypedEpoxyController
import com.mozhimen.libk.airbnb.epoxy3.test.mos.Foo

/**
 * @ClassName FooBarController
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2024/12/30 0:58
 * @Version 1.0
 */
class FooBarController : TypedEpoxyController<Foo>() {
    override fun buildModels(foo: Foo) {

        ListCellABindingModel_()
            .title(foo.title) // databinding
            .id(modelCountBuiltSoFar)
            .addTo(this)

        foo.bar.forEach {
            ListCellBindingModel_()
                .body(it.body)
                .time(it.time)
                .id(modelCountBuiltSoFar)
                .addTo(this)
        }
    }
}
