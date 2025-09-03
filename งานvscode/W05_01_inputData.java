import java.util.Scanner;
public class W05_01_inputData {
 
    public static void main(String[] args) {
        Scanner kb =new Scanner (System.in);
        System.out.println("Enter a");
        int a = kb.nextInt();

        System.out.println("Enter b");
        int b = kb.nextInt();

        System.err.println("Befor : Output of Valie A = " + a);
        System.err.println("Befor : Output of Valie B = " + b);
        
        // swap baluse
        int temp = a;
        a = b;
        b = temp;
        
        System.err.println("After : Output of Valie A = " + a);
        System.err.println("After : Output of Valie B = " + b);
        int x = 6;
        System.out.println(x-- + ++x - --x - x-- + x++ + x);
        
        int a = 21, b = 0;
        System.out.println("a" + (a - b));

        double x = 1.0, y = 1.000;
        System.out.println(x > y);

        double x = 1.6; a + = 5.1;
        System.out.println(a % 4);

        int x = 6;
        System.out.println(x-- + ++x - --x - x-- + x++ + x);

       
   
   
   
   
    }
 
}
