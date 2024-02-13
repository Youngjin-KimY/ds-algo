package solv.dp

class Q_746 {
    fun minCostClimbingStairs(cost: IntArray): Int {

        val dp = arrayOfNulls<Int>(cost.size + 1)
        for(i: Int in cost.indices) {
            dp[i] = 0
        }

        for(i: Int in 2..cost.size) {
            dp[i] = (dp[i - 2]!! + cost[i - 2]).coerceAtMost(dp[i - 1]!! + cost[i - 1])
        }

        return dp[cost.size]!!
    }
}

// f(n) = min(f(n-1), f(n-2))
//