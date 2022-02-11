
public class Card {
    String value;
    String suit;
    int order;
    public Card(String value, String suit) {
        this.suit = suit;
        this.value = value;
        if(value.equals("Ace")) {
            order = 1;
        } else if (value.equals("Jack")) {
            order = 11;
        } else if (value.equals("Queen")) {
            order = 12;
        } else if (value.equals("King")) {
            order = 13;
        } else {
            order = Integer.parseInt(value);
        }
    }

    public String getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }

    public int getOrder() {
        return order;
    }

    public String toString() {
        return value + " of " + suit;
    }

}
