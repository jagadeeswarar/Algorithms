package com.jagadeeswara.algorithms.easy;

import com.jagadeeswara.algorithms.com.jagadeeswara.algorithms.common.ListNode;

public class LinkedListAdd2Numbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(5);
        ListNode l11 = new ListNode(4);
        ListNode l12 = new ListNode(3);
        ListNode l21 = new ListNode(6);
        ListNode l22 = new ListNode(4);

        l11.setNext(l12);
        l1.setNext(l11);

        l21.setNext(l22);
        l2.setNext(l21);

        System.out.println(addTwoNumbers(l1,l2));
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode returnNode = null;
        int carry = 0;
        ListNode temp = null;
        for(;;){
            if(l1 == null){
                break;
            }
            int sum = l1.getVal() + l2.getVal() + carry;
            if(returnNode != null){
                temp.setNext(new ListNode(sum%10));
                temp = temp.getNext();

            }else{
                returnNode = new ListNode(sum%10);
                temp = returnNode;
            }
            carry = sum / 10;
            l1 = l1.getNext();
            l2 = l2.getNext();
        }
        return returnNode;
    }
}
