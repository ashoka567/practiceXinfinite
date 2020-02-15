package problems.easy;

public class NumberOfStepsTOZero {
    public int numberOfSteps (int num) {

        int i = 0;

        while(num != 0){
            if(num%2 == 0){  // tell even or ODD
                num = num/2;
            }else{
                num = num-1;
            }
            i++;
        }
        return i;
    }
}
