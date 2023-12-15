package solv;

import com.rooon.datastructure.ListNode;

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
}
