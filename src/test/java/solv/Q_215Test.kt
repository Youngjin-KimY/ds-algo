package solv

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Q_215Test{

    private val q = Q_215()

    @Test
    fun test() {
        val input = intArrayOf(3,2,1,5,6,4)
        val findKthLargest = q.findKthLargest(input, 2)
        kotlin.runCatching { assertEquals(5, findKthLargest) }
            .onFailure { println(findKthLargest)
                throw it}

    }

    @Test
    fun test2() {
        val input = intArrayOf(3,2,3,1,2,4,5,5,6)
        val findKthLargest = q.findKthLargest(input, 4)
        kotlin.runCatching { assertEquals(4, findKthLargest) }
            .onFailure { println(findKthLargest)
                throw it
            }
    }

    @Test
    fun test3() {
        val input = intArrayOf(1,1,1,1,1,1)
        val findKthLargest = q.findKthLargest(input, 1)
        kotlin.runCatching { assertEquals(1, findKthLargest) }
            .onFailure { println(findKthLargest)
                            throw it
            }
    }

}