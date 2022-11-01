package day_41;

public class JavaFinalNonAccessModifier {
   public final long ssn;


    public JavaFinalNonAccessModifier(long ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "JavaFinalNonAccessModifier{" +
                "ssn=" + ssn +
                '}';
    }
}
class Test{
    public static void main(String[] args) {
        JavaFinalNonAccessModifier jfm=new JavaFinalNonAccessModifier(2323344455l);
        System.out.println(jfm);
    }

}
