package basics.interfaces;

public interface AQueue<E>
{
    int front = -1;

    int rear = -1;

    public boolean isEmpty();

    public E push(E o);

    public E pop();

    /**
     * head of list , first one
     * @return
     */
    public E peek();

    public E pool();

    public int Size();

}
