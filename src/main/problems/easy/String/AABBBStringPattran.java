package problems.easy.String;

public class AABBBStringPattran {

    public boolean solution(String s) {

        if(s == null || s.isEmpty()){
            return false;
        }
        boolean startsWithA = s.charAt(0) == 'a';
        char start = s.charAt(0);
        boolean charFlip = false;
        for(int i = 0; i <= s.length()-1; i++){
            if(!startsWithA && i != 0 && s.charAt(i) == 'a'){//to make sure started not  "a" and ended up having 'a' along the way
                return false;
            }
            if(start != s.charAt(i)){ // start char is not same as later chars
                charFlip = true;
            }
            if(charFlip && start == s.charAt(i)){ // this will give the diffrent char is present in the sequance.
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        AABBBStringPattran a = new AABBBStringPattran();
        System.out.println(a.solution("aaabbb"));
        System.out.println(a.solution("ba"));
        System.out.println(a.solution("aaa"));
        System.out.println(a.solution("b"));
        System.out.println(a.solution("abba"));
    }
}
