package com.wutsi.marketplace.access.dto

import org.springframework.format.annotation.DateTimeFormat
import java.time.OffsetDateTime

public data class Product(
    public val id: Long = 0,
    public val thumbnail: PictureSummary? = null,
    public val pictures: List<PictureSummary> = emptyList(),
    public val category: CategorySummary? = null,
    public val title: String = "",
    public val summary: String? = null,
    public val description: String? = null,
    public val price: Long? = null,
    public val comparablePrice: Long? = null,
    public val currency: String = "",
    public val quantity: Int? = null,
    @get:DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssZ")
    public val created: OffsetDateTime = OffsetDateTime.now(),
    @get:DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssZ")
    public val updated: OffsetDateTime = OffsetDateTime.now(),
    public val status: String = "",
    @get:DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssZ")
    public val published: OffsetDateTime? = null,
    public val store: StoreSummary = StoreSummary(),
    public val type: String = "",
    public val event: Event? = null
)
