package loop;
public class W10_02_while_Even10 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 2; 
        while(count <= 20) {
        sum = sum + count;
        System.out.println();   
        if (count<20){
            System.out.print(count+" + ");
        }else{
            System.out.print(count+"=" +sum);
        }
        count = count+2;
        }
    }
}
