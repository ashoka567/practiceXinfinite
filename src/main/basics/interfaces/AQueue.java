package basics.interfaces;

public interface AQueue
{
    int front = -1;

    int rear = -1;

    public boolean isEmpty();

    public boolean eQ(Object o);

    public boolean dQ(Object o);

    public Object top();
}
