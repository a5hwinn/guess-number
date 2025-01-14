import java.util.Scanner;

public class guessnum {
    public static void guessingNumberGame() {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int)(100 * Math.random());

        // n gives the no. of trials
        int n = 10;
        int i, guess;

        System.out.println("Welcome to the number guessing game.\nA number has been chosen between 1 and 100.\nGuess the number within 5 trials to win!");

        for (i = 0; i < n; i++) {
            System.out.println("Guess the number: ");
            guess = sc.nextInt();

            if (number == guess) {
                System.out.println("Congratulations! You have guessed the number!");
                break;
            } else if (number > guess && i != n - 1) {
                System.out.println("The number is greater than " + guess);
            } else if (number < guess && i != n - 1) {
                System.out.println("The number is lesser than " + guess);
            }
        }

        if (i == n) {
            System.out.println("You have zero tries remaining. Game Over!");
            System.out.println("The number was: " + number);
        }
    }

    public static void main(String[] args) {
        guessingNumberGame();
    }
}
