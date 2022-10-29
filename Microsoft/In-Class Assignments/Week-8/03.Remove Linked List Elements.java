class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
}
}
//203. Remove Linked List Elements
/*Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]*/
