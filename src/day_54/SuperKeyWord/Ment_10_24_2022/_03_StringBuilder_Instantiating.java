package day_54.SuperKeyWord.Ment_10_24_2022;

public class _03_StringBuilder_Instantiating {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();

        sb.append("StringBuilder");
        System.out.println("sb = " + sb);

        StringBuilder sb1=new StringBuilder(sb);
        System.out.println("sb1 = " + sb1);

        StringBuilder append = sb.deleteCharAt(10);
        System.out.println("append = " + append);

        StringBuilder reverse = sb.reverse();
        System.out.println("reverse = " + reverse);

    }
}
