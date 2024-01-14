package ru.perm.v.shopkotlin.extdto

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ProductExtDTOTest {
    @Test
    fun testEquals() {
        assertEquals(ProductExtDTO(100L, "NAME_100", 1L), ProductExtDTO(100L, "NAME_100", 1L));
    }

    @Test
    fun testNotEqualsByN() {
        assertNotEquals(ProductExtDTO(101L, "NAME_100", 1L), ProductExtDTO(100L, "NAME_100", 1L));
    }

    @Test
    fun testNotEqualsByName() {
        assertNotEquals(ProductExtDTO(100L, "NAME_101", 1L), ProductExtDTO(100L, "NAME_100", 1L));
    }

    @Test
    fun testNotEqualsByGroupDtoN() {
        assertNotEquals(ProductExtDTO(100L, "NAME_100", 2L), ProductExtDTO(100L, "NAME_100", 1L));
    }
}