import java.util.Scanner;

public class W09_01_calculateGrade {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter score");
        
        byte score =kb.nextByte();
    if(score >= 0 && score <= 100){
        //เปรียบเทียบคะแนนและแสดงเกรด
        if (score >= 80) {
            System.out.println("A");
        } else if (score >= 70) {
            System.out.println("B");
        } else if (score >= 60) {
            System.out.println("C");
        } else if (score >= 50) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        
    } else{
            System.out.println("คะแนนไม่อยุ่ในช่วง 0-100");
        }
    }
}
