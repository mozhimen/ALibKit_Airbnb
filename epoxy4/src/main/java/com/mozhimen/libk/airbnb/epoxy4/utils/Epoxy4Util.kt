package com.mozhimen.libk.airbnb.epoxy4.utils

import com.airbnb.epoxy.CarouselModelBuilder
import com.airbnb.epoxy.EpoxyModel

/**
 * @ClassName Epoxy4Util
 * @Description TODO
 * @Author mozhimen
 * @Date 2026/4/1
 * @Version 1.0
 */
inline fun <T> CarouselModelBuilder.withModelsFrom(items: List<T>, modelBuilder: (T) -> EpoxyModel<*>) {
    Epoxy4Util.withModelsFrom(this, items, modelBuilder)
}

///////////////////////////////////////////////////////////////////////

object Epoxy4Util {
    /** Add models to a CarouselModel_ by transforming a list of items into EpoxyModels.
     *
     * @param items The items to transform to models
     * @param modelBuilder A function that take an item and returns a new EpoxyModel for that item. */
    @JvmStatic
    inline fun <T> withModelsFrom(carouselModelBuilder: CarouselModelBuilder, items: List<T>, modelBuilder: (T) -> EpoxyModel<*>) {
        carouselModelBuilder.models(items.map { modelBuilder(it) })
    }
}