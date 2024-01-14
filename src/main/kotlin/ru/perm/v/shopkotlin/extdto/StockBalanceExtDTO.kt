package ru.perm.v.shopkotlin.extdto

/**
 *  Balance of external stock
 */
data class StockBalanceExtDTO(
    val stockExtDTO: StockExtDTO,
    val productExtDTO: ProductExtDTO = ProductExtDTO(),
    val qty: Long = 0
)