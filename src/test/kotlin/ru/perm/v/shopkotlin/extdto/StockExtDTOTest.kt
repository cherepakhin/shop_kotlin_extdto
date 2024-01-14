package ru.perm.v.shopkotlin.extdto

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Test

class StockExtDTOTest {
    @Test
    fun testEquals() {
        assertEquals(
            StockExtDTO(20L, "NAME_20", AddressExtDTO(1L, "NAME_1", "NAME_2", "NAME_3")),
            StockExtDTO(20L, "NAME_20", AddressExtDTO(1L, "NAME_1", "NAME_2", "NAME_3")),
        )
    }

    @Test
    fun testNotEqualsByN() {
        assertNotEquals(
            StockExtDTO(0L, "NAME_20", AddressExtDTO(1L, "NAME_1", "NAME_2", "NAME_3")),
            StockExtDTO(20L, "NAME_20", AddressExtDTO(1L, "NAME_1", "NAME_2", "NAME_3")),
        )
    }

    @Test
    fun testNotEqualsByName() {
        assertNotEquals(
            StockExtDTO(20L, "", AddressExtDTO(1L, "NAME_1", "NAME_2", "NAME_3")),
            StockExtDTO(20L, "NAME_20", AddressExtDTO(1L, "NAME_1", "NAME_2", "NAME_3")),
        )
    }

    @Test
    fun testNotEqualsByAddress() {
        assertNotEquals(
            StockExtDTO(20L, "NAME_20", AddressExtDTO(2L, "NAME_1", "NAME_2", "NAME_3")),
            StockExtDTO(20L, "NAME_20", AddressExtDTO(1L, "NAME_1", "NAME_2", "NAME_3")),
        )
    }
}