import java.util.Scanner;

public class W07_02_square_root {
    public static void main(String[] args) {
    Scanner kb =new Scanner (System.in);
        System.out.println("pls enter number to find its sqare root");
        double x = kb.nextInt();
        if(x >=0) {
            System.out.println("square root of"+ x + "is" + (Math.sqrt(x)));
            System.out.println(Math.sqrt(x));
        }
    }
}
