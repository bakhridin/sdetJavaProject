package day_41;

public class JavaStaticAttributes {
    public static void main(String[] args) {
        Employee.empID=10;
        Employee emp=new Employee();
        emp.empID=20;

        emp.name="John Wick";
        System.out.println(emp);

        Employee emp1=new Employee();
        emp1.number=200;
        emp1.empID=300;

        Employee emp2=new Employee();


    }

}

class Employee{
   public String name;
   public static int empID;
   public int number;

    public Employee() {
        this.number++;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empID=" + empID +
                ", number=" + number +
                '}';
    }
}
