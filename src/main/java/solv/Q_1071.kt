package solv

class Q_1071 {
    fun gcdOfStrings(str1: String, str2: String): String {
        if(!(str2+str1).equals(str1+str2)) return ""

        val gcd = gcd(str1.length, str2.length)

        return if(str1.length > str2.length) str2.substring(0, gcd)
        else str1.substring(0, gcd)
    }

    fun gcd(a: Int, b: Int): Int {
        if(b == 0) return a
        return gcd(b, a % b)
    }
}