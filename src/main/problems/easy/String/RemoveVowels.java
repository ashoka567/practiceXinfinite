package problems.easy.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveVowels {

    public static void main(String[] args){
        String s = "welcome";
        List a = new ArrayList<Character>();

        a.add('a');a.add('e');a.add('i');a.add('o');a.add('u');

        StringBuffer s1 = new StringBuffer(s);
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if( a.contains(c) && i < s.length()){
                s1 = s1.replace(i, i+1, "");
            }
        }
        System.out.println(s1.toString());

        StringBuffer sb = new StringBuffer();
       // sb.replace()
    }


}
