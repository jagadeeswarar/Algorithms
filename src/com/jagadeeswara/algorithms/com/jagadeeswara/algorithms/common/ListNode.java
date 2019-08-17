package com.jagadeeswara.algorithms.com.jagadeeswara.algorithms.common;

public class ListNode {
    int val;
    ListNode next;
    public ListNode(int x) { val = x; }

    public int getVal() {
        return val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public boolean hasNext(){
        return (next != null);
    }

    @Override
    public String toString() {
        return val + "->" + next;
    }
}
