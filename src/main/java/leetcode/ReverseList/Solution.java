package leetcode.ReverseList;


import java.util.Stack;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val, Object o) {
        this.val = val;
    }
}

/**
 * 反转链表
 */
public class Solution {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, null)));
        Solution solution = new Solution();
        ListNode listNode1 = solution.ReverseList(listNode);
        System.out.println(listNode1);
    }
    public ListNode ReverseList(ListNode head) {
       ListNode beforBinge =  new ListNode(0,null);
        ListNode flag = beforBinge;

        Stack<ListNode> objects = new Stack<>();
        int a = 0;
        while (true){
            if (head != null){
                objects.push(head);
                head = head.next;
                a++;
            }else {
                break;
            }
        }
        for (int i = 0; i < a; i++) {
            ListNode pop = objects.pop();
            beforBinge.next = pop;
            beforBinge = beforBinge.next;
        }
        return flag.next;

    }
}
