package week11.lecture;

import java.util.Scanner;
import java.util.InputMismatchException; // นำเข้าคลาสสำหรับดักจับ Error เวลาคนใส่ข้อมูลผิดประเภท

public class DivisionLab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- เริ่มต้นพื้นที่เสี่ยง (try block) ---
        // เราใส่โค้ดที่ "อาจจะพัง" ไว้ในนี้
        try {
            System.out.print("Dividend: ");
            // [ความเสี่ยง 1] ถ้าคนพิมพ์ตัวหนังสือ (เช่น "abc") โปรแกรมจะพังตรงนี้
            // (InputMismatch)
            int num1 = sc.nextInt();

            System.out.print("Divisor: ");
            // [ความเสี่ยง 2] ถ้าคนพิมพ์ตัวหนังสือ ก็จะพังตรงนี้เช่นกัน
            int num2 = sc.nextInt();

            // [ความเสี่ยง 3] ถ้า num2 เป็น 0 จะพังตรงนี้ (ArithmeticException)
            System.out.println("Result: " + (num1 / num2));

        }
        // --- พื้นที่ดักจับปัญหา (catch blocks) ---
        // ถ้าเกิด Error ใน try มันจะกระโดดมาหา catch ที่ตรงกับประเภท Error นั้นๆ

        catch (ArithmeticException e) {
            // ทำงานเมื่อ: ตัวหารเป็น 0
            System.out.println("Error: Cannot divide by zero!"); //

        } catch (InputMismatchException e) {
            // ทำงานเมื่อ: ใส่ค่าผิดประเภท (ใส่ String แทน int)
            System.out.println("Error: Please enter numbers only!"); //

        } catch (Exception e) {
            // ทำงานเมื่อ: เจอ Error อื่นๆ ที่เราไม่ได้ดักไว้ข้างบน (ตัวกวาดขยะ)
            System.out.println("Error: " + e.getMessage()); //

        }
        // --- พื้นที่ทำเสมอ (finally block) ---
        finally {
            // ส่วนนี้จะ "ทำงานเสมอ" ไม่ว่าจะเกิด Error หรือไม่ก็ตาม
            // มักใช้สำหรับคืนค่า Resource เช่น ปิดไฟล์ หรือปิด Scanner
            sc.close();
            System.out.println("Program ended"); //
        }
    }
}