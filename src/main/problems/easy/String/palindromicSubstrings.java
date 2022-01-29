package problems.easy.String;

/**
 * @TODO
 */
public class palindromicSubstrings {
    public int countSubstrings(String S) {
        int N = S.length(), ans = 0;
        for (int center = 0; center <= 2*N-1; ++center) {
            int left = center / 2;
            int right = left + center % 2;
            while (left >= 0 && right < N && S.charAt(left) == S.charAt(right)) {
                ans++;
                left--;
                right++;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        palindromicSubstrings p = new palindromicSubstrings();
        System.out.println(p.countSubstrings("ashok'"));
    }
}
