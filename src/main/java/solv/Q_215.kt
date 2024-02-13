package solv

import java.util.*

class Q_215 {

    private val pq = PriorityQueue<Int>(Collections.reverseOrder())
    fun findKthLargest(nums: IntArray, k: Int): Int {
        nums.forEach {
            pq.add(it)
        }


        for(i: Int in 0..<k-1) {
            pq.remove()
        }

        return pq.peek()
    }
}
