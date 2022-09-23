package SaturdayProject_08_27_2022;

import java.util.Random;

public class Task_02 {
    /**
     *Task2:
     * Create a random password generator.
     * 1. Password should be minimum 16 characters
     * 2. Password should have 4 Capital letter.
     * 3. Password should have 4 lower case letter.
     * 4. Password should have 4 numbers.
     * 5. Password should have 4 special character.
     *
     * Example: Qe4$Os5!De1$Oe3&
     */

    public static void main(String[] args) {
//        String str = "Just because the water is red doesn't mean you can't drink it.";
//        int index = 0;
//        int count = 0;
//
//
//        while(index<str.length()){
//            // solution 1
//            //count += str.charAt(index) == 'a' ? 1 : 0;
//
//            //solution 2
//            if(str.charAt(index) == 'a'){
//                ++count;
//            }
//            index++;
//        }
//        System.out.println("count = " + count);

//        String str1="Qe4$Os5!De1$Oe3&";
//        int index1=0;
//        int count1=0;
//        int total=0;
//
//        while (index1<str1.length()) {
//            if (str1.length()>=16){
//                index1++;
//            }
//
//        }
//        System.out.println("count1 = " + index1);

              /*Task2
        *Create a random password generator.
1. Password should be minimum 16 characters
2. Password should have 4 Capital letter.
3. Password should have 4 lower case letter.
4. Password should have 4 numbers.
5. Password should have 4 special character.

Example: Qe4$Os5!De1$Oe3&
        * */

        String pwd = "";
        String capitals = "ABCDHAGSBTSGFDASKASLASLAS";
        String smallCase = "adadjkgadgaadashdasdhasdh";
        String numbers = "12345678912123123123123";
        String specialChars = "!@#$%^&*()<>?{}[]";

        Random rnd = new Random();

        while (pwd.length()<16) {
            pwd += capitals.charAt(rnd.nextInt(capitals.length()));
            pwd += smallCase.charAt(rnd.nextInt(smallCase.length()));
            pwd += numbers.charAt(rnd.nextInt(numbers.length()));
            pwd += specialChars.charAt(rnd.nextInt(specialChars.length()));
            pwd += rnd.nextInt(10);
        }
        System.out.println("pwd = " + pwd);
    }
}
