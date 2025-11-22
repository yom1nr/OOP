package week05.lecture;

public class Ex1 {
    public static String getDay(int n) {
        switch (n) {
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
            default:
                return "Invalid.";
        }
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.print("Enter a number (1-7) : ");
            int n = sc.nextInt();
            System.out.println("The day corresponding to " + n + " is: " + getDay(n));
        }
        sc.close();
    }
}
