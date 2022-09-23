package SaturdayProject_08_20_22;

public class StringUpperCase {
    public static void main(String[] args) {


        String str5="ExeElenTeR";

        int count=0;

        for (int i = 0; i < str5.length(); i++) {
            if (Character.isUpperCase(str5.charAt(i))) {
//                String s = String.valueOf(str5.charAt(i));
                System.out.print(str5.charAt(i)+" ");
                count++;
            }


        }
        System.out.println("\nTotal of upper letters are: "+count);




    }
}
