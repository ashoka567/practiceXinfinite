package problems.easy;

public class FindNumberMultipulesofGivenNumber {

    public  void fizzBuzz(int n) {
        if(n < 0 || n > Integer.MAX_VALUE){
            System.out.println(n);
        }

        while(1 < n){
            int fizz = n%3;
            int buzz = n%5;
            if(fizz == 0 && buzz ==0){
                System.out.println("FizzBuzz");
            }
            else if(fizz == 0){
                System.out.println("Fizz");
            }
            else if(buzz == 0){
                System.out.println("Buzz");
            }
            else {
                System.out.println(n);
            }
            n--;
        }

    }

    public static void main(String[] args) {
        FindNumberMultipulesofGivenNumber number = new FindNumberMultipulesofGivenNumber();
          number.fizzBuzz(15);
    }
}
