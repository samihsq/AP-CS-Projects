
import java.util.ArrayList;

public class Deck {
    ArrayList<Card> deck= new ArrayList<Card>();

    public void addCard(Card c){
        deck.add(c);
    }

    public Card draw() {
        return deck.remove(deck.size()-1);
    }

    public void shuffle() {
        Card temp;
        for(int i = 0; i < deck.size(); i++) {
            for(int j = 0; j < deck.size(); j++) {
                int val = Math.abs(deck.size()-(i+j)/2);
                if (val > deck.size()-1) {
                    val /= 2;
                }
                temp = deck.get(val);
                deck.remove(val);
                deck.add(temp);
            }
        }
    }

    public String toString() {
        if (deck.size() == 0) {
            return "Deck is empty!";
        }
        String toStr = "Deck:\n";
        for(int i = 0; i < deck.size();i++){
            toStr += deck.get(i).toString() + "\n";
        }
        return toStr;
    }

}
