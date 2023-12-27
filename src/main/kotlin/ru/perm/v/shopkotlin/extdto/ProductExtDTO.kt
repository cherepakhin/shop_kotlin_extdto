package ru.perm.v.shopkotlin.extdto

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

class ProductExtDTO {
    @field:NotNull
    var n: Long = -1

    @field:NotEmpty(message = ErrMessages.FIELD_PRODUCT_NAME_EMPTY)
    var name: String = "-"

    // need for Mockito
    constructor()

    // I don't create a constructor from ProductEntity, because I don't want import ProductEntity
    constructor(n: Long, name: String) {
        this.n = n
        this.name = name
    }

    // equals and hash as in java
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ProductExtDTO

        if (n != other.n) return false
        if (name != other.name) return false

        return true
    }

    override fun hashCode(): Int {
        var result = n.hashCode()
        result = 31 * result + name.hashCode()
        return result
    }

    override fun toString(): String {
        return "ProductExtDTO(n=$n, name='$name)"
    }
}