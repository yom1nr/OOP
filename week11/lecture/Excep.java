package week11.lecture;

public class Excep {

    public static void main(String[] args) {

        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("No");
        } finally {
            System.out.println("Finish");
        }

    }
}
