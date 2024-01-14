package ru.perm.v.shopkotlin.extdto

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class StockBalanceExtDTOTest {

    @Test
    fun testEquals() {
        val addressExtDTO = AddressExtDTO(1L, "NAME_1", "NAME_2", "NAME_3")
        val stockDTO1 = StockExtDTO(20L, "NAME_20", addressExtDTO)
        val product1 = ProductExtDTO(100L, "NAME_100", 1L)

        val stockBalance1 = StockBalanceExtDTO(stockDTO1, product1, 10L)
        val stockBalance2 = StockBalanceExtDTO(stockDTO1, product1, 10L)

        assertEquals(stockBalance1, stockBalance2)
    }
}