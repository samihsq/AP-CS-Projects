package unit7lab;

/**
 * PlaycardRunner.java
 *
 * @author - K Chang
 * @since 03/2021
 * Modified from Mr. May's lab
 *
 * 12/2021 Add sort method in Hand class
 *
 * This is the lab for unit 7 to practice ArrayList.
 * It will use 3 classes: Card, Deck, and Hand (in another file)
 * This runner program makes a new deck, a new hand, and add cards to the deck.
 * It shuffles the deck and the hand draws cards from the deck.
 * It uses string printing to show the result.
 */
public class PlaycardRunner
{
    public static void main(String[] args)
    {
        // Create a new Deck

        // Create a new Hand for a player

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

        System.out.println("Deck after shuffled...");
        System.out.println(deck);

        // Print out the cards in hand.  Should be empty for now.
        System.out.println(hand);

        // Make a loop to draw cards from the deck and add to the hand
        for (int i = 0; i < 6; i++)
        {
            System.out.println("Hand draws a card from the deck...");
            // Draw a card from the deck and add it to the hand

            // Print out the card in hand
            System.out.println("Draw: " + card + "\n");
        }

        // Print out the deck again and the hand to verify
        System.out.println(deck);
        System.out.println(hand);

        // Sort cards in hand and print out to verify

        System.out.println("Hand sorted");
        System.out.println(hand);
    }
}
