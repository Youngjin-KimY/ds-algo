package solv.arraystring

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Q_605Test{

    val q = Q_605()


    @Test
    fun test() {

        val canPlaceFlowers = q.canPlaceFlowers(intArrayOf(1, 0, 0, 0, 1), 1)

        assertEquals(true, canPlaceFlowers)
    }

    @Test
    fun test2() {

        val canPlaceFlowers = q.canPlaceFlowers(intArrayOf(1, 0, 0, 0, 1), 2)

        assertEquals(false, canPlaceFlowers)
    }

    @Test
    fun test3() {

        val canPlaceFlowers = q.canPlaceFlowers(intArrayOf(1, 0, 0, 0, 0, 1), 2)

        assertEquals(false, canPlaceFlowers)
    }

    @Test
    fun test4() {

        val canPlaceFlowers = q.canPlaceFlowers(intArrayOf(1, 0, 1, 0, 0, 0, 0, 1), 3)

        assertEquals(false, canPlaceFlowers)
    }

    @Test
    fun test5() {

        val canPlaceFlowers = q.canPlaceFlowers(intArrayOf(1, 0, 1, 0, 0, 0, 0, 1), 2)

        assertEquals(false, canPlaceFlowers)
    }
}