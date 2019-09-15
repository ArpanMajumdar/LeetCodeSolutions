package reverselinkedlist;

public class Main {
  public static void main(String[] args) {
    //
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);

    ListNode head2 = new ListNode(1);
    head2.next = new ListNode(2);

    print(head2);

    ReverseLinkedList rev = new ReverseLinkedList();
    ListNode reversed = rev.reverseList(head2);

    print(reversed);


  }

  private static void print(ListNode head) {
    ListNode cur = head;
    while (cur != null) {
      System.out.print(cur.val + " -> ");
      cur = cur.next;
    }
    System.out.println();
  }
}
