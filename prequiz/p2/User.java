package prequiz.p2;

import java.util.Scanner;

public class User implements UserToolBox {
    private String firstName;
    private String middleName;
    private String lastName;
    private Email email;
    private String password;

    public User(String name, Email email, String password) {
        this.email = email;
        this.password = password;
        setName(name);
    }

    @Override
    public void setName(String name) {
        String[] parts = name.split(" ");

        if (parts.length >= 3) {
            this.firstName = parts[0];
            this.middleName = parts[1];
            this.lastName = parts[2];
        } else if (parts.length == 2) {
            this.firstName = parts[0];
            this.middleName = "-";
            this.lastName = parts[1];
        } else {
            this.firstName = parts[0];
        }
    }

    @Override
    public void getInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password to view user info: ");
        String inputPass = sc.next();

        if (inputPass.equals(this.password)) {
            System.out.println("\n=== User Profile ===");
            System.out.println("First Name: " + firstName);
            System.out.println("Middle Name: " + middleName);
            System.out.println("Last Name: " + lastName);

            email.getInfo();
        } else {
            System.out.println("Error: Incorrect password!");
        }
    }
}