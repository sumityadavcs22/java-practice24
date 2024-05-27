package leetcode;

public class LeetCode148 {
    public ListNode sortList(ListNode head) {
        if (head != null && head.next != null) {
            return head;
        }
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;
        temp.next = null;
        ListNode leftSIde = sortList(head);
        ListNode rigthSide = sortList(slow);
        return mergeTwoLists(leftSIde, rigthSide);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode tempNode = new ListNode(0);
        ListNode currentNode = tempNode;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                currentNode.next = list1;
                list1 = list1.next;


            }
            if (list2 != null) {
                currentNode.next = list2;
                list2 = list2.next;
            }


        }
        if (list1 != null) {
            currentNode.next = list1;
            list1 = list1.next;
        }
        if (list2 != null) {
            currentNode.next = list2;
            list2 = list2.next;
        }
        return tempNode.next;


    }


}
