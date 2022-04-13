package addTwoNumbers;

/**
 * @author 18497
 */
public class AddTwoNumbers {
    public static void main(String[] args) {

        ListNode l1 = new ListNode();
        ListNode l1a = new ListNode();
        ListNode l1b = new ListNode();
        l1.next = l1a;
        l1a.next = l1b;
        l1.val = 2;
        l1a.val = 4;
        l1b.val = 3;

        ListNode l2 = new ListNode();
        ListNode l2a = new ListNode();
        ListNode l2b = new ListNode();
        l2.next = l2a;
        l2a.next = l2b;
        l2.val = 5;
        l2a.val = 6;
        l2b.val = 4;

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        addTwoNumbers.addTwoNumbers(l1,l2);
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode();
        ListNode listNode1 = new ListNode();
        int a = 0;
        while (true){
            if (l1 == null&& l2 !=null){
                listNode.val = l2.val +a;
                listNode1 = listNode.next;
                a = 0;
            }
            if (l2 == null && l1 != null){
                listNode.val = l1.val +a;
                listNode = listNode.next;
                a = 0;
            }
            if (l1.next== null && l2.next == null){
                listNode.val = a;
                break;
            }else {
                int c  = l1.val = l2.val + a;
                if (c>=10){
                    a = (c-(c%10))/10;
                }
                listNode.val = c%10;

            }
            l1= l1.next;
            l2 = l2.next;
            listNode = listNode.next;
        }

        return listNode;
    }
}

   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
