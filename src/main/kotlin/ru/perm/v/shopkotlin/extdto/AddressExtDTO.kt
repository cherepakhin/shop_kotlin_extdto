package ru.perm.v.shopkotlin.extdto

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

/**
 * Address description for external Stock
 */
open class AddressExtDTO {
    @field:NotNull
    var n: Long = -1

    @field:NotEmpty(message = ErrMessages.FIELD_PRODUCT_NAME_EMPTY)
    var town: String = ""
    var street: String = ""
    var house: String = ""

    constructor() {
    }

    constructor(n: Long, town: String = "", street: String = "", house: String = "") {
        this
        this.n = n
        this.town = town
        this.street = street
        this.house = house
    }


    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AddressExtDTO) return false

        if (n != other.n) return false
        if (town != other.town) return false
        if (house != other.house) return false
        if (street != other.street) return false

        return true
    }

    override fun hashCode(): Int {
        var result = n.hashCode()
        result = 31 * result + town.hashCode()
        result = 31 * result + house.hashCode()
        result = 31 * result + street.hashCode()
        return result
    }
}