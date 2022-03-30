package basics.LinkedList;

public class DoubleLinkedList<E> {

    private Node<E> head, tail;


    private  class Node<E> {
        E e;
        Node next;
        Node prev;
        Node(E e){
            this.e = e;
        }
    }

    void add(E e){
        Node newNode = new Node(e);
        newNode.prev = tail;// first add prev
        if(head == null){
            head = newNode; // head first
        }else {
            tail.next = newNode; // add new to tail
        }
        tail = newNode; // change tail to new node
    }

    public static void main(String[] args) {
        DoubleLinkedList linkedList = new DoubleLinkedList();
        linkedList.add(17);
        linkedList.add(198);
        linkedList.add(1);
        linkedList.add(19);

        DoubleLinkedList linkedList1 = new DoubleLinkedList();
        linkedList1.add(123);
        linkedList1.add(1238);
        linkedList1.add(11);
        linkedList1.add(10);

        DoubleLinkedList linkedList2 = new DoubleLinkedList();
        linkedList2.add(167);
        linkedList2.add(1798);
        linkedList2.add(18);
        linkedList2.add(189);

        DoubleLinkedList doubleLinkedListAll = new DoubleLinkedList();
        doubleLinkedListAll.add(linkedList);
        doubleLinkedListAll.add(linkedList1);
        doubleLinkedListAll.add(linkedList2);


    }
}
