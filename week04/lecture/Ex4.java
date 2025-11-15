package week04.lecture;
import java.util.Arrays;

public class Ex4 {
    public static void main(String[] args) {
        
        int[] numbers = {12, 17, 14, 15, 16, 89, 23, 1, 9, 100};
        
        // System.out.println("Before sort: " + Arrays.toString(numbers));
        
        Arrays.sort(numbers);
        
        // System.out.println("After sort: " + Arrays.toString(numbers));
        
        int secondLargest = numbers[numbers.length - 2];
        System.out.println("The Second largest number is: " + secondLargest);
    }
}