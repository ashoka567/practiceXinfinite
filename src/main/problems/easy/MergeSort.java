package problems.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MergeSort {

    /**
     input : numbers, can have pos, neg
     */
    public List<Integer> sort(int[] nums){

        this.mergeSort(nums, 0, nums.length-1);

        List<Integer> list = new ArrayList<>();

        Arrays.stream(nums).forEach(item->list.add(item));

        return  list;

    }

    public void mergeSort(int[] n, int left, int right){
        if(left < right){//until 0 < 0

            int m = (left+right)/2;

            mergeSort(n, left, m);
            mergeSort(n, m+1, right);

            System.out.println(" L-> "+left+" M-> "+m+" R-> "+right);
            this.merge(n, left, m, right);

        }
    }

    public void merge(int[] n, int left, int m, int right){
        Set set = new HashSet();
        int ls = m-left+1;
        int rs = right-m;

        System.out.println("ls-> "+ls+" rs-> "+rs);
        int[] LA = new int[ls];//intial left array with size
        int[] RA = new int[rs];//intial right array with size
        for(int i = 0; i < ls; i++){
            LA[i] = n[left+i];
        }
        Arrays.stream(LA).forEach(item->System.out.println("LA-> "+item));
        for(int j = 0; j < rs; j++){
            RA[j] = n[m+1+j];
        }
        Arrays.stream(RA).forEach(item->System.out.println("RA-> "+item));
        int x =0; int y=0; int z=left;

        while (x < ls && y < rs)
        {
            if (LA[x] <= RA[y])
            {
                n[z] = LA[x];
                x++;
            }
            else
            {
                n[z] = RA[y];
                y++;
            }
            z++;
        }

        /* Copy remaining elements of L[] if any */
        while (x < ls)
        {
            n[z] = LA[x];
            x++;
            z++;
        }

        /* Copy remaining elements of R[] if any */
        while (y < rs)
        {
            n[z] = RA[y];
            y++;
            z++;
        }


    }


    public static void main(String[] args){
        MergeSort s = new MergeSort();
        int[] nums = {-1,-2,0,12,54,1,2,4,-5,0,1,2};
        List<Integer> l = s.sort(nums);

        if(l != null)
            l.forEach(item->System.out.println(item));



    }



}