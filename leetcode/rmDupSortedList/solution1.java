class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ans = new ListNode(-101, head);
        ListNode dummy = ans;

        while(dummy != null) {
            while(dummy.next != null && dummy.val == dummy.next.val) {
                dummy.next = dummy.next.next;
            }
            dummy = dummy.next;
        }

        return ans.next;
    }
}