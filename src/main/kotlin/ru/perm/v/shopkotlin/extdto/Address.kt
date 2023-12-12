package ru.perm.v.shopkotlin.extdto

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

class Address {
    @field:NotNull
    var n: Long = -1

    @field:NotEmpty(message = ErrMessages.FIELD_PRODUCT_NAME_EMPTY)
    var name: String = "-"

    constructor(n: Long, name: String) {
        this.n = n
        this.name = name
    }


    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Address) return false

        if (n != other.n) return false
        if (name != other.name) return false

        return true
    }

    override fun hashCode(): Int {
        var result = n.hashCode()
        result = 31 * result + name.hashCode()
        return result
    }
}