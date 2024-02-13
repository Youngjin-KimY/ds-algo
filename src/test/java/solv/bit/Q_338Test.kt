package solv.bit

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Q_338Test {

    val q = Q_338()


    @Test
    fun test() {
        val countBits = q.countBits(2)
        assertEquals(0,countBits[0])
        assertEquals(1,countBits[1])
        assertEquals(1,countBits[2])
    }

    @Test
    fun test2() {
        val countBits = q.countBits(5)
        assertEquals(0,countBits[0])
        assertEquals(1,countBits[1])
        assertEquals(1,countBits[2])
        assertEquals(2,countBits[3])
        assertEquals(1,countBits[4])
        assertEquals(2,countBits[5])
    }

    @Test
    fun testSubFun() {
        val cnt = q.tenTobinaryCountOne(2)
        assertEquals(cnt, 1)
    }

    @Test
    fun testSubFun2() {
        val cnt = q.tenTobinaryCountOne(5)
        assertEquals(cnt, 2)
    }

    @Test
    fun testSubFun3() {
        val cnt = q.tenTobinaryCountOne(1024)
        assertEquals(cnt, 1)
    }
    @Test
    fun testSubFun4() {
        val cnt = q.tenTobinaryCountOne(7)
        assertEquals(cnt, 3)
    }
}