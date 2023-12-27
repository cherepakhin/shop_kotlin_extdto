package ru.perm.v.shopkotlin.extdto

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ProductExtDTOTest {
    @Test
    internal fun testEquals() {
        val product100_1 = ProductExtDTO(100L, "NAME100")
        val product100_2 = ProductExtDTO(100L, "NAME100")

        assertEquals(product100_1, product100_2);

    }
}