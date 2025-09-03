import java.util.Scanner;
public class E_Kwh {
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        System.out.println("Customer Name");
        String name = kb.nextLine();
        System.out.println("Units Cosumed(kwn)");
        int kwh = kb.nextInt();
        System.out.println("Rate per Unit(baht)");
        int baht = kb.nextInt();     
        
        int UnitsConsumed = (kwh*baht); 
        double vat = UnitsConsumed * 7.5;
        System.out.println("UnitsConsumed + 7.5% " );
        



    }
}
