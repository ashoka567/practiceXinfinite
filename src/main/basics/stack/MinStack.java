package basics.stack;

import java.util.Stack;

class MinStack {

    /** initialize your data structure here. */
    public MinStack() {

    }

    private int [] elementData;

    private static int initialSize = 10;

    private static int size = -1;

    private static int minElement;

    public void push(int x) {
        if(elementData == null){
            elementData = new int[initialSize];
        }else if(size>= elementData.length){
            System.arraycopy(elementData, 0, elementData, 0,
                    Math.min(elementData.length, initialSize));
        }
        elementData[++size] = x;
        if(elementData.length > 1 && minElement != 0) {
            minElement = minElement <  elementData[size] ? minElement :  elementData[size];
        }else{
            minElement = elementData[0];
        }
    }

    public void pop() {
        if(size >= 0) {
            --size;
            System.arraycopy(elementData, size, elementData, size,
                    Math.min(size, 0));
        }
    }

    public int top() {
        return elementData[size];
    }

    public int getMin() {

        return minElement;
    }

    public static void main(String[] args){
        MinStack minStack = new MinStack();
        minStack.push(5);
        minStack.push(7);
        minStack.pop();
        minStack.push(3);
        minStack.push(4);

        minStack.getMin();



    }
}
