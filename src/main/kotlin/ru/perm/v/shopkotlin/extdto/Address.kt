package ru.perm.v.shopkotlin.extdto

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

class Address {
    @field:NotNull
    var n: Long = -1

    @field:NotEmpty(message = ErrMessages.FIELD_PRODUCT_NAME_EMPTY)
    var name: String = "-"
}