
/**
 * Hand.java
 *
 * @author - Samih Qureshi
 * @author - Period 3
 * @author - Id 10023090
 *
 */

import java.util.ArrayList;

public class Hand {
    ArrayList<Card> hand = new ArrayList<Card>();

    public void addCard(Card c) {
        // appends Card c to the arraylist
        hand.add(c);
    }

    public boolean isEmpty() {
        // checks if hand.size() is 0, and returns accordingly
        if (hand.size() == 0) {
            return true;
        }
        return false;
    }

    public void sort() {
        // sorts using selection sort
        for (int i = 0; i < hand.size(); i++) {
            int position = i;
            for (int j = i; j < hand.size(); j++) {
                // keeps going through to find index with smallest number
                if (hand.get(j).getOrder() < hand.get(position).getOrder())
                    position = j;
            }
            // Swap min (smallest num) to current position on array
            Card min = hand.get(position);
            hand.set(position, hand.get(i));
            hand.set(i, min);
        }
    }

    public String toString() {
        if (hand.size() == 0) {
            return "Hand is Empty!\n";
        }
        String toStr = "Hand:\n";
        // outputs the hand by getting each of the card's .toString() values and concatenating them to an outputted string
        for(int i = 0; i < hand.size();i++){
            toStr += hand.get(i).toString() + "\n";
        }
        return toStr;
    }


}
