package week06.lecture.ex2;

public class App {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Paul");
        Student s3 = new Student("Preston", 25);
        s1.displayAllDetails();
        s2.displayAllDetails();
        s3.displayAllDetails();
    }
}
