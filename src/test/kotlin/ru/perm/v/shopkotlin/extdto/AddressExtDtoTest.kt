package ru.perm.v.shopkotlin.extdto

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class AddressExtDtoTest {

    @Test
    fun testEquals() {
        assertEquals(AddressExtDto(100L, "NAME"), AddressExtDto(100L, "NAME"));
    }
}