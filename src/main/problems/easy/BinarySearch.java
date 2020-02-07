package problems.easy;

public class BinarySearch {

    public static void main(String[] args) {
        int [] s = {1,2,3,4,5,6,7,8,9};
        int k = 8;
        if(s != null) {
            int l = s.length;
            BinarySearch b = new BinarySearch();
            boolean found = b.binarySearch(s, 0, l-1, k);

        }

    }

    /**
     *
     * @param s
     * @param m
     * @param l
     * @param k
     * @return
     */
    private boolean binarySearch(int[] s, int r, int l, int k) {
        if(s == null){
            return false;
        }
        int mid = l + (r - l)/2;
        if(s[mid] == k){
            return true;
        }else if(k > s[mid]){
            return binarySearch(s, mid+1, r, k);
        }else if(k < s[mid]){
            return binarySearch(s, l, mid-1, k);
        }

        return false;
    }
}
