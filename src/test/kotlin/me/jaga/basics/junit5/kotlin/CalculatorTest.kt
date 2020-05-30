package me.jaga.basics.junit5.kotlin

import org.junit.jupiter.api.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import java.lang.UnsupportedOperationException

internal class CalculatorTest {

    @Test
    fun addPositiveNumbers() {
        Assertions.assertEquals(3,Calculator.addPositiveNumbers(1,2),"1+2=3")
    }

    @Test
    fun `Check for Assertion errors`() {
        assertThrows<UnsupportedOperationException> { Calculator.addPositiveNumbers(-1,0)}
    }

    @ParameterizedTest
    @CsvSource (
        "1,2,3",
        "5,10,15"
    )
    fun `Check with Parameters`(first: Int, second: Int, expected : Int) {
        Assertions.assertEquals(expected,Calculator.addPositiveNumbers(first,second) )
    }

}