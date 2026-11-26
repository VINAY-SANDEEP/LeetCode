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
    public boolean isPalindrome(ListNode head) {
      ListNode fast = head;
      ListNode slow = head;
      while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
      }
      ListNode reverse = reverse(slow);
      ListNode temp = head;
      while(reverse!=null){
        if(reverse.val!=temp.val){
            return false;
        }
        reverse = reverse.next;
        temp = temp.next;
      }
      return true;
    }
    public static ListNode reverse(ListNode head){
        ListNode temp = head;
        ListNode prev = null;
        ListNode next = null;
        while(temp!=null){
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }
}