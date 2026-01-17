// ไฟล์ StudentProcessor.java
package excep.week11;

public class StudentProcessor {

    // เมธอดนี้มีความเสี่ยง จึงประกาศ 'throws' ไว้ท้ายชื่อ
    public void processStudent(String rawData)
            throws InvalidScoreException, NumberFormatException, ArrayIndexOutOfBoundsException {

        // --- [Week 10] String Handling ---

        // 1. ตัดช่องว่างหน้าหลังทิ้งก่อน (trim)
        rawData = rawData.trim();

        // 2. แยกข้อความด้วยเครื่องหมายจุลภาค (split)
        String[] parts = rawData.split(",");

        // 3. ตรวจสอบความยาว Array (ป้องกัน ArrayIndexOutOfBounds)
        if (parts.length < 3) {
            throw new ArrayIndexOutOfBoundsException("ข้อมูลไม่ครบ 3 ส่วน (Name, ID, Score)");
        }

        String name = parts[0].trim();
        String id = parts[1].trim();
        String scoreStr = parts[2].trim();

        // 4. เปรียบเทียบ String (ห้ามใช้ ==)
        if (name.equalsIgnoreCase("Admin")) {
            System.out.println("Skipping admin account...");
            return;
        }

        // --- [Week 11] Exception Triggering ---

        // 5. แปลง String เป็น int (จุดเสี่ยง NumberFormatException)
        int score = Integer.parseInt(scoreStr);

        // 6. เช็ค Logic และโยน Custom Exception (throw)
        if (score < 0 || score > 100) {
            throw new InvalidScoreException("คะแนนต้องอยู่ระหว่าง 0-100 (ได้รับ: " + score + ")");
        }

        System.out.println("✅ Validated: " + name + " (" + id + ") Score: " + score);
    }
}