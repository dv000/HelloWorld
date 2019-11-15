package emailApp;

import java.util.Scanner;

public class Email {
    private String firstName, lastName, department, company, password, alternateEmail;
    private int mailboxCapacity=500;
    private int defaultPasswordLength=8;
    private String email;
    private String companySuffix= "aeycompany.com";

    Scanner s = new Scanner(System.in);


    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department=setDepartment();
        this.password=randomPassword(defaultPasswordLength);

        email= firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
        System.out.println("Your email is "+email);
        System.out.println("Your password is: "+this.password);
    }

    private String setDepartment(){

        System.out.println("Enter the department:");
        System.out.println("1. Sales");
        System.out.println("2.Development");
        System.out.println("3.Accounting");
        System.out.println("4.None");

        Scanner in= new Scanner(System.in);
        int depChoice=in.nextInt();

       switch(depChoice){
           case 1: return "Sales";
           case 2: return "Development";
           case 3: return "Accounting";
           case 4: return "None";
           default: return "wrong input";
       }

    }

private String randomPassword(int length){

        String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password=new char[length];
    for (int i = 0; i <length ; i++) {
        int rand=(int)(Math.random()*passwordSet.length());
        password[i]=passwordSet.charAt(rand);
    }
    return new String(password);

}

public void setMailboxCapacity(int capacity){
    this.mailboxCapacity=capacity;

    }

public void setalternateEmail(String altEmail){
    this.alternateEmail= altEmail;

}

public void changePassword(String password){
        this.password=password;
}

}