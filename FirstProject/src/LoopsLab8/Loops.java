package LoopsLab8;

/**
 * Unit4.java - Lab for Unit 4 to practice while/for loops
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - Id 0000000
 *
 * @author - I received help from ...
 *
 */
public class Loops
{
    public static void main(String[] args)
    {
        multiplicationTable(3);
        multiplicationTable(6);
        findPrime(20);
        findPrime(37);
        palindromeWord("civic");
        palindromeWord("computer");
        checkerBoard(4);
        checkerBoard(7);
        /*
        diamond(3);
        diamond(5);
        xmasTree(5);
        xmasTree(7);
        birthdayCake(3, 4);
        birthdayCake(5, 3);
        verbalArithmetic();*/
    }

    // Task 1 - print multiplication table starting at 1 to n
    public static void multiplicationTable(int n) {
        System.out.println("\n[Task 1 - Multiplication Table]");
        System.out.println("multiplicationTable(" + n + ")");

        int j = 1;
        System.out.println("\tX1\tX2\tX3\tX4\tX5\tX6\tX7\tX8\tX9\tX10");
        while (j <= n) {
                System.out.print("X" + j);

            for (int i = 1; i <= 10; i++) {

                System.out.print("\t" + (i * j));

            }
            System.out.println();
            j++;
        }
    }

    // Task 2 - print all prime numbers up to n
    public static void findPrime(int n)
    {
        System.out.println("\n[Task 2 - Prime Numbers]");
        System.out.println("findPrime(" + n + ")");
        System.out.print("The prime numbers up to " + n + " are:  ");

        int x = 2;
        int mult1 = 2;
        int mult2 = 2;
        boolean prime = true;

        while (x <= n) {
            //System.out.println("trying " + x);
            while(mult1<=n) {
                //System.out.println("mult1 " + mult1);
                while(mult2<=n) {
                    //System.out.println("mult2 " + mult2);
                    if(mult1*mult2 == x) {
                        //System.out.println(x + " not prime");
                        prime = false;
                        break;
                    } else {
                        mult2++;
                    }

                }
                mult1++;
                mult2 = 2;
            }
            if(prime) {
                System.out.print(x + " ");
            }
            mult1 = 2;
            mult2 = 2;
            x++;
            prime = true;

        }



    }

    // Task 3 - find whether word is a palindrome word
    public static void palindromeWord(String word)
    {
        System.out.println("\n[Task 3 - Palindrome Word]");
        System.out.println("palindromeWord(" + word + ")");
        String reversedWord = "";

        // Write your implementation below

        for(int x = word.length() - 1; x >= 0; x--) {
            reversedWord += word.charAt(x);
        }

        if (reversedWord.equals(word)) {
            System.out.println(word + " is a palindrome word.");
        } else {
            System.out.println(word + " is NOT a palindrome word.");
        }

//        System.out.println(reversedWord);

    }

    // Task 4 - print a n by n checker board with * and _
    public static void checkerBoard(int n)
    {
        System.out.println("\n[Task 4 - Checker Board]");
        System.out.println("checkerBoard(" + n + ")");

        // Write your implementation below

        for(int row = 0; row < n; row++) {
            for(int x = 0; x < n; x++) {
                if (x % 2 != 0)
                if (x % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }

    }

    // Task 5 - print a diamond with * with the given side length n
    public static void diamond(int n)
    {
        System.out.println("\n[Task 5 - Diamond]");
        System.out.println("diamond(" + n + ")");

        // Write your implementation below

    }

    // Task 6 - print a letter Christmas tree
    public static void xmasTree(int n)
    {
        System.out.println("\n[Task 6 - Letter Christmas Tree]");
        System.out.println("xmasTree(" + n + ")");

        // Write your implementation below

    }

    // Task 7 - birthday cake
    // First parameter is # of layers
    // Second parameter is like the radius (# of dashes on the top layer)
    public static void birthdayCake(int layer, int radius)
    {
        System.out.println("\n[Task 7 - Birthday Cake]");
        System.out.println("birthdayCake(" + layer + ", " + radius + ")");

        // Write your implementation below

    }

    // Task 8 - verbal arithmetic
    // Find the number that satisfied the following multiplication.
    // A-E represent different digit.
    //          ABCDE
    //       X      A
    //     ------------
    //         EEEEEE
    public static void verbalArithmetic()
    {
        System.out.println("\n[Task 8 - Verbal Arithmetic]");
        System.out.println("verbalArithmetic()");

        // Write your implementation below

    }

}
