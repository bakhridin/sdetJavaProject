package day_05;

public class ArithmeticOperatorsIncrementalDay5_01 {
    public static void main(String[] args) {
        //Java Increment ==>> Increases value of variable only by 1 when it is called next time after assignment;
        //Java Decrement

        int i=5;
        System.out.println("i = " + i); //5

        i =i+1;
        System.out.println("i = " + i); //6

        i+=1;
        System.out.println("i = " + i); //7

        i++;
        System.out.println("i = " + i); //8

        System.out.println(i++); //Still 8
        System.out.println(i++); //9
        System.out.println(i++); //10


        // question 2

        int num=5;
        System.out.println(num++);
        System.out.println(num++);
        System.out.println(num++);
        System.out.println(num);
        System.out.println(num++);
        System.out.println(num++);

        //question

        int j=10;
        j+=10;
        j++;
        j++;
        System.out.println("j = " + j);

//        for (int k = 0; k < 5; k++) {   // k++ can be as k+=1 or k=k+1;
//            System.out.println("k = " + k);
//
//        }



    }
}
