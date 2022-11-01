package day_16;

public class Task_08 {
    public static void main(String[] args) {

//        for (int i = 0; i < 50; i++) {
//            if (i%6==0) {
//                continue;
//            }
//            System.out.print(i+" ");
//
//        }
         /*
    print all numbers from 0 to 50, except numbers divisible by 6
     */

        for (int i = 0; i < 50; i++) {
            if(i%6 == 0){
                continue;
            }
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("====================");

        int index = 0;
        while(index < 50){
            if(index%6 == 0){
                index++;
                continue;
            }
            System.out.print(index + " ");
            index++;
        }


    }
}
