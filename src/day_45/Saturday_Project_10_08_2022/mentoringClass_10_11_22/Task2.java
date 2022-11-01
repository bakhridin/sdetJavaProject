package day_45.Saturday_Project_10_08_2022.mentoringClass_10_11_22;

public class Task2 {


    static boolean getElements(int []arr1, int []arr2) {
        if (arr1[0]==arr2[0] || arr1[arr1.length-1]==arr2[arr2.length-1]) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        int[]arr1={1,2,3};
        int[]arr2={7,2,3};

        boolean elements = getElements(arr1, arr2);
        System.out.println(elements);

    }
}
