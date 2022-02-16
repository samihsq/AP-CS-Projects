package randomstuff;

import java.util.Scanner;
class guessingGame {
    public static void main(String[] args) {
        int rnd = (int)(Math.random()*21);
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter # between 0-20: ");
        int guess = in.nextInt();
        if (guess == rnd) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }

    }
}