package basics.LinkedList;

public  class MyNode<T> {
    Object object;

    MyNode next;

    MyNode prev;

    public MyNode(Object object, MyNode next, MyNode myNodePrv) {
        this.object = object;
        this.next = next;
        this.prev = myNodePrv;
    }

    public MyNode(Object object, MyNode next) {
        this.object = object;
        this.next = next;
    }


        public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    public MyNode getPrev() {
        return prev;
    }

    public void setPrev(MyNode prev) {
        this.prev = prev;
    }
}
