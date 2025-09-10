package  Loop;

import java.util.Random;
import java.util.Scanner;
public class W13_01_GuessNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Random  rand = new Random();

        int answer = rand.nextInt(10) + 1; 

        int countGuess =0;
        boolean win = false;

        while(countGuess < 3) {
            System.out.println("");
            int guess = kb.nextInt();
            if (answer == guess) {
                System.out.println("Correct! You 've guessed the number.");
                System.out.println("========================LOSE========================");
            }else{
                System.out.println("Incorrect guess. Tre again.");
                System.out.println("========================LOSE========================");
            }
            countGuess++;
        }
        if(win == false)
        System.out.println("Game over. The correct naumber was: "+ answer);
        kb. close();
    }
}
