package solv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q_1768Test {

    private Q_1768 q = new Q_1768();

    @Test
    public void test() {
        String s = q.mergeAlternatively("abcd", "pq");
        assertEquals("apbqcd", s);
    }

    @Test
    public void test2() {
        String s = q.mergeAlternatively("ab", "pqrs");
        assertEquals("apbqrs", s);
    }
}