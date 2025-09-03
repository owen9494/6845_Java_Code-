public class W07_04_aboutCircla {
    public static void main(String[] args) {
        // ต้องการให้ผู้ใช้เลือกว่าจำคำนวณอะไรเกี่ยวกับ : เส้นรอบวง หรือ พื้นที่
        // สิ่งที่ต้องรับเข้ามาเกี่ยวกับวงกลมคือรัศมี (radius)
        // เส้น รอบว่ง = 2* pi *r
        // = pi^2
        final double PI = 3.14;
        Scanner kb = new Scanner(System.in);
        System.out.println("radius:");
        double radius = kb .NextInt();

        System.out.println("เลือกการคำนวณเกี่ยวกับวงกลม");
        System.out.println("1.Area");
        System.out.println("2.circum");
        System.out.println("กรุณาเลือก (1 หรือ 2) : ");
        int choice = kb.nextInt();

        if (cont choice == 1) {
            // คำนวณพื้นที่
            double area = PI * radius * radius;
            System.out.println("พื้นที่ของวงกลมที่มีรัศมี " + radius + " คือ " + area);
        } else if (choice == 2) {
            // คำนวณเส้นรอบวง
            double circum = 2 * PI * radius;
            System.out.println("เส้นรอบวงของวงกลมที่มีรัศมี " + radius + " คือ " + circum);
        } else {
            System.out.println("กรุณาเลือกตัวเลือกที่ถูกต้อง (1 หรือ 2)");
            
        }

    }
}