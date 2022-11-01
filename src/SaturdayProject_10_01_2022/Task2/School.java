package SaturdayProject_10_01_2022.Task2;

public class School {
    public static void main(String[] args) {
        Lesson lesson1 = new Lesson("Math", 5, 60);
        Lesson lesson2 = new Lesson("History", 10, 70);
        Lesson lesson3 = new Lesson("PE", 15, 80);
        Lesson lesson4 = new Lesson("ENG", -5, 60);
        Lesson lesson5 = new Lesson("Chemistry", 5, 60);

        Student student1 = new Student("Ali Ahmad", 101010);
        Student student2 = new Student("Vali Ahmad", 202020);

        System.out.println(student1);
        student1.takeLesson(lesson1);
        student1.takeLesson(lesson2);

        System.out.println("=========================");

        System.out.println(student2);
        student2.takeLesson(lesson3);
        student2.takeLesson(lesson4);
        student2.takeLesson(lesson5);

    }
}
