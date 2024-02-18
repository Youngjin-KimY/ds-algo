package solv.bit

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Q_136Test {

    val q = Q_136()

    @Test
    fun test() {
        val singleNumber = q.singleNumber(intArrayOf(2, 2, 1))
        assertEquals(1, singleNumber)
    }

    @Test
    fun test2() {
        val singleNumber = q.singleNumber(intArrayOf(4,1,2, 1, 2))
        assertEquals(4, singleNumber)
    }

    @Test
    fun test3() {
        val singleNumber = q.singleNumber(intArrayOf(1))
        assertEquals(1, singleNumber)
    }

    @Test
    fun memo() {
        var zero = 0
        var t = 1

        val res = (zero xor t)
        println(res)

        val res2 = (4 xor 2 xor 2)
        println(res2)

        /**
         * 100
         * 010
         * ------- xor
         * 110
         * 010
         * ------- xor
         * 100
         */
    }

}