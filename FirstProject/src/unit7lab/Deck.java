package unit7lab;
/**
 * Deck.java
 *
 * @author - Samih Qureshi
 * @author - Period 3
 * @author - Id 10023090
 *
 */

import java.util.ArrayList;

public class Deck {
    ArrayList<Card> deck= new ArrayList<Card>();

    public void addCard(Card c){
        deck.add(c);
    }

    public Card draw() {
        return deck.remove(0);
    }

    public void shuffle() {
        Card temp;
        // shuffles through relatively random shuffling,
        for(int i = 0; i < deck.size(); i++) {
            for(int j = 0; j < deck.size(); j++) {
                // calculates with Math.random(), gives random index
                int val = (int)(Math.random()*deck.size());
                // moves items around with temp
                temp = deck.get(val);
                deck.remove(val);
                deck.add(temp);
            }
        }
    }

    public String toString() {
        if (deck.size() == 0) {
            return "Deck is Empty!\n";
        }
        String toStr = "Deck:\n";
        // outputs the deck by getting each of the card's .toString() values and concatenating them to an outputted string
        for(int i = 0; i < deck.size();i++){
            toStr += deck.get(i).toString() + "\n";
        }
        return toStr;
    }

}
