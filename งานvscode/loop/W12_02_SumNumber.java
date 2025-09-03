package  Loop;

import java.util.Scanner;

public class W12_02_SumNumber {
public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
    int start, stop;
        do{
                System.out.println("start number must be less than stop number.");
                System.out.println("Enter a Start number");
                start = kb.nextInt();
                System.out.println("Enter a Stop number");
                stop = kb.nextInt();
            
        
        int sum = 0;
        int i =1;
        if(start<stop){
        for (int count = start; count <=stop; count += 2) {
            System.out.println("รอบที่" +sum+ "+" + count + "=" + (sum + count));
            sum = sum+count;
            i++;
            }
            }else{
                System.out.println("start number must be less than stop number.");
            }
        }
    while(start >= stop);
    }
}