package Arrays;

import java.util.Scanner;

public class W15_02_SumNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double a [] = new double[5];    

        for (int i=0; i<a.length ; i++ ){
        System.out.println("Enter Number " + (i+1) + ": ");
        a [i] = kb.nextInt();

        double sumAll = 0;
        double sumodd = 0;
        double sumEven = 0;
        double average = 0;
            // show all numbers 
            System.out.println("Show all numbers : ");
            for(i=0 ;i<a.length ; i++ ){
                System.out.println("index ["+ 1 +"] value =" + a[i]);
                sumAll += a[i];
                if(a[i] % 2 != 0){
                    sumodd += a[i];
                } else {
                    sumEven += a[i];
                }

                if(a[i]>max){
                    max = a[i];
                
                }
                if(a[i] < min){
                    min = a[i];
                }

            }
            
            System.out.println("Sum of all numbers = " + sumAll);
            System.out.println("Sum of odd numbers = "+ sumodd);
            System.out.println("Sum of odd numbers = "+ sumEven);

            average = sumAll / a.length;
            System.out.println("Sum of odd numbers = "+ average);
            kb.close();
        }
    }
}
