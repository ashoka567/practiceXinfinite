package basics;

public class MyLinkedList {
    public Object[] list = new Object[5];

    public void add(Object input){
        int startIndex = 0;
        if(list[startIndex] == null){
            list[startIndex] = new Node(input, null);
        }else{

            list[startIndex] = new Node(input, null);
            Node privousOne =  (Node)list[startIndex-1];
            privousOne.next = input;

        }
        ++startIndex;

    }


    public class Node{
        public Object current;
        public Object next;
        public Node(Object current, Object next){
            this.current = current;
            this.next = next;
        }

    }


    public static void main(String[] args){
        MyLinkedList list = new MyLinkedList();
        list.add(1);
        list.add(2);

    }
}
