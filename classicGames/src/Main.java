import java.util.Random;
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
            System.out.println("3) Black Jack 21");

            int gameSelection = scanner.nextInt();
            Game selectedGame = null;

            switch(gameSelection){
                case 1:
                    selectedGame = new RockPaperScissors();
                    break;
                case 2:
                    selectedGame = new GuessNumber();
                    break;
                case 3:
                    selectedGame = new BlackJack21();
                default:
                    System.out.println("Invalid selection. Please try again.");
                    break;
            }

            if (selectedGame != null){
                selectedGame.play();
            }



            System.out.println("Would you like to play again? 1) yes or 2) no");
            int choice = scanner.nextInt();
            if(choice == 2){
                playAgain = false;
            }
            System.out.println("Thank you for playing!!");

        }
    }
}