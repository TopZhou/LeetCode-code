/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) 
            return null;

        ListNode pre = null;
        ListNode cur  = null;

        while (head != null) {
            cur = head.next; 
            head.next = pre;
            pre = head;
            head = cur;
        }
        return pre;
    }
}
 /* 每次只反转一次。 
  * 第一次将首位指向一个  null；
  * 建立两个指针节点，一个指当前cur，一个指前一个节点pre。
  *                head       
  *                  1 -> 2 -> 3 -> 4 -> null
  *     ①null(pre)      cur(保存下一节点)       // 将head.next保存至cur
  *   
  *                 head
  *     ②    null <- 1    2 -> 3 -> 4 -> null  //将1反向指null，之后，pre前进至当前head处。 
  *                 pre                        
  *                                            //至始至终，cur只是一直在保存head.next的位置。        
  *                      head         //head 前进
  *     ③    null <- 1    2 -> 3 -> 4 -> null   
  *                 pre       cur              //此时还可以看出，实际反向出的链表结果应当在链表pre中
  */