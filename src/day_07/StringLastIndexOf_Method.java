package day_07;

public class StringLastIndexOf_Method {
    public static void main(String[] args) {
        String company ="EXELENTER";

        int e = company.lastIndexOf("E");
        System.out.println("e = " + e);

        int i = company.lastIndexOf(69);
        System.out.println("i = " + i);
        int i1=company.lastIndexOf('E');
        System.out.println("i1 = " + i1);


        String us="united states of america";

        int a = us.lastIndexOf("a");
        System.out.println("a = " + a);

        int a1 = us.lastIndexOf("a", --a);
        System.out.println("a1 = " + a1);


    }
}
