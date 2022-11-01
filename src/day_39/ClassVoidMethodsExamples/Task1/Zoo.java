package day_39.ClassVoidMethodsExamples.Task1;

public class Zoo {
    public static void main(String[] args) {
        Animal camel=new Animal();
        camel.setValues("CAMEL",20);
        camel.setShortName();
        camel.setKmHSpeed();
        Animal horse=new Animal();
        horse.setValues("HORSE",40);
        horse.setShortName();
        horse.setKmHSpeed();

        System.out.println(camel);
        System.out.println(horse);


    }
}
