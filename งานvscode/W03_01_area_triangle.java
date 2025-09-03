import java.util.Scanner;

public class W03_01_Area_Triangle {

    public static void main(String[] args) {
        //input base and height of triangle
        scanner kb = new Scanner(System.in);//สร้างอ็อมเจกต์ Scanner เพื่อข้อมูลจากผู้ใช้

        System.out.println("Enter base = "); //แสดงขอความให้ผู้ใช่ป้อนฐานของรูปสามเหลี่ยม
        int base = kb.nexti();     //รับค่าฐานจากผู้ใช้ผ่านคีย์บอร์ดเป็นจำนวนเต็ม
        System.out.println("Enter height = ");
        int height = kb.nexti();        
        // Calculate area of triangle 
        double area = 0.5* base* height; //หรือใส๋ข้อมูลเป็น Float ก็ได้ 
        System.out.println("Area of Triangle = " + area);
    }
}