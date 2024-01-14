package ru.perm.v.shopkotlin.extdto

import javax.validation.constraints.NotEmpty

data class StockExtDTO(
    val n:Long,
    @field:NotEmpty(message = ErrMessages.FIELD_STOCK_NAME_EMPTY)
    val name:String = "",
    val addressExtDTO: AddressExtDTO = AddressEmptyExtDTO
)
