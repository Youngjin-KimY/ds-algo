package solv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q_283Test {

    private Q_283 sol = new Q_283();

    @Test
    public void test() {
        int[] testArray = new int[] {0,1,0,3,12};
        sol.moveZeros(testArray);

        int[] sol = new int[] {1,3,12,0,0};

        assertArrayEquals(testArray,sol);
    }
}