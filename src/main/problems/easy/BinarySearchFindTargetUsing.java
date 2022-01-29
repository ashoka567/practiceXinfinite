package problems.easy;

public class BinarySearchFindTargetUsing {
    public int search(int[] nums, int target) {
        int result = -1;
        if(nums.length < 1){
            result =  binarySearch(nums, 0, nums.length-1,  target);

        }
        return result;
    }

    private int binarySearch(int[] array, int start, int end, int target) {
        if(array == null){
            return -1;
        }
        int mid = end + (start - end)/2;
        if(array[mid] == target){
            return mid;
        }else if(target > array[mid]){
            return binarySearch(array, mid+1, start, target);
        }else if(target < array[mid]){
            return binarySearch(array, end, mid-1, target);
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearchFindTargetUsing  binarySearchFindTargetUsing = new BinarySearchFindTargetUsing();
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(binarySearchFindTargetUsing.search(nums, target));
    }
}
