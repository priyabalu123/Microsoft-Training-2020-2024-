class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)
            return null;
        int interval=1;
        while(interval<lists.length)
        {
            system.out.println(lists.length);
            for(int i=0;i+interval<lists.length;i=i+interval*2)
            {
                lists[i]=mergeTwoLists(list[i],lists[i+interval]);
            }
            interval*=2;
        }
        return list[0];
    }
}
public ListNode mergeTwoLists(ListNode l1,ListNode l2)
{
    if(l1==null)
        return l2;
    if(l2==null)
        return l1;
    if(l1.val<l2.val)
    {
        l1.next=mergeTwoLists(l1.next,l2);
        return l1;
    }
    else
    {
        l2.next=mergeTwoLists(l1,l2.next);
        return l2;
    }
} 
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
