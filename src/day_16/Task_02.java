package day_16;

public class Task_02 {
    public static void main(String[] args) {

        String n = "radaR"; //"12321"
        String nReverse = "";

        for (int i = n.length()-1; i >=0; i--) {

            nReverse+=n.charAt(i);


        }
      //  System.out.println(n.equals(nReverse)); //radar
        System.out.println(n.equalsIgnoreCase(nReverse)); //radaR


    }
}
