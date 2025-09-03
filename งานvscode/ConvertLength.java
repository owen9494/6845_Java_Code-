import java.util.Scanner;
public class ConvertLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // รับค่าความยาวเป็นเซนติเมตรจากผู้ใช้
        System.out.print("Enter length (in centimeters): ");
        int cm = scanner.nextInt();

        // แปลงเป็นเมตรและเซนติเมตร
        int meters = cm / 100;
        int remainingCm = cm % 100;

        // แสดงผลลัพธ์
        System.out.println(cm + " centimeters is equal to " + meters + " meters and " + remainingCm + " centimeters.");
    }
}
