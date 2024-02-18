package solv.bit

class Q_136 {

    // 재밋는 논리회로의 원리를 알아야 하는 문제
    // 사실 map 같은 걸로도 풀수 있다.
    fun singleNumber(nums: IntArray): Int {

        var res = 0

        for(i: Int in nums) {
            res = (res xor i)
        }

        return res
    }
}