package problems.easy.String;

public class Palindrome {

    public boolean palindrome(String s){
        if(s == null || s.length() == '0'){
            return false;
        }

        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.toString());
        System.out.println(s);
        if(sb.reverse().toString().equals(s)){ // need to have to string.
            return true;
        }

        return false;
    }

    public boolean palindrome1(String s){
        if(s == null || s.length() == '0'){
            return false;
        }
        int l = s.length();
        int left = (l-1)%2 == 0 ? ((l-1)/2)-1 :(l-1)/2 ;
        int right =  left % 2 == 0 ? left + 1 : left+2;
        System.out.println(left)  ;
        System.out.println(right)  ;
        boolean b = true;
        for(int i = 0; i <= left ; i++){
            if(s.charAt(left-i) == s.charAt(right+i)){
                continue;
            }else{
                b = false;
            }
        }
        return b;
    }


    public static void main(String[] args) {
        Palindrome sol = new Palindrome();
        boolean b = sol.palindrome1("123321");
        System.out.println(b);
    }
}
