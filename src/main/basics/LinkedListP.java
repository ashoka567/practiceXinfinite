package basics;

import java.util.LinkedList;

public class LinkedListP {
    public void practiceLinkedList(){
        LinkedList linkedList = new LinkedList();
        linkedList.add(0,"12");
        linkedList.add(1,"13");
        linkedList.add(1,"14");
        linkedList.add(0,"15");

        System.out.println(linkedList);
    }

    public static void main(String[] a){
        LinkedListP p = new LinkedListP();
        p.practiceLinkedList();
    }
}
