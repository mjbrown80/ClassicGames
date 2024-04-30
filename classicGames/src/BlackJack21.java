import java.util.Scanner;

public class BlackJack21 implements Game{

    @Override
    public void play() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Black Jack!!!!");

        DeckOfCards deck = new DeckOfCards();
        deck.shuffleDeck();

        System.out.println("Dealing cards: ");
        
        System.out.println(deck.dealCard());
        System.out.println(deck.dealCard());
        System.out.println(deck.dealCard());

        //private int calculateScore
    }
}
