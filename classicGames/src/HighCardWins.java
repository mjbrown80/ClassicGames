import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HighCardWins implements Game{
    private List<String> userCard;
    private List<String> dealerCard;

    public HighCardWins(){
        userCard = new ArrayList<>();
        dealerCard = new ArrayList<>();
    }
    @Override
    public void play() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome High Card Wins!!!");

        DeckOfCards deck = new DeckOfCards();
        deck.shuffleDeck();

        System.out.println("Dealing cards");

        try {
            Thread.sleep(2000);
            dealerCard.add(deck.dealCard());
            System.out.println("Dealer Card: " + dealerCard );

            Thread.sleep(2000);
            userCard.add(deck.dealCard());
            System.out.println("Your Card: " + userCard);

            int userscore = calculateScore(userCard);
            int dealerScore = calculateScore(dealerCard);

            Thread.sleep(1500);
            System.out.println("Dealer score is: " + dealerScore);
            System.out.println("Your score is: " + userscore);

            if (userscore > dealerScore){
                System.out.println("Congratulations, you won!!!!!!");
            } else if (dealerScore >  userscore) {
                System.out.println("Dealer won!! Better luck next time.");
            }else{
                System.out.println("It's a tie!! Try again.");
            }

        }catch (InterruptedException e){
            System.err.println("Dealing was interrupted");
            Thread.currentThread().interrupt();
        }


    }
    private int calculateScore(List<String> card){
        int score = 0;

        for (String hand : card){
            String faceValue = hand.split(" ")[0];

            if (faceValue.equals("jack") || faceValue.equals("queen") || faceValue.equals("king") || faceValue.equals("ace")){
                score += 10;
            }else{
                score += Integer.parseInt(faceValue);
            }
        }
        return score;
    }
}
