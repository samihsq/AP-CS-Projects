
import java.util.ArrayList;

public class Hand {
    ArrayList<Card> hand = new ArrayList<Card>();

    public void addCard(Card c) {
        hand.add(c);
    }

    public boolean isEmpty() {
        if (hand.size() == 0) {
            return true;
        }
        return false;
    }

    public void sort() {
        for (int i = 0; i < hand.size(); i++) {
            // find position of smallest num between (i + 1)th element and last element
            int position = i;
            for (int j = i; j < hand.size(); j++) {
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
            return "Hand is empty!";
        }
        String toStr = "Hand:\n";
        for(int i = 0; i < hand.size();i++){
            toStr += hand.get(i).toString() + "\n";
        }
        return toStr;
    }


}
