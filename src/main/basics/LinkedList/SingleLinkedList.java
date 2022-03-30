package basics.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SingleLinkedList {

    Node head,tail;

    public class Node implements Cloneable{
        Integer t;
        Node next;
        Node(){
        }
        Node(Integer t){
            this.t = t;
        }
    }

    public void add(Integer t){
        Node newNode = new Node(t);
        if(head == null){
            head = newNode;
        }else{
            tail.next = newNode;
        }
        tail = newNode;
    }

    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.add(2);
        singleLinkedList.add(3);
        singleLinkedList.add(5);

        SingleLinkedList singleLinkedList1 = new SingleLinkedList();
        singleLinkedList1.add(1);
        singleLinkedList1.add(6);
        singleLinkedList1.add(7);


        SingleLinkedList singleLinkedList2 = new SingleLinkedList();
        singleLinkedList2.add(2);
        singleLinkedList2.add(5);
        singleLinkedList2.add(7);

        SingleLinkedList linkedList = new SingleLinkedList();
        SingleLinkedList singleLinkedList3 = linkedList.merge(Arrays.asList(singleLinkedList.head, singleLinkedList1.head, singleLinkedList2.head));
    }

    private SingleLinkedList merge(List<Node> asList) {

        //list has insertion order
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        //remove the head , since they are already sorted, if the value is equal or greater
        if(asList == null || asList.isEmpty()){
            return singleLinkedList;
        }
        List<Integer> list = new ArrayList();
        for (Node node : asList) {
            Node tempNode = node;
            while (tempNode != null){
                list.add(tempNode.t);
                tempNode = tempNode.next;
            }
        }
        Integer[] soertedArray = list.toArray(Integer[]::new);
        Arrays.sort(soertedArray);
        SingleLinkedList finalout = new SingleLinkedList();
        for (Integer val : soertedArray
             ) {
            finalout.add(val);
        }

        for (Node node : asList) {
            if(singleLinkedList.head == null ){
                singleLinkedList.head =  node;
                singleLinkedList.tail = node;
            }else{
                if (singleLinkedList.tail.t <=  node.t) {
                    singleLinkedList.tail.next = node;
                    singleLinkedList.tail = node;
                }else if(singleLinkedList.tail.t > node.t){
                    //loop from first head to fit this node.
                    Node currentHead = singleLinkedList.head;
                    while(currentHead != null ){
                        if(currentHead.t >= node.t ){
                            Node temp = currentHead.next;
                            currentHead.next = node;
                            node.next = temp;
                            singleLinkedList.head = currentHead;
                            if(node.next != null) {
                                currentHead = node.next.next;
                            }
                            else{
                                currentHead = null;
                            }
                        }else {
                            if(currentHead.next != null){
                                currentHead = currentHead.next;
                            }else{
                                currentHead = null;
                            }
                        }
                    }
                }
            }


            }

        return singleLinkedList;
    }
}
