class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode newHead=null;
        while(head!=null)
        {
            ListNode next=head.next;
            head.next=newHead;
            newHead=head;
            head=next;
        }
        return newHead;
    }
}
/*Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]*/
