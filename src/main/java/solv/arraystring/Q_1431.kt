package solv.arraystring

class Q_1431 {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        var max = 0
        for(candy: Int in candies) {
            max = if(max < candy) candy else max
        }

        val res = mutableListOf<Boolean>()

        for(candy: Int in candies) {
            if(candy + extraCandies >= max) res.add(true)
            else res.add(false)
        }

        return res
    }
}