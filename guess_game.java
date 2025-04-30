import java.util.Scanner;
import java.util.Random;

public class guess_game {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();


        int numberToGuess = rand.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("Welcome to the Number guessing Game");
        System.out.println("I am thinking of a number between 1 to 100 can you guess.Can you guess it. lets see! ");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low Guess again. ");
            } else if (guess > numberToGuess) {
                System.out.println("Too high Guess again. ");
            } else {
                System.out.println("Congratulations you find the correct number : " + guess);
                System.out.println("Total number of attempts are : " + attempts);
            }

        }while (guess != numberToGuess);

        }

    }
