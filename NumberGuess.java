import java.util.Random;
import java.util.Scanner;

public class NumberGuess{
    public static void main(String[] args){

        //NUMBER GUESSING GAME

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int guess;
        int attempts = 0;
        int randomNumber = random.nextInt(1,11);

        System.out.println("Welcome to Number Guessing Game");
        System.out.println("Guess a number between 1- 10:");

        do{
             System.out.println("Enter a guess: ");
             guess = scanner.nextInt();
             attempts++;

             if ( guess < randomNumber){
                System.out.println("TOO LOW!!! try again");
             }
             else if (guess > randomNumber){
                System.out.println("TOO HIGH!! try again");
             }
             else {
                System.out.println("CORRECT! The number was " + randomNumber);
                System.out.println("No. of Attempts " + attempts);
             }
            
        }while( guess != randomNumber);

        System.out.println("Congo!! You have WON!");

    }
}