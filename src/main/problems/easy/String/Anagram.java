package problems.easy.String;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public boolean isAnagram(String s, String t) {
        if(s == null || t == null){
            return false;
        }
        //Add to the map with count
        Map<Character, Integer> m = new HashMap<>();
        for(int i = 0; i <= s.length()-1; i++){
            Character c = s.charAt(i);
            if(m.containsKey(c)){
                int k = m.get(c);
                m.put(c, ++k);
            }else{
                m.put(c, 1);
            }
        }
        // decrease in the map , if its size is 0 then , its anagram.
        for(int i = 0; i <= t.length()-1; i++){
            Character c = t.charAt(i);
            if(m.containsKey(c)){
                if(m.get(c) == 1){
                    m.remove(c);
                }else{
                    int k = m.get(c);
                    m.put(c, --k);
                }

            }
            else{
                return false;
            }
        }

        if(m.size() == 0){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Anagram a = new Anagram();
        System.out.println(a.isAnagram("abcabc", "bacbac"));
    }

}
