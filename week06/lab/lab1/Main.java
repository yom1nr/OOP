package week06.lab.lab1;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", 20, 85, 90, 88);
        Student student2 = new Student("Jane", 22, 92, 87, 94);

        System.out.println("Student 1 Details:");
        student1.displayDetails();

        System.out.println("\nStudent 2 Details:");
        student2.displayDetails();
    }
}
