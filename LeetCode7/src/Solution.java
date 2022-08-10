public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newOne = new ListNode();
        ListNode result = newOne;


        while (list1 != null && list2 != null) {
            if (list2.val <= list1.val) {
                newOne.next = list2;
                newOne = newOne.next;
                list2 = list2.next;
            } else {
                newOne.next = list1;
                newOne = newOne.next;
                list1 = list1.next;
            }

        }
        if (list1 != null) {
            while (list1 != null){
                newOne.next = list1;
                newOne = newOne.next;
                list1 = list1.next;
            }
        } else {
            while (list2 != null) {
                newOne.next = list2;
                newOne = newOne.next;
                list2 = list2.next;
            }
        }
        return result.next;
    }
}
