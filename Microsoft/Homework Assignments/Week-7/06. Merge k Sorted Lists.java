class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(lists.length, (a,b)-> a.val-b.val);
        for(ListNode node:lists){
            if(node!=null){
                pq.add(node);
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        while(!pq.isEmpty()){
            ListNode node = pq.poll();
            if(node.next!=null){
                pq.add(node.next);
            }
            dummy.next = node;
            dummy = node;
        }
        return head.next;
    }
}
//23. Merge k Sorted Lists
/*Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
Explanation: The linked-lists are:
[
  1->4->5,
  1->3->4,
  2->6
]
merging them into one sorted list:
1->1->2->3->4->4->5->6*/
