package Arrays;

public class W13_02_baslArrays {
    public static void main(String[] args) {
        
        String animals [] = {"Dog", "cat", "Lion"}; 
        int dice [] = {1,2,3,4,5,6,};
        float avgScore [] ={3.50f, 4.00f, 27.5f};
        String colors [] = new String[4];
        
        System.out.println("Size of colors array : " + colors.length);

        System.out.println("Color at index 0 : " + animals[0]);
        System.out.println("Color at index 2 : " + animals[2]);
        
        
        System.out.println("Show all avarage scoes : ");
        for(int i=0;i<avgScore.length ; i++){
            System.out.println(avgScore[i]);
        }
        //================================================================================================================

        colors[2] = "Red";
        colors[0] = "Green";
        colors[3] = "Blue";
        System.out.println("Size of colors array : " + colors.length);
        // int j=1;
        for(int i=0;i<avgScore.length ; i++){
            System.out.println("Block"+ (i+1) +" : " + colors[i]);
            //System.out.println("Block"+ j +" : " + colors[i]);
        }

        System.out.println("Color at index 0 : " + colors[0]);
        System.out.println("Color at index 0 : " + colors[1]);

        int scores[] = new int[5];
        scores[0] = 50;

        System.out.println("Score at at index 4: "+ scores[4]);
    }
}
