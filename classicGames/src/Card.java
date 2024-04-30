import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Card implements Game{
    private String faceName;
    private String suit;
    private String[] deck = new String[52];
    private Random random;

    public Card(String faceName, String suit) {
        this.faceName = faceName;
        this.suit = suit;
    }

    public String getFaceName() {
        return faceName;
    }

    public void setFaceName(String faceName) {
        List<String> validFaceNames = getValidFaceName();
        faceName = faceName.toLowerCase();

        if (validFaceNames.contains(faceName))
            this.faceName = faceName;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        List<String> validSuits = getValidSuit();
        suit = suit.toLowerCase();
        if (validSuits.contains(suit));
        this.suit = suit;
    }

    public String[] getDeck() {
        for (int i = 0; i < deck.length; i++){
            deck[i] = getFaceName() + getSuit();
        }
        return deck;
    }

    public void setDeck(String[] deck) {
        this.deck = deck;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public static List<String> getValidFaceName(){
        return Arrays.asList("2","3","4","5","6","7","8","9","10","jack","queen","king","ace");
    }

    public static List<String> getValidSuit(){
        return Arrays.asList("spades","clubs","hearts","diamonds");
    }

    @Override
    public void play() {

    }

    @Override
    public String toString() {
        return "Card{" +
                 faceName + " " + "of" +
                 " " + suit  +
                '}';
    }
}
