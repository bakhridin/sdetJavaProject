package day_15;

public class JavaWhileLoop {
    public static void main(String[] args) {

        int num=0;

//        while (num++ < 10) {
//            System.out.print("Hello");
//            System.out.print("World");
//            System.out.print("!!!!!!!");
//            System.out.println(num);
//
//        }

//        String str="Hello world";
//        int index=0;
//        while (str.charAt(index)!='w') {
//            System.out.print(str.charAt(index));
//            index++;
//        }

//        String str1="Java is Fan";
//        int num1=0;
//
//        while (num1<str1.length()){
//            System.out.print(str1.charAt(num1));
//            num1++;
//        }

//        int n=10;
//        int sum=0;
//
//        boolean b=true;
//
//        while (sum<n) {
//            sum+=1;
//            if (sum==10)
//                b=false;
//
//            System.out.println("sum = " + sum);
//
//        }

        String word="Just because the water is red doesn't mean you can't drink it.";
        System.out.println(word.length());
        int total=0;
        int count=0;


        while (total<word.length()) {
            if (word.charAt(total)=='a') {
                count++;
            }
           total++;

        }
        System.out.println(count);

    }
}
