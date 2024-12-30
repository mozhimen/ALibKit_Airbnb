package com.mozhimen.libk.airbnb.epoxy3.test.mos

/**
 * @ClassName Foo
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2024/12/30 0:46
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