package solv.arraystring

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Q_1431Test{

    val q = Q_1431()

    @Test
    fun test() {
        val kidsWithCandies = q.kidsWithCandies(intArrayOf(2, 3, 5, 1, 3), 3)
        val e = mutableListOf(true,true,true,false,true)

        assertEquals(e[0],kidsWithCandies[0])
        assertEquals(e[1],kidsWithCandies[1])
        assertEquals(e[2],kidsWithCandies[2])
        assertEquals(e[3],kidsWithCandies[3])
        assertEquals(e[4],kidsWithCandies[4])
    }

    @Test
    fun test2() {
        val kidsWithCandies = q.kidsWithCandies(intArrayOf(4, 2, 1, 1, 2), 1)
        val e = mutableListOf(true,false,false,false,false)

        assertEquals(e[0],kidsWithCandies[0])
        assertEquals(e[1],kidsWithCandies[1])
        assertEquals(e[2],kidsWithCandies[2])
        assertEquals(e[3],kidsWithCandies[3])
        assertEquals(e[4],kidsWithCandies[4])
    }

    @Test
    fun test3() {
        val kidsWithCandies = q.kidsWithCandies(intArrayOf(12, 1, 12), 10)
        val e = mutableListOf(true,false,true)

        assertEquals(e[0],kidsWithCandies[0])
        assertEquals(e[1],kidsWithCandies[1])
        assertEquals(e[2],kidsWithCandies[2])
    }
}