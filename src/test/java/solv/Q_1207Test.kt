package solv

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Q_1207Test{

    private val q = Q_1207()

    @Test
    fun test() {
        val input = intArrayOf(1,2,3)
        val uniqueOccurrences = q.uniqueOccurrences(input)

        assertFalse(uniqueOccurrences)
    }

    @Test
    fun test2() {
        val input = intArrayOf(1,2,2,3,3,3)
        val uniqueOccurrences = q.uniqueOccurrences(input)

        assertTrue(uniqueOccurrences)
    }
}