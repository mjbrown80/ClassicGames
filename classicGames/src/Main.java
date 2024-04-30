import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Card card1 = new Card("car", "spades");
        System.out.println(card1);

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
            Game selectedGame = null;

            switch(gameSelection){
                case 1:
                    selectedGame = new RockPaperScissors();
                    break;
                case 2:
                    selectedGame = new GuessNumber();
                    break;
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