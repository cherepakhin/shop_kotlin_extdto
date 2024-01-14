package ru.perm.v.shopkotlin.extdto

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StockExtDtoEasyCodeTest {
        @Test
        fun testConstructor() {
            // Arrange
            val n = 1L
            val name = "Stock Name"
            val addressExtDTO = AddressExtDTO(1L, "NAME_1", "NAME_2", "NAME_3")
            val expectedStockExtDTO = StockExtDTO(n, name, addressExtDTO)

            // Act
            val actualStockExtDTO = StockExtDTO(n, name, addressExtDTO)

            // Assert
            assertEquals(expectedStockExtDTO, actualStockExtDTO)
        }

        @Test
        fun testConstructorWithEmptyAddress() {
            // Arrange
            val n = 1L
            val name = "Stock Name"
            val expectedStockExtDTO = StockExtDTO(n, name)

            // Act
            val actualStockExtDTO = StockExtDTO(n, name)

            // Assert
            assertEquals(expectedStockExtDTO, actualStockExtDTO)
        }

        @Test
        fun testEqualsAndHashCode() {
            // Arrange
            val stockExtDTO1 = StockExtDTO(1L, "Stock Name", AddressExtDTO(1L, "NAME_1", "NAME_2", "NAME_3"))
            val stockExtDTO2 = StockExtDTO(1L, "Stock Name", AddressExtDTO(1L, "NAME_1", "NAME_2", "NAME_3"))
            val stockExtDTO3 = StockExtDTO(2L, "Stock Name", AddressExtDTO(1L, "NAME_1", "NAME_2", "NAME_3"))

            // Act
            val result1 = stockExtDTO1.equals(stockExtDTO2)
            val result2 = stockExtDTO1.hashCode() == stockExtDTO2.hashCode()
            val result3 = stockExtDTO1.equals(stockExtDTO3)
            val result4 = stockExtDTO1.hashCode() == stockExtDTO3.hashCode()

            // Assert
            assertEquals(true, result1)
            assertEquals(true, result2)
            assertEquals(false, result3)
            assertEquals(false, result4)
        }

        @Test
        fun testToString() {
            // Arrange
            val stockExtDTO = StockExtDTO(1L, "Stock Name", AddressExtDTO(1L, "TOWN_1", "STREET_2", "HOUSE_3"))
            val expectedToString = "StockExtDTO(n=1, name=Stock Name, addressExtDTO=AddressExtDTO(n=1, town='TOWN_1', street='STREET_2', house='HOUSE_3'))"

            // Act
            val actualToString = stockExtDTO.toString()

            // Assert
            assertEquals(expectedToString, actualToString)
        }
    }
