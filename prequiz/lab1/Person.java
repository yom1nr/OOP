package prequiz.lab1;
import java.util.Scanner;

class Person {
    private String fullName;
    private Phone phone;

    public Person(String fullName, Phone phone) {
        this.fullName = fullName;
        this.phone = phone;
    }

    public void verifyUser(Scanner sc) {
        System.out.print("Enter the password of \"" + phone.getPhoneNumber() + "\": ");

        String inputPassword = sc.nextLine();

        if (inputPassword.equals(phone.getPassword())) {
            System.out.println("Full Name: " + fullName);
            System.out.println("Phone: " + phone.getMaskedPhoneNumber());
        } else {
            System.out.println("You don’t have permission to access the phone data!\n");
        }
    }
}