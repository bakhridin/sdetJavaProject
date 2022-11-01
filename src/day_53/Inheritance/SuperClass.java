package day_53.Inheritance;

public class SuperClass {
    String name;

    @Override
    public String toString() {
        return "\n" + getClass().getSimpleName()+
                "{ name='" + name + '\'' +
                '}';
    }
}
