package day_21;

import java.util.Arrays;
import java.util.Random;

public class Java2DArray4 {
    public static void main(String[] args) {
        Random rnd=new Random();

        int [][] intArr=new int[4][5];

        for (int i = 0; i < intArr.length; i++) {
            for (int i1 = 0; i1 < intArr[i].length; i1++) {
                intArr[i][i1]=rnd.nextInt(10);

            }
        }
        System.out.println("Arrays.deepToString(intArr) = " + Arrays.deepToString(intArr));

       int[]intArr2=new int[intArr.length];

        for (int i = 0; i < intArr.length; i++) {
            for (int i1 = 0; i1 < intArr[i].length; i1++) {
               // intArr[i][i1]=rnd.nextInt(10);
                intArr2[i]+=intArr[i][i1];

            }
        }

        System.out.println(Arrays.toString(intArr2));




    }
}
