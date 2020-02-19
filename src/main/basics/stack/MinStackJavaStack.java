package basics.stack;

import java.util.Stack;

public class MinStackJavaStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<Integer>();

    /**
     * Pushing min and Original element to get the 2nd one as min
     * @param x
     */
    public void push(int x) {
        // only push the old minimum value when the current
        // minimum value changes after pushing the new value x
        if(x <= min){
            stack.push(min);
            min=x;
        }
        stack.push(x);
    }

    public void pop() {
        // if pop operation could result in the changing of the current minimum value,
        // pop twice and change the current minimum value to the last minimum value.
        if(stack.pop() == min) min=stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }

    public static void main(String[] args) {
        MinStackJavaStack stack = new MinStackJavaStack();
        stack.push(12);
        stack.push(6);
        stack.push(5);
        stack.push(1);
        stack.push(7);
        stack.push(0);

        stack.getMin();
        stack.pop();
    }
}

