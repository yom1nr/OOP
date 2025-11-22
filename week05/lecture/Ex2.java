package week05.lecture;

public class Ex2 {
    public int getAbsValue(int n) {
        return (n < 0) ? -n : n;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num = scanner.nextInt();
        Ex2 ex = new Ex2();
        int abs = ex.getAbsValue(num);
        System.out.println("The absolute value of " + num + " is: " + abs);
        scanner.close();
    }
}
