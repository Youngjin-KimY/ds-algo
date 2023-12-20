package solv;

import com.rooon.datastructure.ListNode;

import java.util.HashMap;
import java.util.HashSet;

public class LinkedListQuestion {

    public LinkedListQuestion() {
    }

    private HashSet<Integer> buffer = new HashSet<>();

    public ListNode deleteDuplicateNodeWithBuffer(ListNode head){
        ListNode cur = head;
        ListNode prev = null;

        while(cur != null) {
            if(!buffer.contains(cur.val)) {
                buffer.add(cur.val);

                prev = cur;
            }
            else {
                if(cur.next != null) prev.next = cur.next;
                else prev.next = null;
            }
            cur = cur.next;
        }
        return head;
    }

    public ListNode deleteDuplicateNodeWithNoBuffer(ListNode head){

        ListNode cur = head;
        while(cur != null) {
            ListNode runner = cur;
            while(runner.next != null) {
                if(runner.next.val == cur.val) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }


            cur = cur.next;
        }

        return head;
    }

    public ListNode findCircularStartNode(ListNode head) {
        HashMap<Integer, Integer> incomingEdgeSaver = new HashMap<>();
        ListNode res;
        ListNode cur = head;

        if(head == null || head.next == null) return null;

        incomingEdgeSaver.put(cur.val, 1);

        while(true) {
            if(cur == null || cur.next == null) return null;

            if(incomingEdgeSaver.containsKey(cur.next.val)) {
                return cur;
            }

            incomingEdgeSaver.put(cur.val, 1);
            cur = cur.next;
        }

    }
}
