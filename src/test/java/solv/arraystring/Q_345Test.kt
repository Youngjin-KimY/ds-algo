package solv.arraystring

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Q_345Test{

    val q = Q_345()

    @Test
    fun test() {
        val input = "ave"
        val reverseVowels = q.reverseVowels(input)
        assertEquals("eva", reverseVowels)
    }

    @Test
    fun test2() {
        val input = "hello"
        val reverseVowels = q.reverseVowels(input)
        assertEquals("holle", reverseVowels)
    }

    @Test
    fun test3() {
        val input = "leetcode"
        val reverseVowels = q.reverseVowels(input)
        assertEquals("leotcede", reverseVowels)
    }

    @Test
    fun test4() {
        val input = ".,"
        val reverseVowels = q.reverseVowels(input)
        assertEquals(".,", reverseVowels)
    }

    @Test
    fun test5() {
        val input = "a."
        val reverseVowels = q.reverseVowels(input)
        assertEquals("a.", reverseVowels)
    }
}