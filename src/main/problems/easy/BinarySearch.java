package problems.easy;

public class BinarySearch {

    public static void main(String[] args) {
        int [] s = {-1,3,5,9,12,13,14,15,16,20,21} ;
        int k = 16;
        BinarySearch b = new BinarySearch();
        int l = s.length;
        if(s != null) {


           /* boolean found = b.binarySearch(s, 0, l-1, k);
            System.out.println(found);*/
        }

        System.out.println(b.binarySearchIndex(s,  k));

    }

    /**
     *
     * @param array
     * @param start
     * @param end
     * @param target
     * @return
     */
    private boolean binarySearch(int[] array, int start, int end, int target) {
        if(array == null){
            return false;
        }
        end = end-1;
        int mid = end + (start - end)/2;
        if(array[mid] == target){
            return true;
        }else if(target > array[mid]){
            return binarySearch(array, mid+1, start, target);
        }else if(target < array[mid]){
            return binarySearch(array, end, mid-1, target);
        }

        return false;
    }

   /* private int binarySearchIndex(int[] array, int start, int end, int target) {
        int pivot, left = 0, right = array.length - 1;
        while (left <= right) {
            pivot = left + (right - left) / 2;
            if (array[pivot] == target) return pivot;
            if (target < array[pivot]) right = pivot - 1;
            else left = pivot + 1;
        }
        return -1;

    }*/

    private int binarySearchIndex(int[] num, int target) {
        if(num == null){
            return -1;
        }

        //find povit point

        int left = 0;
        int right = num.length - 1; // why ? because the size of array starts from 0, so lenth is one greater than zero all the time.
        int povit;
        while(left <= right){
             povit = left + (right - left)/2;// why ? if we go with right-left/2 we will end up in bondary exception with less or huge numbers.
            if(num[povit] == target){
                return povit;
            }
            if(target < num[povit]){
                right = povit-1;
            }else{
                left = povit-1;
            }
        }
        return -1;
    }
}
