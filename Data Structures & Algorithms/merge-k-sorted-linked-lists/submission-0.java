/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a.val));
        int k = lists.length;

        // add heads of each list
        for(ListNode n : lists){
            if(n != null){
                minHeap.add(n);
            }
        }
        ListNode curr = new ListNode();
        ListNode dummy = curr;

        while(!minHeap.isEmpty()){
            ListNode temp = minHeap.poll(); // get smallest out of minHeap
            curr.next = temp;
            curr = curr.next;

            if(temp.next != null){
                // get next node in that list
                minHeap.add(temp.next);
            }
        }
        return dummy.next;

    }
}
