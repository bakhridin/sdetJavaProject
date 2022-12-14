package day_31;

import java.util.Arrays;
import java.util.HashSet;

public class HomeWork {
    /*

    Create a Set of Strings, named as classes.
    Chemistry, Physics, Math
    Add random names to the classes.

    Task1. How many students we have in total.
    Task2. How many students are taking only Math
    Task3. How many students are taking both Chemistry and Physics
    Task4. How many students are taking all three classes.

     */
    public static void main(String[] args) {

    HashSet<String> chemistry=new HashSet<>(Arrays.asList("David","Dana","Debora","Dilshod"));
        System.out.println("chemistry = " + chemistry);
    HashSet<String> physics=new HashSet<>(Arrays.asList("Debora","David","Caleb","Dilshod"));
        System.out.println("physics = " + physics);
    HashSet<String> math=new HashSet<>(Arrays.asList("Debora","Dilshod","David","Jabbar"));
        System.out.println("math = " + math);

        System.out.println("=============================");


      //  Task1. How many students we have in total.
        HashSet<String>totalNum= new HashSet<>();
        totalNum.addAll(chemistry);
        totalNum.addAll(physics);
        totalNum.addAll(math);
        System.out.println("How many students we have in total?\nTotal num of students are= "+totalNum.size());
        System.out.println();

//       Task2. How many students are taking only Math

        HashSet<String> mathClass =new HashSet<>();
        mathClass.addAll(chemistry);
        mathClass.addAll(physics);
        mathClass.addAll(math);
        mathClass.removeAll(chemistry);
        mathClass.removeAll(physics);
  System.out.println("How many students are taking only Math?\nTotal num of students in Math Class are= "+mathClass.size()+"\nAnd they are= "+mathClass);
        System.out.println();

       // Task3. How many students are taking both Chemistry and Physics
        chemistry.retainAll(physics);
        System.out.println("How many students are taking both Chemistry and Physics?\nTotal nums of students taking Chemistry and Physics are" +
                " "+chemistry.size()+"\nThey are "+chemistry);
        System.out.println();


        //    Task4. How many students are taking all three classes.

        chemistry.retainAll(math);
        System.out.println("How many students are taking all three classes?\nTotal number of students taking all three classes are = " + chemistry.size());
        System.out.println("Students who are taking all three = " + chemistry);

////////////////////////////////////////////////////////////////////////

//        //1.How many students we have in total.
//        int totalNum = getTotalNum(chemistry, physics, math);
//        System.out.println("totalNum of students are = " + totalNum);

    }

//    //1.How many students we have in total.
//    static int getTotalNum(HashSet<String> set1,HashSet<String> set2,HashSet<String> set3) {
//        int total=0;
//        set1.addAll(set2);
//        set3.addAll(set1);
//
////        for (int i = 0; i < set3.size(); i++) {
////            for (int j = 0; j < set3.size(); j++) {
////                total=set3.size();
////            }
////        }
//        return total=set3.size();
//    }


}
