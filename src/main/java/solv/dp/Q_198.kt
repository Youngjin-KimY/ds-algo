package solv.dp

class Q_198 {
    fun rob(nums: IntArray): Int {
        val res = IntArray(nums.size)

        res[0] = nums[0]

        if(nums.size == 1) {
            return res[0]
        }

        res[1] = nums[0].coerceAtLeast(nums[1])

        if(nums.size == 2) {
            return res[1]
        }

        for(idx: Int in 2..<nums.size) {
            res[idx] = res[idx - 1].coerceAtLeast(res[idx - 2] + nums[idx])
        }

        return res[res.size-1]
    }
}

// 0    1   2   3
// 1    2   4   4

// 0    1   2   3   4
// 2    7   11  11  12