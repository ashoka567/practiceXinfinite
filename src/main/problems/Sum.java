package problems;

import java.util.Arrays;

public class Sum {

    public static Integer sum(int[] values){
         return Arrays.stream(values).sum();
    }

    public static int sumLoop(int[] values){
        if(values == null || (values != null && values.length <= 0)){
            return 0;
        }
        int k = 0;
        int  s = 0;
        while(k < values.length){
            s += values[k];
            k++;
        }
        return s;
    }

    public static void main(String [] args){
        int[] values = {12,12,12,12,11,1,1};
        int s = sumLoop(values)/4;
    }
}

