package solv

class Q_1207 {

    fun uniqueOccurrences(arr: IntArray): Boolean {
        val table = hashMapOf<Int, Int>()

        for(i: Int in 0..arr.size - 1) {
            if(table.containsKey(arr[i])) {
                var cnt = table.get(arr[i])
                table.put(arr[i],cnt!!.plus(1))
            } else {
                table.putIfAbsent(arr[i],1)
            }
        }

        val filter = hashSetOf<Int>()

        for(i in table.entries.iterator()) {
            filter.add(i.value)
        }

        if(filter.size == table.size){
            return true
        }

        return false
    }
}
