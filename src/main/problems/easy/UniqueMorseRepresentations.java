package problems.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author aganagav
 * @since
 */
public class UniqueMorseRepresentations {


    /**
     * extra for loop for alphabet index
     *
     * @param words
     * @return
     */
    public int uniqueMorseRepresentations(String[] words) {
        if(words == null){
            return 0;
        }
        String[] d = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] d1 = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        Map<String,String> m = new HashMap<>();
        for(int i =0 ; i <= d.length-1; i++){
            m.put(d1[i], d[i]);
        }
        Set<String> count = new HashSet<>();
        //Set<String> count1 = new HashSet<>();
        for(int k = 0 ; k <= words.length-1; k++){
            String s = words[k];
            String c = "";
            //StringBuilder result = new StringBuilder();
            for(int l = 0 ; l <= s.length()-1; l++){
                c = c.concat(d[s.charAt(l)-'a']);
               // result.append(d[s.charAt(l)-'a']);
            }

            System.out.println("1 -> " + c);
           // System.out.println("2 -> " + result);
            count.add(c);
           // count1.add(result.toString());
        }
         return count.size();
    }

    /**
     * [c-'a'] is used to now the index of the alphabet
     *
     * String builder is better than string for concatenation.
     *
     * @param words
     * @return int
     */
    public int uniqueMorseRepresentations1(String[] words) {
        String[] table = { ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.",
                "--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.." };
        HashSet<String> trans = new HashSet<>();

        for(String s : words) {
            StringBuilder builder = new StringBuilder();
            for(char c : s.toCharArray()){
                builder.append(table[c-'a']);
            }
            System.out.println("3 -> " + builder.toString());
            trans.add(builder.toString());
        }

        return trans.size();
    }

    public static void main(String []args ){
        String []b = {"rwjje","aittjje","auyyn","lqtktn","lmjwn"};
        UniqueMorseRepresentations u  = new UniqueMorseRepresentations();
        u.uniqueMorseRepresentations(b);
        u.uniqueMorseRepresentations1(b);
    }
}
