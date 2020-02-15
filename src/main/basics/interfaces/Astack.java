package basics.interfaces;

public interface Astack<E> {

    public int g = -1;

    public boolean isEmpty();

    public E push(E o);

    public E pop();

    public E top();

    public int size();
}
