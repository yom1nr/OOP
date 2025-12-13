package week10.lab.lab1;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person("John Smith", new Phone("1234567890", "pass123"));
        persons[1] = new Person("Jane Doe", new Phone("0987654321", "secure456"));
        persons[2] = new Person("Alcie Wonderland", new Phone("1122334455", "key789"));

        Scanner sc = new Scanner(System.in);

        for (Person p : persons) {
            p.verifyUser(sc);
            System.out.println();
        }
        sc.close();
    }
}
