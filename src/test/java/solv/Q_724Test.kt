package solv

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Q_724Test{
    val q = Q_724()

    @Test
    fun test() {
        val input = intArrayOf(-1,-1,0,1,1,0)
        val pivotIndex = q.pivotIndex(input)

        assertEquals(5, pivotIndex)
    }
}