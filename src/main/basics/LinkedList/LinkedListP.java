package basics.LinkedList;

import java.util.LinkedList;

public class LinkedListP<T> {

    MyNode head = null;
    MyNode tail = null;

    public <T> void insert(T o){
        MyNode node1 = new MyNode(o, null);
        if(head == null ){
            head = node1;
            tail = head;
        }else {
            if(tail != null) {
                tail.next = node1;
            }
            tail = node1;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        LinkedListP p = new LinkedListP();
        p.insert("12");
        p.insert("123");
        p.insert("124");
        p.insert("125");
        p.insert("126");
        p.insert("127");

    }
}
