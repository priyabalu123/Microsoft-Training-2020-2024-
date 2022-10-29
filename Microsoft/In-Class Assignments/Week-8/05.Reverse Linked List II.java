class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) { 

        ListNode preRev = null;

        ListNode curr = head;

        int i = 1;

        while(i<m) { preRev = curr; curr = curr.next; i++; }

        ListNode end = curr;     

        ListNode pre = null; 

        while(i<=n) {

         ListNode temp = curr.next;

            curr.next = pre;

            pre = curr;

            curr = temp;

            i++;

        }

        end.next = curr;

        if(preRev != null) preRev.next = pre;

        return preRev == null ? pre: head;    

    }


}
//92. Reverse Linked List II
/*Input: head = [1,2,3,4,5], left = 2, right = 4
Output: [1,4,3,2,5]*/
