package solv;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Q_841Test {
    private Q_841 q = new Q_841();

    @Test
    public void test1() {
        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(Collections.singletonList(1));
        rooms.add(Collections.singletonList(2));
        rooms.add(Collections.singletonList(3));
        rooms.add(new ArrayList<>());

        boolean b = q.canVisitAllRooms(rooms);
        assertTrue(b);
    }

    @Test
    public void test2() {
        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(Arrays.asList(1,3));
        rooms.add(Arrays.asList(3,0,1));
        rooms.add(Collections.singletonList(2));
        rooms.add(Collections.singletonList(0));

        boolean b = q.canVisitAllRooms(rooms);
        assertFalse(b);
    }
}