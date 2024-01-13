package solv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q_643Test {

    private Q_643 q = new Q_643();

    @Test
    public void test() {
        int[] test = new int[]{1,12,-5,-6,50,3};
        double maxAverage = q.findMaxAverage(test, 4);

        assertEquals(12.75000, maxAverage);
    }

    @Test
    public void test2() {
        int[] test = new int[]{5};
        double maxAverage = q.findMaxAverage(test, 1);

        assertEquals(5.00000, maxAverage);
    }
    @Test
    public void test3() {
        int[] test = new int[]{0,4,0,3,2};
        double maxAv = q.findMaxAverage(test, 1);
        assertEquals(4.00000, maxAv);
    }

}