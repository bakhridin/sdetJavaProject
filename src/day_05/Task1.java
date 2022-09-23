package day_05;

public class Task1 {
    public static void main(String[] args) {
        //
//        int i = 10;
//        System.out.println("i = " + ++i); // very same as i = i + 1; value is changed whenever the pre-increment called.
//        ++i;
//        ++i;
//        ++i;
//        System.out.println("++i = " + ++i);
//
//        int i2 = 10;
//        System.out.println("i2 = " + --i2); // very same as i = i - 1; value is changed whenever the pre-decrement called
//        --i2;
//        --i2;
//        --i2;
//        System.out.println("i2 = " + --i2);

        // Question 3
        // using remainder print the last number. 1879

        //Question4
        // You have a number which 187469; Using arithmetical operators, calculate total of 1 + 8 + 7 + 9.
        // don`t do hard coding. sout (1 + 8 + 7 + 9)
//
//        int total = 0;
//        int divider = 10;
//        int number = 1879;
//        // ====> step1
//
//        System.out.println("number = " + number);
//        int remainder = number%divider; // remainder here is 9
//        System.out.println("remainder = " + remainder);
//        total += remainder; // total =  total + remainder
//        System.out.println("total = " + total);
//        // ====> step2
//        number /= divider; // when 1879/10 = 187.9 since data type of number is int, decimals are not used. only whole number. 187
//        System.out.println("number = " + number);
//        remainder = number%divider; // remainder here is 7
//        System.out.println("remainder = " + remainder);
//        total += remainder; // total = total + remainder.... 9 = 9 + 7 = 16
//        System.out.println("total = " + total);
//        // ====> step3
//        number /= divider; // 187 / 10 = 18.7 ===> downcasted to int, it is 18
//        System.out.println("number = " + number);
//        remainder = number%divider; // 18%10 = 8
//        System.out.println("remainder = " + remainder);
//        total += remainder; // total = total + remainder = 16 + 8 = 24
//        System.out.println("total = " + total);
//        // ====> step4
//        number /= divider; // 18 / 10 = 1.8 ===>>> (int) ===> 1
//        System.out.println("number = " + number);
//        remainder = number%divider; // 1%10 = 1
//        System.out.println("remainder = " + remainder);
//        total += remainder; // total = total + remainder = 24 + 1 == 25
//        System.out.println("total = " + total);

        // Task for homework.
        // calculate total of number 563. (dont use hardcoding) answer should be 14;
//        System.out.println("=====1-st way=====");
//        int number1 = 563;
//        int divider1 = 10;
//        int totalOfReminders = 0;
//
//        //Step1
//        //number1/=divider1;
//        System.out.println("number1 = " + number1);
//        int reminder1 = number1 % divider1;
//        System.out.println("reminder1 = " + reminder1);
//        totalOfReminders = number1 % divider1;
//        System.out.println("totalOfReminders = " + totalOfReminders);
//        //Step2
//        number1 /= divider1;
//        System.out.println("number1 = " + number1);
//        reminder1 = number1 % divider1;
//        System.out.println("reminder1 = " + reminder1);
//        totalOfReminders += reminder1;
//        System.out.println("totalOfReminders = " + totalOfReminders);
//        //Step3
//        number1 /= divider1;
//        System.out.println("number1 = " + number1);
//        reminder1 = number1 % divider1;
//        System.out.println("reminder1 = " + reminder1);
//        totalOfReminders += reminder1;
//        System.out.println("totalOfReminders = " + totalOfReminders);

        //Question4
        // You have a number which 187469; Using arithmetical operators, calculate total of 1 + 8 + 7 + 9.
        // don`t do hard coding. sout (5+6+3)

//        System.out.println("======2-nd way======");
//        int numb = 563, diVider = 10, remind = 0;
//        //Step1
//        System.out.println("numb = " + numb);
//        remind += numb % diVider;
//        System.out.println("remind = " + remind);
//        //Step2
//        numb /= diVider;
//        System.out.println("numb = " + numb);
//        remind += numb % diVider;
//        System.out.println("remind = " + remind);
//        //Step3
//        numb /= diVider;
//        System.out.println("numb = " + numb);
//        remind += numb % diVider;
//        System.out.println("remind = " + remind);

        sumOfTotalReminders(563,10,0);
        System.out.println("=================================");
        System.out.println(sumOfTotalReminders1(563, 10, 0));

    }

    public static void sumOfTotalReminders(int numbers, int dividers, int sumOfRemainders) {
        //Step1
        System.out.println("numbers = " + numbers);
        sumOfRemainders += numbers % dividers;
        System.out.println("sumOfReminders = " + sumOfRemainders);

        //Step2
        numbers/=dividers;
        System.out.println("numbers = " + numbers);
        sumOfRemainders += numbers % dividers;
        System.out.println("sumOfReminders = " + sumOfRemainders);

        //Step3
        numbers/=dividers;
        System.out.println("numbers = " + numbers);
        sumOfRemainders += numbers % dividers;
        System.out.println("sumOfReminders = " + sumOfRemainders);

    }

    public static int sumOfTotalReminders1(int numbers, int dividers, int sumOfRemainders) {
        //Step1
      //  System.out.println("numbers = " + numbers);
        sumOfRemainders += numbers % dividers;
      //  System.out.println("sumOfReminders = " + sumOfRemainders);

        //Step2
        numbers/=dividers;
      //  System.out.println("numbers = " + numbers);
        sumOfRemainders += numbers % dividers;
      //  System.out.println("sumOfReminders = " + sumOfRemainders);

        //Step3
        numbers/=dividers;
       // System.out.println("numbers = " + numbers);
        sumOfRemainders += numbers % dividers;
       // System.out.println("sumOfReminders = " + sumOfRemainders);

        return sumOfRemainders;
    }
}
