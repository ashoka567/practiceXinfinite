package problems.easy;

import java.util.SortedSet;
import java.util.TreeSet;

public class LargetNumber {
    /**
     * if its duplicate then 2nd larget is also the same
     *
     * @param args
     */
    public static void main(String[] args) {
        int arr[] = { 86, 86, 92, 52, -14, -46, -147, -86, -92, -52, -48, 86, 92, -36, -66, -85,0,1 ,14, 46, 47, 48, 36, 66, 85 };
        int largest = arr[0];
        int secondLargest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];

            }
        }
        System.out.println(largest+ " -  " +secondLargest);

        SortedSet s = new TreeSet();
        s.comparator();
    }

}
