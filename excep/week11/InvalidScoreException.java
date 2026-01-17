// ไฟล์ InvalidScoreException.java
package excep.week11;

// สร้าง Exception เองต้องสืบทอดจาก Exception
public class InvalidScoreException extends Exception {
    public InvalidScoreException(String message) {
        super(message); // ส่งข้อความไปให้คลาสแม่จัดการ
    }
}