package ru.perm.v.shopkotlin.extdto

import org.junit.Test
import kotlin.test.assertEquals

internal class AddressTest {

    @Test
    fun testEquals() {
        assertEquals(Address(100L, "NAME"), Address(100L, "NAME"));
    }
}