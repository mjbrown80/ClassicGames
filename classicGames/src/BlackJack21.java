import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlackJack21 implements Game{

    private List<String> userHand;
    private List<String> dealerHand;

    public BlackJack21(){
        userHand = new ArrayList<>();
        dealerHand = new ArrayList<>();
    }

    @Override
    public void play() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Welcome to Black Jack!!!!");

        DeckOfCards deck = new DeckOfCards();
        deck.shuffleDeck();

        System.out.println("Dealing cards: ");

        userHand.add(deck.dealCard());
        dealerHand.add(deck.dealCard());
        userHand.add(deck.dealCard());

        System.out.println("Your cards: " + userHand);
        System.out.println("Dealers cards: " + dealerHand);

        int userChoice;
        int userScore = calculateScore(userHand);
        int dealerScore = calculateScore(dealerHand);

        do{
        System.out.println("Do you want to: ");
        System.out.println("1) Hit me!");
        System.out.println("2) Hold");

        userChoice = scanner.nextInt();

            if (userChoice == 1){
                userHand.add(deck.dealCard());
                System.out.println("Your hand is: " + userHand + userScore);
            } calculateScore(userHand);
            if (userScore > 21){
                System.out.println("You Busted!!!! Dealer wins!!!");
            }
            }while(userChoice !=2);

            while (calculateScore(dealerHand) < 17){
                dealerHand.add(deck.dealCard());
            }



            System.out.println("the dealers hand is: " + dealerHand + "dealer Score is: " + dealerScore);
            System.out.println("Your hand is: " + userHand + "your score is: "+ userScore);

            if (userScore >21){
                System.out.println("You busted!!!");
                System.out.println("The dealer wins!!!!");
            } else if (dealerScore > 21 || dealerScore < userScore) {
                System.out.println("You Won!!!!!!");
            } else if (dealerScore > userScore) {
                System.out.println("Dealer Won!!!!!");
            }else {
                System.out.println("It's a tie!!!!!");
            }
    }
        private int calculateScore(List<String> hand){
        int score = 0;
        int aceCount = 0;

        for (String card : hand){
            String faceValue = card.split(" ")[0];

            if (faceValue.equals("ace")){
                aceCount++;
            } else if (faceValue.equals("jack") || faceValue.equals("queen") || faceValue.equals("king")) {
                score += 10;
            }else{
                score += Integer.parseInt(faceValue);
            }
        }

        for (int i = 0; i < aceCount; i++){
            if (score + 11 <= 21){
                score += 11;
            }else{
                score += 1;
            }
        }
        return score;
        }
    }

