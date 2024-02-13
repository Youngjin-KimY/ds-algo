package solv.dp

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Q_746Test{
    val q = Q_746()

    @Test
    fun test() {
        val minCostClimbingStairs = q.minCostClimbingStairs(intArrayOf(10, 15, 20))
        assertEquals(15,minCostClimbingStairs)

    }
}