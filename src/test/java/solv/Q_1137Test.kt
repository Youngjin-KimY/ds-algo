package solv

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import solv.dp.Q_1137

class Q_1137Test {

    val q = Q_1137()


    @Test
    fun test1() {
        val tribonacci = q.tribonacci(4)

        assertEquals(4, tribonacci)
    }

    @Test
    fun test2() {
        val tribonacci = q.tribonacci(25)

        assertEquals(1389537, tribonacci)
    }

    @Test
    fun test3() {
        val tribonacci = q.tribonacci(37)

        assertEquals(2082876103, tribonacci)
    }
}