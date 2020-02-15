package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OperatorPLUSaMINUS {
    public static void main(String[] args) {
        int i = 5;
        int j=5;
        int k =5;
        int l=5;
        System.out.println("++" + i++);
        System.out.println("++" + i);

        System.out.println("++" + ++j);
        System.out.println("++" + j);

        System.out.println("--" + --k);
        System.out.println("++" + k);

        System.out.println("--" + l--);
        System.out.println("++" + l);

        int[]s= {1,2};
        List<Integer> sa = new ArrayList<>();
        Arrays.stream(s).forEach(item->sa.add(item));
    }
}
