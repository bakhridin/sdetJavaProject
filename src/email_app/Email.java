package email_app;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity=500;
    private int defaultPasswordLength=10;
    private String alternateEmail;
    private String companySuffix="aeycompany.com";

    /**
     * Steps:
     * 1.Constructor to receive the first name and last name;
     * 2.Ask for the department
     * 3.Generate a random password
     * 4.Set the mailbox capacity;
     * 5.Ste the alternate email;
     * 6.Change the password;
     */

    //1.Constructor to receive the first name and last name;
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: "+this.firstName+" "+this.lastName);

        this.department=setDepartment();
        System.out.println("Department: "+this.department);

        this.password=randomPassword(defaultPasswordLength);
        System.out.println("Your password is: "+this.password);

        //Combine elements to generate email
        email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
        System.out.println("Your email is: "+email);
    }
     // Call a method asking for the department -return the department

    private String setDepartment() {
        System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner in =new Scanner(System.in);
        int depChoice = in.nextInt();

        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "dev";
        } else if (depChoice == 3) {
            return "acct";
        }else {
            return "";
        }

    }

    //3.Generate a random password
    //Call a method that returns a random password

    private String randomPassword(int length) {
        String passwordSet="ABCDEFGHKLMNOPQRSTUWXYZ0123456789!@#$%";
        char[] password=new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i]=passwordSet.charAt(rand);

        }
        return  new String(password);

    }

    //4.Set the mailbox capacity;
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity=capacity;

    }
    //5.Ste the alternate email;

    public void setAlternateEmail(String altEmail) {
        this.alternateEmail=altEmail;
    }

    //6.Change the password;
    public void changePassword(String password) {
        this.password=password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return "DISPLAY NAME: "+firstName+" "+lastName+
                " \nCOMPANY EMAIL: "+email+
                " \nMAILBOX CAPACITY: "+mailboxCapacity+" mb";
    }
}
