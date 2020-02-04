package problems;

public class SquareRoot {

    public void div(int a , int b){
        int c = 0;
        int s= b;
        while(s < a){
            s   += b;// while add the same to its value. here 'b' doubled and added to S.
            c ++;
        }
        System.out.println(c);
    }

    public static void main(String[] args) {
        SquareRoot s = new SquareRoot();
        s.div(10,7);
    }
}
