import java.util.Scanner;

public class W11_02_While_True_ChopseMenu {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // แสดงข้อความรับตัวเลข 2 ตัว
        System.out.print("Enter Number 1: ");
        int num1 = kb.nextInt();

        System.out.print("Enter Number 2: ");
        int num2 = kb.nextInt();

        // แสดงเมนูเพื่อรับ choice
        System.out.println("===============================================");
        System.out.println("Menu: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Exit");
        System.out.println("===============================================");

        
        while (true) {
            System.out.print("Enter your choice: ");
            int choice = kb.nextInt();
            System.out.println("------------------------------------------");

            if (choice == 1) {
                int result = num1 + num2;
                System.out.println("Addition Result: " + result);
                break;
            } else if (choice == 2) {
                int result = num1 - num2;
                System.out.println("Subtraction Result: " + result);
                break;
            } else if (choice == 3) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
