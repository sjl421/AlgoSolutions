import java.util.*;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Chapter2 {

    // 2.3
    public boolean removeNode(ListNode pNode) {
        if (pNode == null || pNode.next == null) {
            pNode = null;
            return false;
        } else {
            pNode.val = pNode.next.val;
            pNode.next = pNode.next.next;
            return true;
        }
    }

}