package day_18;

public class JavaLabeledLoop {
    public static void main(String[] args) {
        String str = "ABC";


        for (int i = 1; i < 5; i++) {

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'C') {
                    break;
                }

                System.out.print("" + i + str.charAt(j) + " ");

            }
        }
        System.out.println("============================");
        outerLoop:
        for (int i = 1; i < 5; i++) {
            innerLoop:
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j)=='C') {
                    break outerLoop;
                }

                System.out.print(""+i+str.charAt(j)+" ");

            }
          // System.out.println();

        }
    }
}
