package day_46.SP;

public class Task4_3 {

    static int getTotalOfLength(String str) {
        int total=0;
        for (String s : str.split(" ")) {
            total+=s.length();
        }


        return total;
    }

    public static void main(String[] args) {
//        String str="Java is fun 2005";
//        int totalOfLength = getTotalOfLength(str);
//        System.out.println(totalOfLength);

        for (String arg : args) {

            System.out.println(getTotalOfLength(arg));
        }
    }
}
