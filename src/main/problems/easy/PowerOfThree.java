package problems.easy;

/**
 * @author aganagav
 * @since
 */
public class PowerOfThree {

    /**
     * provides the given int is power of 3 or not
     *
     * @param n
     * @return boolean
     */
    public boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        return n == 1;
    }

    public static void main(String [] args){
        PowerOfThree u  = new PowerOfThree();
        u.isPowerOfThree(9);
        System.out.println(u.isPowerOfThree(9));
    }
}
