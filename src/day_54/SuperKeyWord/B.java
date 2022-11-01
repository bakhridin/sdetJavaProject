package day_54.SuperKeyWord;

public class B extends A{

  //  String name="SubClass";

   public void print() {
       System.out.println("Print method in Sub Class");

    }

    public B() {
       super.print();
       this.print();
        super.name = "Change in Super Class";
        this.name = "Change in Sub Class";
    }
}
