package ru.perm.v.shopkotlin.extdto

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import javax.validation.Validation
import javax.validation.Validator

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

    @Test
    fun testForValid() {
        val validator: Validator = Validation.buildDefaultValidatorFactory().validator;
        val errors = validator.validate(ProductExtDTO(0L, "NAME_100", 1L));
        assertEquals(0, errors.size)
    }

    @Test
    fun testForNotNotValidName() {
        val validator: Validator = Validation.buildDefaultValidatorFactory().validator;

        val errors = validator.validate(ProductExtDTO(0L, "", 1L));

        assertEquals(1, errors.size)
        assertEquals("Field 'name' in ProductDTO is empty",errors.toList().get(0).message)
    }
}