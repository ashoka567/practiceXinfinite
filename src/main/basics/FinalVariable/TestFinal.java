package basics.FinalVariable;

import java.util.ArrayList;
import java.util.List;

public class TestFinal {

    static final List<String> finalList = new ArrayList<>();

    static final String s = "ABC";

    public void testF(final List<String> finalList){

        finalList.add("A");

        System.out.println(" =-> " +finalList.size());

        s.concat("b");

        System.out.println(s);

    }

    public static void main(String[] args) {
        TestFinal testFinal = new TestFinal();
        finalList.add("B");
        testFinal.testF(finalList);

    }
}
