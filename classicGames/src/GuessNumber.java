import java.util.Random;
import java.util.Scanner;

public class GuessNumber implements Game{

    @Override
    public void play() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Get Ready to play Guess a number");
        System.out.println("Guess a number between 1 and 100");

        int userChoice = scanner.nextInt();

        int max = 99;
        int min = 0;
        int range = 100;

        int random = (int)(Math.random() * range) + min;

        while (userChoice != random){
            if (userChoice == random){
               break;
            } else if (userChoice < random) {
                System.out.println("Your number is to low!");
                System.out.println("Try again");
                userChoice = scanner.nextInt();
            } else if (userChoice > random) {
                System.out.println("Your number is to high!");
                System.out.println("Try again");
                userChoice = scanner.nextInt();
            }

        }
        System.out.println("That's the Number");
        System.out.println("You Win!!!!!!!");
        System.out.println("The random number is: " + random);
    }
}
