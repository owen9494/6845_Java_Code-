
import javax.swing.text.JTextComponent;

public class W04_02_Variable {
    public static void main(String[] args) {
        //ประกาศตัวแปรและชินดข้อมูล
        byte a;
        byte b;
        
        //ประกาศตัวแปร a แล้ว b เป็นชนิดข้อมูล byte
       
        //เราสามารถรวมตัวแปรที่ประกาศไว้แล้วอยู่ในบรรทเดียวกันได้
        byte aa, bb; // ประกาศตัวแปร a แล้ว b เป็นชนิดข้อมูล byte
        byte aaa= 0; bbb=0;//ประกาศตัวแปร a แล้ว b เป็นตัวแปรชนิด byte และกำหนดค่าเรื่มต้นเป็น 0
        
        
        //กำหนอดค่าให้กับตัสแปร
        a = 10; //กำค่าให้ตัวแปร 10 ให้กับตัวแปรa
        b = 20; //กำค่าให้ตัวแปร 20 ให้กับตัวแปรa
        //ประกาศตัวแปรและชินดข้อมูล พร้อมกับกำหนดค่า
        short c = 30; //กำหนดค่า 30 ให้กับตัวแปร c

        int ch = '\u0044'; // กำหนดค่า 68 (ASCII ของ 'D')
        System.out.println("ch");
        
        String ch1 = "\u0044";
        System.out.println("ch1");
        
        char ch2 = '\u0044';
        System.out.println("ch2");

        int var1 = 014;
        System.out.println("var1");
        
        float var2 = 014f;
        System.out.println("var2");
        
        
        double var4 = 0E-0;
        System.out.println("var4");
        
        String var9 = null;
        System.out.println("var9");

        boolean var10 = true;
        System.out.println("var10");
        
        boolean var11 = 2>3;
        System.out.println("var11");

        String var13 = kb.nextLine();
        System.out.println("var13");




    }

     
}
