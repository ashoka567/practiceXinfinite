package problems.easy.String;

public class LongestPalindorme {
    private int lo, maxLen;

    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2)
            return s;

        for (int i = 0; i < len-1; i++) {
            extendPalindrome(s, i, i);  //assume odd length, consider every char as middle
            extendPalindrome(s, i, i+1); //assume even length., consider every char as middle
        }
        return s.substring(lo, lo + maxLen);
    }

    private void extendPalindrome(String s, int j, int k) {
        System.out.println(j + " + " + k);
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) { //compare from every char.
            System.out.println(j + " - " + k);
            j--;
            k++;
        }

        if (maxLen < k - j - 1) {
            lo = j + 1;
            maxLen = k - j - 1;
        }
         System.out.println(lo + " LR " + maxLen);
    }

    public static void main(String[] args) {
        LongestPalindorme sol = new LongestPalindorme();
        System.out.println(sol.longestPalindrome("qa12321321qw"));
    }
}
