package solv.bit

class Q_338 {
    fun countBits(n: Int): IntArray {
        val lst = mutableListOf<Int>()
        for(i: Int in 0..n) {
            lst.add(tenTobinaryCountOne(i))
        }

        return lst.toIntArray()
    }

    fun tenTobinaryCountOne(n: Int): Int {
        var v = n
        var oneCount = 0
        while(v > 1) {
            var mod = v % 2
            if(mod == 1) oneCount ++
            v /= 2
        }

        if(v == 1) oneCount ++

        return oneCount
    }
}