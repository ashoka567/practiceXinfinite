package problems.easy;

public class MoveZeros {

    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
        /*if(nums.length == 0){ // length  for an array is not a method
            return;
        }

        int lastIndexNotZero = nums.length -1;
        for(int i = 0; i < nums.length ; i++){ //while writing for loop, int is not ==

            lastIndexNotZero = getNonZeroLastIndex(lastIndexNotZero, nums);

            int lastNonZVal = nums[lastIndexNotZero];

            if(nums[i] == 0){
                nums[lastIndexNotZero] = 0;
                nums[i] = lastNonZVal;
            }

            int nextValIndex = i;
            if(i < nums.length-1){
                nextValIndex = i+1 ;
            }

            if(lastNonZVal > nums[nextValIndex]){
                nums[i+1] = nums[lastIndexNotZero];
                nums[i] = nums[nextValIndex];
            }else{
                nums[i] = nums[lastIndexNotZero];
            }
        }*/
    }

    public Integer getNonZeroLastIndex(int lastIndexNotZero, int[] nums){
        while(lastIndexNotZero > 0){
            if(! (nums[lastIndexNotZero] == 0)){// For integers not symbol is not expected cause it wont return boolean i guess.
                break;
            }else{
                lastIndexNotZero --;
            }
        }
        return lastIndexNotZero;
    }

    public static  void main(String[] s){
        MoveZeros moveZeros = new MoveZeros();
        int nums[] = {1,0,9,5,0,3,7};
        moveZeros.moveZeroes(nums);
        System.out.println(nums);
    }

}
