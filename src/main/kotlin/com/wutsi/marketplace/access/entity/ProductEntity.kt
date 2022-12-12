package com.wutsi.marketplace.access.entity

import com.wutsi.enums.EventProvider
import com.wutsi.enums.ProductStatus
import com.wutsi.enums.ProductType
import java.util.Date
import javax.persistence.Entity
import javax.persistence.Enumerated
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "T_PRODUCT")
data class ProductEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "thumbnail_fk")
    var thumbnail: PictureEntity? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_fk")
    var category: CategoryEntity? = null,

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
    val pictures: List<PictureEntity> = emptyList(),

    @Enumerated
    var status: ProductStatus = ProductStatus.DRAFT,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_fk")
    var store: StoreEntity = StoreEntity(),

    var title: String? = null,
    var summary: String? = null,
    var description: String? = null,
    var price: Long? = null,
    var comparablePrice: Long? = null,
    val currency: String = "",
    var quantity: Int? = null,

    var isDeleted: Boolean = false,
    val created: Date = Date(),
    val updated: Date = Date(),
    var published: Date? = null,
    var deleted: Date? = null,

    var type: ProductType = ProductType.UNKNOWN,

    // Webminar fields
    var eventProvider: EventProvider = EventProvider.UNKNOWN,
    var eventMeetingId: String? = null,
    var eventMeetingPassword: String? = null,
    var eventStarts: Date? = null,
    var eventEnds: Date? = null
)
