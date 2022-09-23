package day_26;

public class JavaMethods {
    public static void main(String[] args) {

//        String str="42.5", str1="50.5";
//        double total = getTotal(str, str1);
//        System.out.println("total = " + total);

        int [] arr={32,17,52,48,7};
        int number =7;
        boolean isTrue=false;


        for (int i : arr) {

            if (i==number) {
                isTrue=true;
            }


        }

        System.out.println(isTrue);




    }

    public static double getTotal(String str, String str1) {
       double total=0;

       total=Double.parseDouble(str.replace("$",""))
               +Double.parseDouble(str1.replace("$",""));

       return total;
    }



}
