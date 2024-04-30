import java.util.*;

public class DeckOfCards  {

    private List<String> deck;

    public DeckOfCards() {
        this.deck = generateDeck();
    }

    private List<String> generateDeck(){
        List<String> newDeck = new ArrayList<>();
        List<String> suits  = getValidSuit();
        List<String> faceValues = getValidFaceValues();

        for (String suit : suits){
            for (String faceValue : faceValues){
                newDeck.add(faceValue + " of " + suit);
            }
        }
        return newDeck;
    }

     public void shuffleDeck(){
        Collections.shuffle(deck);
    }

    public String dealCard(){
        if (deck.isEmpty()){
            System.out.println("Deck is Empty!");
            return null;
        }
        return deck.remove(0);
    }



    public static List<String> getValidFaceValues(){
        return Arrays.asList("2","3","4","5","6","7","8","9","10","jack","queen","king","ace");
    }

    public static List<String> getValidSuit(){
        return Arrays.asList("spades","clubs","hearts","diamonds");
    }

    @Override
    public String toString() {
        return "DeckOfCards{" +
                "deck=" + deck +
                '}';
    }
}
