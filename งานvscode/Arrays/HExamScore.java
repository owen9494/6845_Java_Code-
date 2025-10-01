
import java.util.Scanner;

public class HExamScore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับจำนวนนักเรียน
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();

        System.out.println("================================");

        // ตัวแปรนับจำนวนผ่าน/ไม่ผ่าน
        int passCount = 0;
        int failCount = 0;

        // loop ตรวจสอบคะแนน
        for (int i = 1; i <= numStudents; i++) {
            System.out.print("Enter score for student " + i + ": ");
            int score = scanner.nextInt();

            if (score >= 50) {
                System.out.println("Student " + i + " : Passed");
                passCount++;
            } else {
                System.out.println("Student " + i + " : Failed");
                failCount++;
            }

            System.out.println("================================");
        }

        // แสดงผลสรุป
        System.out.println("Number of students passed = " + passCount + " persons");
        System.out.println("Number of students failed = " + failCount + " persons");

        scanner.close();
    }
}


// ขั้นตอนการเขียนโปรแกรม (เติมคำ)
// 1.	เริ่มโปรแกรม
// 2.	รับค่า จำนวนนักเรียน จากคีย์บอร์ด
// 3.	สร้างตัวแปร passCount และ failCount
// 4.	แสดงเส้นคั่น (เพื่อความสวยงาม)
// 5.	ใช้ loop สำหรับตรวจสอบคะแนนของนักเรียนแต่ละคน
// o	รับค่า คะแนน จากคีย์บอร์ด
// o	ใช้ if-else ตรวจสอบว่า
// 1.	ถ้า คะแนน ≥ 50 และเพิ่มค่า passCount
// 2.	มิฉะนั้น แสดงว่าไม่ผ่าน และเพิ่มค่า failCount
// 6.	หลัง loop จบ แสดงผลจำนวนนักเรียนที่ผ่านทั้งหมด และที่ไม่ผ่าน
// 7.	จบโปรแกรม






for (int i = Start; i <= End; i++) {
                if( i % 2 == 0){
                    System.out.println("Amount of Even Number =");
                } else{
                    System.out.println("Amount of Odd Number =");