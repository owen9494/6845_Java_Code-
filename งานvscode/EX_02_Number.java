import java.util.Scanner;

public class EX_02_Number {
    public static void main(String[] args) {
        
    while(true){
        Scanner kb =new Scanner (System.in);
        System.out.print("Enter Start Number ");
        int Start = kb.nextInt();
        System.out.print("Enter End Number");
        int End = kb.nextInt();
        
        if (Start >= End) {
            System.out.println("---------------warning--------------------------------------");
                System.out.println("Start number must be less than end number Please enter again");
                System.out.println("------------------------------------------------------------");
            
        } else{
                break;
        }
        }
            System.out.println("----------------------Result----------------------");
    }
}

