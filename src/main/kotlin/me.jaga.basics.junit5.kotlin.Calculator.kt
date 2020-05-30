
package me.jaga.basics.junit5.kotlin

import java.lang.UnsupportedOperationException

public class Calculator() {
    companion object {
        @Throws(UnsupportedOperationException::class)
        fun addPositiveNumbers(a: Int, b: Int): Int {
            if (a < 0 || b < 0) throw UnsupportedOperationException("Only positive numbers")
            return a + b
        }
    }
}