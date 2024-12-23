package com.mozhimen.libk.airbnb.epoxy.paging3.test.mos

/**
 * @ClassName Model
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2024/12/22 21:40
 * @Version 1.0
 */
data class Foo (
    var title: String,
    var bar: List<Bar>
)

data class Bar (
    var body: String,
    var time: String
)