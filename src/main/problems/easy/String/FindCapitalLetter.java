package problems.easy.String;

import java.util.ArrayList;
import java.util.List;

public class FindCapitalLetter {
    public boolean detectCapitalUse(String word) {
        boolean firstUpper = false;
        int lower = 0;
        int upper = 0;
        int k = word.length();
        if(word == null || word == ""){
            return false;
        }else {
            for(int i = 0; i < k; i ++){
                if(Character.isUpperCase(word.charAt(0))){
                    firstUpper = true;
                }
                if(Character.isUpperCase(word.charAt(i))){
                    ++upper;
                }else{
                    ++lower;
                }
            }
        }
        if((firstUpper && upper == k) || (firstUpper && lower == k-1)){
            return true;
        }else if(!firstUpper && lower == k){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] ars){
        FindCapitalLetter s = new FindCapitalLetter();
        System.out.println(s.detectCapitalUse("Leetcode"));
    }
}
