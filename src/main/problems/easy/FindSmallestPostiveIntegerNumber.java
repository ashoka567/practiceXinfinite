package problems.easy;

public class FindSmallestPostiveIntegerNumber {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if(A == null || A.length < -1000000 || A.length > 1000000 ){
            return Integer.MAX_VALUE;
        }
        int nearPosInt = Integer.MAX_VALUE;
        int highInt = Integer.MIN_VALUE;
        int minInt = Integer.MAX_VALUE;
        int size = A.length-1;
        for(int i = 0 ; i < size-1; i++){
            if(A[i] > highInt){
                highInt =  A[i];
            }
            if(A[i] < minInt ){
                minInt = A[i];
            }
        }
        System.out.println(highInt);
        System.out.println(minInt);
        return -1;
    }

    public static void main(String[] args) {
        FindSmallestPostiveIntegerNumber sol = new FindSmallestPostiveIntegerNumber();
        int[] i = {-1,1,1,1,2,12,4,7,3};
        sol.solution(i);
    }
}

