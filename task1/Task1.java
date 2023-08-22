//Safaa Joshkon- Task1
package task1;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean play = true;
        int won = 0;
        while(play) {
            int x = (int)(Math.random()*100);
            System.out.println("The generated number is: " + x);
            int attempts = 0;
            boolean correctGuess = false;
            while (attempts < 3 && !correctGuess) {
                System.out.print("Enter your guess of a number in the range of 1 & 100: ");
                int y= scan.nextInt();
                attempts++;
                if (y>x)
                    System.out.println("Your guess is too high."); 
                else if (y<x) 
                    System.out.println("Your guess is too low.");
                else {
                    System.out.println("Your guess is correct!");
                    won++;
                    correctGuess = true;
                }
            }
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain= scan.next();
            play= playAgain.equalsIgnoreCase("yes");
        }
        if(won>0){
            if(won==1)
                System.out.println("Game Over. You won one round.");
            else
                System.out.println("Game Over. You won "+won+" rounds.");
        }
        else 
            System.out.println("Game Over. You didn't win any rounds.");
    }
}

