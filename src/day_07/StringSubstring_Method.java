package day_07;

public class StringSubstring_Method {
    public static void main(String[] args) {

        String company="i live in new york. new york is a big city";

//        String substring = company.substring(10);
//        System.out.println("substring = " + substring);

        String s = company.substring(20, 37);
        System.out.println("s = " + s);

        String word="JAVA IS FUN";
        String substring = word.substring(0, 4);
        System.out.println("substring = " + substring);

        String fun = word.substring(word.indexOf("FUN")).toString();
        System.out.println("fun = " + fun);


    }
}
