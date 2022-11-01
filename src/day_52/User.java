package day_52;

public class User {
    private static int id;
    private String userName;
    private String password;

    private String birthday;
    private int age;

    public User(String userName, String password, String birthday) {
        this.userName = userName;
        this.password = password;
        this.birthday = birthday;
    }

    public  int getId() {
        return id;
    }

    public  void setId(int id) {
        User.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
