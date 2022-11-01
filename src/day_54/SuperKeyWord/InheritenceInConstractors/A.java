package day_54.SuperKeyWord.InheritenceInConstractors;

public class A {

    public A() {
        System.out.println("A");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("B");
    }
}

class C extends B {

    public C() {
        super();
        System.out.println("C");
    }
}
class App{
    public static void main(String[] args) {
        A a=new A();
    }

}
