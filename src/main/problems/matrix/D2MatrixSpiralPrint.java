package problems.matrix;

import java.lang.*;
import java.util.*;

class D2MatrixSpiralPrint {

    public List<Integer> spiral(int[][] spiral){

        if(spiral == null || spiral.length == 0){
            return null;
        }

        List<Integer> result = new ArrayList();

        int mLen = spiral.length;
        int nLen = spiral[0].length;

        int x = 0;
        int y = 0;
        while(mLen > 0 && nLen > 0){
            //move right
            for(int i = 0; i < nLen -1 ; i++){
                result.add(spiral[x][y++]);
            }
            //move down
            for(int i = 0; i < mLen -1 ; i++){
                result.add(spiral[x++][y]);
            }
            // move lfet
            for(int i = 0; i < nLen -1 ; i++){
                result.add(spiral[x][y--]);
            }

            // move up
            for(int i = 0; i < nLen - 1 ; i++){
                result.add(spiral[x--][y]);
            }

            x++;
            y++;

            mLen = mLen-2;
            nLen= nLen-2;
        }
        return result;
    }

    public  static void main(String[] args){

        /*int[][] spiral = new int[4][4];


        D2MatrixSpiralPrint  soltion = new D2MatrixSpiralPrint();

        spiral[0][0] = 1;
        spiral[0][1] = 2;
        spiral[0][2] = 3;
        spiral[0][3] = 4;

        spiral[1][0] = 5;
        spiral[1][1] = 6;
        spiral[1][2] = 7;
        spiral[1][3] = 8;

        spiral[2][0] = 9;
        spiral[2][1] = 10;
        spiral[2][2] = 11;
        spiral[2][3] = 12;

        spiral[3][0] = 13;
        spiral[3][1] = 14;
        spiral[3][2] = 15;
        spiral[3][3] = 16;

        List<Integer> result = soltion.spiral(spiral);

        for(Integer val : result){
            System.out.println(val);
        }*/

        int[][] spiral = new int[3][3];


        D2MatrixSpiralPrint  soltion = new D2MatrixSpiralPrint();

        spiral[0][0] = 1;
        spiral[0][1] = 2;
        spiral[0][2] = 3;

        spiral[1][0] = 4;
        spiral[1][1] = 6;
        spiral[1][2] = 7;

        spiral[2][0] = 8;
        spiral[2][1] = 9;
        spiral[2][2] = 10;

        List<Integer> result = soltion.spiral(spiral);

        for(Integer val : result){
            System.out.println(val);
        }
    }
}
