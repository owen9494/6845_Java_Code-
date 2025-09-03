package  Loop;

import java.util.Scanner;

public class W12_01_For_SumOdd {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a Start number");
        int start = kb.nextInt();
        System.out.println("Enter a Stop number");
        int stop = kb.nextInt();
            while(start >=stop){
                System.out.println("start number must be less than stop number.");
                System.out.println("Enter a Start number");
                start = kb.nextInt();
                System.out.println("Enter a Stop number");
                stop = kb.nextInt();
            }

            if(start<stop){
        int sum = 0;
        int i =1;
        for (int count = start; count <=stop; count += 2) {
            System.out.println("รอบที่" +sum+ "+" + count + "=" + (sum + count));
            sum = sum+count;
            }
            }else{
                System.out.println("start number must be less than stop number.");
            
        }
    }
}





    

