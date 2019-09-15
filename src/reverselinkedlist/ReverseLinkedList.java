package reverselinkedlist;

public class ReverseLinkedList {
  public ListNode reverseList(ListNode head) {

    if (head == null) return null;
    else if (head.next == null) return head;
    else if (head.next.next == null) {
      head.next.next = head;
      ListNode temp = head.next;
      head.next = null;
      return temp;
    } else {
      ListNode prev = head;
      ListNode cur = head.next;
      ListNode next = cur.next;

      while (next != null) {
        cur.next = prev;
        prev = cur;
        cur = next;
        next = cur.next;
      }
      head.next = null;
      cur.next = prev;
      return cur;
    }
  }
}
