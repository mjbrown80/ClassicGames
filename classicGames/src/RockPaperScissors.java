import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors implements Game {

    private String rock;
    private String paper;
    private String scissors;

    public RockPaperScissors(String rock, String paper, String scissors) {
        this.rock = rock;
        this.paper = paper;
        this.scissors = scissors;
    }

    public RockPaperScissors() {
    }

    public String getRock() {
        return rock;
    }

    public void setRock(String rock) {
        this.rock = rock;
    }

    public String getPaper() {
        return paper;
    }

    public void setPaper(String paper) {
        this.paper = paper;
    }

    public String getScissors() {
        return scissors;
    }

    public void setScissors(String scissors) {
        this.scissors = scissors;
    }

    @Override
    public String toString() {
        return "RockPaperScissors{" +
                "rock='" + rock + '\'' +
                ", paper='" + paper + '\'' +
                ", scissors='" + scissors + '\'' +
                '}';
    }

    @Override
    public void play() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Get ready to play Rock Paper Scissor!");
        System.out.println("Enter your choice: 1) Rock, 2) Paper, 3) Scissors");

        int userChoice = scanner.nextInt();
        int computerChoice = random.nextInt(3) + 1;

        String result = determineWinner(userChoice, computerChoice);

        System.out.println("You chose: " + getUserChoiceString(userChoice));
        System.out.println("Computer chose: " + getUserChoiceString(computerChoice));
        System.out.println("Result: " + result);


    }
    private String getUserChoiceString(int choice) {
        switch (choice){
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "Invalid Choice";
        }
    }
    private String determineWinner(int userChoice, int computerChoice){
        if (userChoice == computerChoice){
            return "It's a tie!";
        } else if ((userChoice == 1 && computerChoice == 3) ||
                    (userChoice == 2 && computerChoice == 1) ||
                    (userChoice == 3 && computerChoice == 2)){
            return "You Win!";
        }else {
            return "You Lose, Computer Wins!!";
        }
    }
}
