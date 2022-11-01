package day_52.Task1;

public class SchoolManagement {
    public static void main(String[] args) {
        School scl=new School();
        scl.setName("Excelenter");
        scl.setPhoneNumber("323-323-323");
        scl.setEmail("st@gnail");
        scl.setAddress("North 12 Street");
        scl.setSchoolSize(2);

        scl.register(new Student("James","Coock"));
        scl.register(new Student("Jerry","Coock"));

        System.out.println(scl);

//        scl.register(new Student("Ali","Baba"));
//        System.out.println(scl);
        System.out.println(scl.getName());
        System.out.println(scl.getEmail());
        System.out.println(scl.getAddress());
        System.out.println(scl.getSchoolSize());
        System.out.println(scl.getListOfStudents());

    }


}
