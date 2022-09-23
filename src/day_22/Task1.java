package day_22;

public class Task1 {
    public static void main(String[] args) {

        int[]newArr={1,2,3,4,5};

        Task1 ts=new Task1();
        ts.intArr(newArr);

    }

    void intArr(int[] arr) {
        for (int i : arr) {
            System.out.println(i);

        }

    }
}
