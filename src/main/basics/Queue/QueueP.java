package basics.Queue;

import basics.interfaces.AQueue;
import java.lang.reflect.Array;
import java.util.Arrays;

public class QueueP<E> implements AQueue<E> {

    public QueueP(){
        objects =  (E[]) new Object[initialSize];
    }
    private final int initialSize = 2;

    private int size =-1;

    private E[] objects = null;

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public E push(E o) {
        if(objects.length - 1 == size){
            objects = Arrays.copyOf(objects, objects.length+initialSize);
        }
        size = size+1;
        objects[size] = o;
        return o;
    }

    @Override
    public E pop() {
        E o = null;
        if(size > 0){
            o = objects[0];
            size--;
            E[] temp = (E[]) Array.newInstance(Object.class, objects.length);
            temp = objects;
            objects = (E[]) Array.newInstance(Object.class, objects.length);
            System.arraycopy(temp, 1, objects, 0,
                    Math.min(objects.length-1, objects.length+1));
        }
        return o;
    }

    @Override
    public E peek() {
        return objects[size];
    }

    @Override
    public E pool() {
        return this.pop();
    }

    @Override
    public int Size() {
        return size;
    }

    public static void main(String[] args) {
        QueueP p = new QueueP();
        p.push(12);
        p.push(13);
        p.push(14);
        p.push(15);
        p.push(16);

        p.pop();
        p.pop();
        p.pop();

        System.out.println(p.size);
    }
}
