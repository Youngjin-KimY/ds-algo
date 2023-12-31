package solv;

import com.rooon.datastructure.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LinkedListQuestionTest {

    final private LinkedListQuestion linkedListQuestion = new LinkedListQuestion();


    @Test
    public void test2() {

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(1, new ListNode(2, new ListNode(3)));
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        ListNode listNode = linkedListQuestion.deleteDuplicateNodeWithNoBuffer(n1);
        int[] actualArr = nodeToArr(listNode);
        int[] sol = new int[20];
        sol[0] = 1;
        sol[1] = 2;
        sol[2] = 3;

        Assertions.assertArrayEquals(actualArr, sol);

    }

    @Test
    public void test() {

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        ListNode listNode = linkedListQuestion.deleteDuplicateNodeWithBuffer(n1);
        int[] actualArr = nodeToArr(listNode);
        int[] sol = new int[20];
        sol[0] = 1;
        sol[1] = 2;
        sol[2] = 3;

        Assertions.assertArrayEquals(actualArr, sol);
    }

    public int[] nodeToArr(ListNode node) {
        int[] res = new int[20];
        int idx = 0;
        while(node != null) {
            res[idx] = node.val;
            node = node.next;
            idx ++;
        }

        return res;
    }

    @Test
    public void circularNodeFinderTest1() {
        ListNode n = new ListNode(1);
        ListNode circularStartNode = linkedListQuestion.findCircularStartNode(n);

        Assertions.assertNull(circularStartNode);
    }

    @Test
    public void circularNodeFinderTest2() {
        ListNode n = new ListNode(1, new ListNode(2));
        ListNode circularStartNode = linkedListQuestion.findCircularStartNode(n);

        Assertions.assertNull(circularStartNode);
    }

    @Test
    public void circularNodeFinderTest3() {
        ListNode n = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode circularStartNode = linkedListQuestion.findCircularStartNode(n);

        Assertions.assertNull(circularStartNode);
    }

    @Test
    public void circularNodeFinderTest4() {
        ListNode h = new ListNode(1);
        ListNode sc = new ListNode(2);
        ListNode n = new ListNode(3);
        ListNode n2 = new ListNode(4);
        ListNode n3 = new ListNode(5);
        h.next = sc;
        sc.next = n;
        n.next = n2;
        n2.next = n3;
        n3.next = sc;

        ListNode circularStartNode = linkedListQuestion.findCircularStartNode(n);

        Assertions.assertEquals(sc.val, circularStartNode.val);
    }
}