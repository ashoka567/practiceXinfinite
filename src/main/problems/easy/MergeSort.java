package problems.easy;

public class MergeSort {



    public static void main(String [] args){

        MergeSort s = new MergeSort();
       // int [] a= {30,14,534,45,523,5235,1,3,5,8};
        int [] a= {30,14};
        int [] b =  new int[a.length];


        s.sort(a, b, 0, a.length);

        System.out.println(a);

    }

    private void sort(int[] a, int[] b, int m, int last) {
        if(a.length >= 1) {
            sort(a, b, m/2, a.length);
            sort(a, b, m+1, a.length);
        }else{
            if(a.length == 2 && a[0] > a[1]){
                int k = a[0];
                a[0] = a[1];
                a[1] = k;
            }
        }
    }
}
