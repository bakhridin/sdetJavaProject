package SaturdayProject_08_27_2022;

public class Task_07 {
    public static void main(String[] args) {
        /**
         * Task7.
         * Create random string, which has a length of 30 and all characters are lower case letters.
         * return a count of the most repeated character.
         * Example: flapoeplksldfalafaaafoiwefafsa === output should be 8, since a is the most repeated.
         */

        String str = "flapoeplksldfalafaaafoiwefafsa";
        int index = 0;
        int count = 0;


        while(index<str.length()){
            // solution 1
            count += str.charAt(index) == 'a' ? 1 : 0;

            //solution 2
//            if(str.charAt(index) == 'a'){
//                ++count;
//            }
            index++;
        }
        System.out.println("count = " + count);



    }
}
