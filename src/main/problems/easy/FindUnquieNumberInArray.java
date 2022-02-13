package problems.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindUnquieNumberInArray {
    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        if(a.size() < 1 || a.size() > 100 || a == null){
            return -1;
        }
        Map<Integer, Integer> valMap = new HashMap();
        for(Integer val : a){
            Integer valueCounter = valMap.get(val);
            if(valueCounter == null || valueCounter == 0){
                valMap.put(val, 1);
            }else{
                valueCounter = ++valueCounter;
                valMap.put(val, valueCounter);
            }
        }
        for(Integer key : valMap.keySet()){
            Integer uni = valMap.get(key);
            if(1 == uni){
                return key;
            }
        }
        return -1;
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        if(arr == null || arr.isEmpty()){
            return -1;
        }
        int rightDiagnolSum = 0;
        int leftDiagnolSum = 0;
        int right = 0;
        int left = arr.get(0).size()-1;
        for(List<Integer> innrList : arr){
            rightDiagnolSum = rightDiagnolSum + innrList.get(right);
            leftDiagnolSum = leftDiagnolSum + innrList.get(left);
            right++;
            left--;
        }
        return rightDiagnolSum-leftDiagnolSum;
    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(0);
        list.add(0);
        list.add(2);
        FindUnquieNumberInArray.lonelyinteger(list);
    }
}
