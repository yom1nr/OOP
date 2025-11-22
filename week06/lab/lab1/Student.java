package week06.lab.lab1;

public class Student {
    private String name;
    private int age;
    private int subject1, subject2, subject3;

    public Student(String names, int ages, int subject1, int subject2, int subject3) {
        this.name = names;
        this.age = ages;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    public double calculateGPA() {
        return (subject1 + subject2 + subject3) / 3.0;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject 1 Score: " + subject1);
        System.out.println("Subject 2 Score: " + subject2);
        System.out.println("Subject 3 Score: " + subject3);
        System.out.println("GPA: " + calculateGPA());
    }
}