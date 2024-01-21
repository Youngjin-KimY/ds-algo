package solv

class Q_724 {
    fun pivotIndex(nums: IntArray): Int {
        var rightSum = 0
        var leftSum = 0
        for(i : Int in 1 .. nums.size.minus(1)) {
            rightSum = rightSum.plus(nums[i])
        }

        for(i : Int in 0 .. nums.size.minus(2)) {
            if(rightSum == leftSum) return i
            leftSum = leftSum.plus(nums[i])
            rightSum = rightSum.minus(nums[i+1])
        }

        if(leftSum==rightSum) return nums.size.minus(1)

        return -1
    }
}