package solv.dp

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Q_198Test {
    val q = Q_198()

    @Test
    fun test() {
        val input = intArrayOf(1,2,3,1)
        val ans = q.rob(input)

        assertEquals(4, ans)
    }

    @Test
    fun test2() {
        val input = intArrayOf(2,7,9,3,1)
        val ans = q.rob(input)

        assertEquals(12, ans)
    }

    @Test
    fun test_edge_1() {
        val input = intArrayOf(1)
        val ans = q.rob(input)

        assertEquals(1, ans)
    }

    @Test
    fun test_edge_2() {
        val input = intArrayOf(3,1)
        val ans = q.rob(input)

        assertEquals(3, ans)
    }

    @Test
    fun test_grammer() {
        val nums = intArrayOf(1,2,3,4,5)
        var (a,b,c) = nums

        println(a)
        println(b)
        println(c)
    }
}