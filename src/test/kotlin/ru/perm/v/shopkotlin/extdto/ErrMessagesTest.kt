package ru.perm.v.shopkotlin.extdto

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ErrMessagesTest {
    @Test
    internal fun for_mes_ID_NOT_FOUND() {
        assertEquals("id not found", ErrMessages.ID_NOT_FOUND)
    }
}