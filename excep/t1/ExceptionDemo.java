package excep.t1;

import java.util.*;

public class ExceptionDemo {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            if (num < 0) {
                throw new Exception("You input num more zero");
            }

            System.out.println(num);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
