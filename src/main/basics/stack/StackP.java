package basics.stack;

import basics.interfaces.Astack;
import java.util.Arrays;

public class StackP<E> implements Astack<E> {

    private Object[] elementData;

    private static int initialSize = 10;

    private static int size = -1;

    private static int minElement;

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public E push(E o) {
        if(elementData == null){
            elementData = new Object[initialSize];
        }else if(size()>= elementData.length){
            elementData = Arrays.copyOf(elementData, elementData.length+initialSize, Object[].class);
        }
        return o;
    }

    @Override
    public E pop() {
        E o = null;
        if(size >= 0) {
            o = (E) elementData[size()];
            System.arraycopy(elementData, size, elementData, size,
                    Math.min(size, 0));
        }
        return o;
    }

    @Override
    public E top() {
        return (E) elementData[size];
    }

    @Override
    public int size() {
        return size;
    }

    public int getMin() {
        return minElement;
    }

   /* public static void main(String[] args){
        Stack s = new Stack();
        s.push("Ashok");
        s.push("Ashok1");
        s.push("Ashok2");
        s.push("Ashok3");
        s.push("Ashok4");

        s.pop();
        System.out.println(s);
    }*/
}
