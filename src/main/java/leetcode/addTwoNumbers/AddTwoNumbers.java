package leetcode.addTwoNumbers;

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
        addTwoNumbers.addTwoNumbers(l1, l2);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        Long a = 0L;
        int flag = 1;
       while (true){
           if (l1 != null || l2 != null){
               if (l1 != null ){
                   a = a + l1.val*flag;
                   if (l1.next != null){
                       l1 = l1.next;
                   }
               }
               if (l2 != null){
                   a = a + l1.val*flag;
                   if (l1.next != null){
                       l1 = l1.next;
                   }
               }
               flag = flag * 10;
           }
           if (l1 != null && l2 !=null){
               break;
           }
       }
        String str = a.toString();
        ListNode begin = new ListNode();
        ListNode listNode = new ListNode();
        begin.next = listNode;
        for (int s = 0; s < str.length(); s++) {
            listNode.val = Integer.valueOf(str.substring(s,s+1));
            ListNode listNode1 = new ListNode();
            listNode.next = listNode1;
            listNode = listNode1;
        }
        return begin.next;
    }
}
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
