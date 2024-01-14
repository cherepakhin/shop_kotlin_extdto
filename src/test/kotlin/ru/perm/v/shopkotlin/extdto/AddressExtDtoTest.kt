package ru.perm.v.shopkotlin.extdto

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Test


class AddressExtDtoTest {

    @Test
    fun testEquals() {
        assertEquals(AddressExtDTO(100L, "NAME"), AddressExtDTO(100L, "NAME"));
    }

    @Test
    fun testNotEquals() {
        assertNotEquals(AddressExtDTO(0L, "NAME"), AddressExtDTO(1L, "NAME1"));
    }

    @Test
    fun testWithSetDefaultEquals() {
        val addressDto1 = AddressExtDTO()
        addressDto1.n = 100L
        addressDto1.town = "TOWN_1"

        val address2 = AddressExtDTO(100L, "TOWN_1")

        assertEquals(address2, addressDto1);
    }

    @Test
    fun testCreateWithDefaultValue() {
        val addressDto1 = AddressEmptyExtDTO()
        assertEquals(0L, addressDto1.n);
        assertEquals("",addressDto1.town);
        assertEquals("",addressDto1.street);
        assertEquals("",addressDto1.house);
    }
}