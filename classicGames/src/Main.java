import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            System.out.println("Welcome to Classic Games!!!");
            System.out.println();
            System.out.println();


            System.out.println("Please select a Game to play:");
            System.out.println();
            System.out.println("1) Rock Paper Scissors");
            System.out.println("2) Guess the Number");

            int gameSelection = scanner.nextInt();

            System.out.println("Would you like to play again? 1) yes or 2) no");
            int choice = scanner.nextInt();
            if(choice == 2){
                playAgain = false;
            }
            System.out.println("Thank you for playing!!");

        }
    }
}