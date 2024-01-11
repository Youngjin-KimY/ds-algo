package solv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q_392Test {

    private Q_392 q = new Q_392();
    @Test
    public void test() {
        boolean subsequence = q.isSubsequence("abc", "ahbgdc");
        assertEquals(true, subsequence);
    }

    @Test
    public void test2() {
        boolean subsequence = q.isSubsequence("axc", "ahbgdc");
        assertEquals(false, subsequence);
    }

    @Test
    public void test3() {
        boolean subsequence = q.isSubsequence("aaaaaa", "bbaaaa");
        assertEquals(false, subsequence);
    }

    @Test
    public void test4() {
        boolean subsequence = q.isSubsequence("", "");
        assertEquals(true, subsequence);
    }

    @Test
    public void test5() {
        boolean subsequence = q.isSubsequence("a", "");
        assertEquals(false, subsequence);
    }
}