// ไฟล์ MainClass.java
package excep.week11;

public class MainClass {
    public static void main(String[] args) {
        StudentProcessor processor = new StudentProcessor();

        // จำลองข้อมูลดิบ 4 เคส
        String[] inputs = {
                " Somchai , B64001 , 85 ", // Case 1: ปกติ (มี space ก็รอดเพราะ trim)
                " Somsak , B64002 ", // Case 2: ข้อมูลไม่ครบ
                " Somying , B64003 , XX ", // Case 3: คะแนนไม่ใช่ตัวเลข
                " Sompong , B64004 , 150 " // Case 4: คะแนนเกิน 100
        };

        System.out.println("=== Start Processing ===");

        for (String input : inputs) {
            try {
                // เรียกใช้เมธอดเสี่ยง
                processor.processStudent(input);

            } catch (ArrayIndexOutOfBoundsException e) {
                // จับ Error ข้อมูลไม่ครบ
                System.out.println("❌ Format Error: " + e.getMessage());

            } catch (NumberFormatException e) {
                // จับ Error แปลงตัวเลขไม่ได้
                System.out.println("❌ Number Error: คะแนนต้องเป็นตัวเลขเท่านั้น");

            } catch (InvalidScoreException e) {
                // จับ Error คะแนนเกินช่วง (ที่เราสร้างเอง)
                System.out.println("❌ Logic Error: " + e.getMessage());

            } catch (Exception e) {
                // จับ Error อื่นๆ ที่หลุดรอดมา
                System.out.println("❌ Unknown Error: " + e.toString());

            } finally {
                // ทำเสมอ (เอาไว้ขีดเส้นคั่นสวยๆ)
                System.out.println("-------------------------");
            }
        }
    }
}