package basics;

import java.util.Stack;

public class StackP {

    public static void main(String[] args){
        Stack s = new Stack();
        s.push("Ashok");
        s.push("Ashok1");
        s.push("Ashok2");
        s.push("Ashok3");
        s.push("Ashok4");

        s.pop();
        System.out.println(s);
    }
}
