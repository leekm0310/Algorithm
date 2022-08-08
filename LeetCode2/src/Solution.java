public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int a = 0;
        ListNode newOne = new ListNode();
        ListNode result = newOne;

        while (l1 != null || l2 != null) {
            if (l1 != null) {
                newOne.val += l1.val;
                l1 = l1.next;
            }
            if (l2 != null){
                newOne.val += l2.val;
                l2 = l2.next;
            }
            a = newOne.val / 10;
            newOne.val = newOne.val % 10;

            if (l1 != null || l2 != null || a != 0) {
                newOne.next = new ListNode();
                newOne = newOne.next;
                newOne.val = a;
            }
        }
        return result;
    }

}
