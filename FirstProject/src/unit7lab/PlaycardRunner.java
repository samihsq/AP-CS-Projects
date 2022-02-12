
/**
 * PlaycardRunner.java
 *
 * @author - Samih Qureshi
 * @author - Period 3
 * @author - Id 10023090
 *
 */

public class PlaycardRunner
{
    public static void main(String[] args)
    {
        // Create a new Deck
        Deck deck = new Deck();
        // Create a new Hand for a player
        Hand hand = new Hand();

        // Create some cards and add them to the deck.
        // Test cases (DO NOT CHANGE)
        deck.addCard(new Card("Ace", "Clubs"));
        deck.addCard(new Card("Jack", "Diamonds"));
        deck.addCard(new Card("Queen", "Spades"));
        deck.addCard(new Card("King", "Hearts"));
        deck.addCard(new Card("2", "Clubs"));
        deck.addCard(new Card("3", "Diamonds"));
        deck.addCard(new Card("4", "Spades"));
        deck.addCard(new Card("5", "Hearts"));
        deck.addCard(new Card("6", "Clubs"));
        deck.addCard(new Card("King","Diamonds"));
        deck.addCard(new Card("Ace", "Spades"));
        deck.addCard(new Card("Ace", "Hearts"));

        // Shuffle the deck and print each card in the deck out
        deck.shuffle();
        System.out.println("Deck after shuffled...");
        System.out.println(deck);

        // Print out the cards in hand.  Should be empty for now.
        System.out.println(hand);

        // Make a loop to draw cards from the deck and add to the hand
        for (int i = 0; i < 6; i++)
        {
            System.out.println("Hand draws a card from the deck...");
            // Draw a card from the deck and add it to the hand
            Card card = deck.draw();
            // Print out the card in hand
            System.out.println("Draw: " + card + "\n");
            hand.addCard(card);
        }

        // Print out the deck again and the hand to verify
        System.out.println(deck);
        System.out.println(hand);

        // Sort cards in hand and print out to verify
        hand.sort();
        System.out.println("Hand sorted");
        System.out.println(hand);
    }
}
