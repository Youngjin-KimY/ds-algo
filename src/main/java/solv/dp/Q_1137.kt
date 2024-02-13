package solv.dp

class Q_1137() {

    private val table = arrayOfNulls<Int>(40)

    init {
        for(i: Int in 0..<40) {
            table[i] = 0
        }
    }

    fun tribonacci(n: Int): Int {

        if(n == 0) {
            table[n] = 0

            return table[n]!!
        } else if(n == 1 || n == 2) {
            table[n] = 1

            return table[n]!!
        }


        if(table[n] == 0) {
            table[n] = tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3)
        }

        return table[n]!!
    }
}

fun main() {
    val q = Q_1137()
    q.tribonacci(1)
}