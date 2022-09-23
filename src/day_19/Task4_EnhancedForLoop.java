package day_19;

public class Task4_EnhancedForLoop {
    public static void main(String[] args) {

        String[] strArr = {"$50", "$150", "$5", "$18", "$25"};
        int total = 0;
        double average = 0;
        for (String s : strArr) {
            s = s.replaceAll("[^0-9]", "");
            System.out.println(" " + s);
            total += Integer.parseInt(s);
            average=(double)total/ strArr.length;
        }

        System.out.println(total);
        System.out.println(average);
    }
}
