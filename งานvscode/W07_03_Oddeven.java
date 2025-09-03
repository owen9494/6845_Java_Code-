import java.util.Scanner;

public class W07_03_Oddeven {
    public static void main(String[] args) {
        Scanner kb =new Scanner (System.in);
        System.out.println("number is:");
        int n =kb.nextInt();
        int sum = n %2;
        if (sum ==0 )   {
            System.out.println("odd is"+n);
        }
        else   {
            System.out.println("Even is:"+ n);
        }
        kb.close();
    }    
}
