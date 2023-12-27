package ru.perm.v.shopkotlin.extdto

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class AddressDtoTest {

    @Test
    fun testEquals() {
        assertEquals(AddressDto(100L, "NAME"), AddressDto(100L, "NAME"));
    }

    @Test
    fun testWithSetDefaultEquals() {
        val addressDto1 = AddressDto()
        addressDto1.n = 100L
        addressDto1.town = "TOWN_1"

        val address2 = AddressDto(100L, "TOWN_1")

        assertEquals(address2, addressDto1);
    }

}