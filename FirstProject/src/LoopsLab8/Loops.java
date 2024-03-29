
/**
 * Unit4.java - Lab for Unit 4 to practice while/for loops
 *
 * @author - Samih Qureshi
 * @author - Period 3
 * @author - Id 10023090
 *
 *
 */
public class Loops
{
    public static void main(String[] args)
    {

        // all functions run here
        multiplicationTable(3);
        multiplicationTable(6);
        findPrime(20);
        findPrime(37);
        palindromeWord("civic");
        palindromeWord("computer");
        checkerBoard(4);
        checkerBoard(7);
        diamond(3);
        diamond(5);
        xmasTree(5);
        xmasTree(7);
        birthdayCake(3, 4);
        birthdayCake(5, 3);
        verbalArithmetic();
    }

    // Task 1 - print multiplication table starting at 1 to n
    public static void multiplicationTable(int n) {
        System.out.println("\n[Task 1 - Multiplication Table]");
        System.out.println("multiplicationTable(" + n + ")");

        int j = 1;
        // create first column because it never changes
        System.out.println("\tX1\tX2\tX3\tX4\tX5\tX6\tX7\tX8\tX9\tX10");

        // iterates through number of columns (n), multiplies through the table
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


        // iterates through x values, and brute forces values for multiples
        // if no multiples found then number is prime and it's printed
        while (x <= n) {
            while(mult1<=n) {
                while(mult2<=n) {
                    // checks if multiples = x (if true then x is not prime)
                    if(mult1*mult2 == x) {
                        prime = false;
                        break;
                    } else {
                        mult2++;
                    }

                }
                mult1++;
                mult2 = 2;
            }
            // if prime, then the number is printed, with a space after
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


        // for loop starts from the back of the word, puts characters from the back into the front
        for(int x = word.length() - 1; x >= 0; x--) {
            reversedWord += word.charAt(x);
        }


        // checks if the reversed word = regular word, prints out accordingly
        if (reversedWord.equals(word)) {
            System.out.println(word + " is a palindrome word.");
        } else {
            System.out.println(word + " is NOT a palindrome word.");
        }

    }

    // Task 4 - print a n by n checker board with * and _
    public static void checkerBoard(int n)
    {
        System.out.println("\n[Task 4 - Checker Board]");
        System.out.println("checkerBoard(" + n + ")");

        // Write your implementation below


        // uses row/column format with loops
        // checks for position of cursor, alternates between * and _
        for(int row = 0; row < n; row++) {
            for(int x = 0; x < n; x++) {
                // alternates between rows as well so that it looks like a checkerboard
                if (row % 2 == 0) {
                    if ((x % 2 == 0)) {
                        System.out.print("*");
                    } else {
                        System.out.print("_");
                    }
                } else {
                    if ((x % 2 == 0)) {
                        System.out.print("_");
                    } else {
                        System.out.print("*");
                    }
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

        int y = 1;
        int z = 1;
        int space = 1;

        space = n - 1;

        for (y = 1; y<=n; y++)
        {
            // prints spaces before the diamond
            for (z = 1; z<=space; z++) {
                System.out.print(" ");
            }

            space--;

            // prints the stars on one side of the diamond
            for (z = 1; z<= 2*y-1; z++) {
                System.out.print("*");
            }

            System.out.println();
        }

        space = 1;

        for (y = 1; y<= n - 1; y++)
        {
            // spaces used again for formatting, when diamond is decreasing in size
            for (z = 1; z<= space; z++) {
                System.out.print(" ");
            }

            space++;

            // star calculation when diamond is decreasing in size
            for (z = 1 ; z<= 2*(n-y)-1; z++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    // Task 6 - print a letter Christmas tree
    public static void xmasTree(int n)
    {
        System.out.println("\n[Task 6 - Letter Christmas Tree]");
        System.out.println("xmasTree(" + n + ")");

        // Write your implementation below

        int y = 1;
        int z = 1;
        int space = 1;
        char letter = 97;

        space = n - 1;

        for (y = 1; y<=n; y++)
        {
            // prints the spaces before the tree if necessary
            for (z = 1; z<=space; z++) {
                System.out.print(" ");
            }

            space--;

            for (z = 1; z<= 2*y-1; z++) {
                // prints letters, iterates through each one using ++ and --
                if (z > y) {
                    // reverses back if past the half way point of tree
                    letter--;
                    System.out.print(letter);
                } else {
                    System.out.print(letter);
                    letter++;
                    if (z == y) {
                        letter--;
                    }

                }

            }

            letter = 97;

            System.out.println();
        }

    }

    // Task 7 - birthday cake
    // First parameter is # of layers
    // Second parameter is like the radius (# of dashes on the top layer)
    public static void birthdayCake(int layer, int radius)
    {
        System.out.println("\n[Task 7 - Birthday Cake]");
        System.out.println("birthdayCake(" + layer + ", " + radius + ")");

        // Write your implementation below

        int y = 1;
        int z = 1;
        int space = 1;
        char letter = 97;

        space = (radius * layer * 2) - (2 * y * radius);

        for (y = 0; y<layer; y++)
        {

            space = (radius * layer) - (y * radius) - 3;

            //inital spaces
            for (z = 1; z<=space; z++) {
                System.out.print(" ");
            }

            //top layer (of a single layer)
            System.out.print("+");

            for (z = 1; z<= radius + (2 * y * radius); z++) {
                System.out.print("-");
            }

            System.out.println("+");



            //middle layer (of a single layer)

            for (z = 1; z<=space; z++) {
                System.out.print(" ");
            }
            System.out.print("|");

            for (z = 1; z<= radius + (2 * y * radius); z++) {
                System.out.print(" ");
            }

            System.out.println("|");



            // bottom layer (of a single layer)

            for (z = 1; z<=space; z++) {
                System.out.print(" ");
            }
            System.out.print("+");

            for (z = 1; z<= radius + (2 * y * radius); z++) {
                System.out.print("-");
            }

            System.out.println("+");

            // repeats to create the rest of the cake layers

        }

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
        System.out.println("\n[Task 8 - Verbal randomstuff.Arithmetic]");
        System.out.println("verbalArithmetic()");

        // Write your implementation below

        int counter = 0;

        String stringNumber = "";

        char a, b, c, d, e, eOfI;

        // iterates between possible answers, divides between single digit numbers
        for(int i = 111111; i <= 999999; i += 111111) {
            for(int divisor = 2; divisor <= 9; divisor++) {
                int val = i / divisor;
                if (i % divisor == 0 && val <= 99999) {
                    // checks to see if the found number fits the requirements
                    stringNumber = String.valueOf(val);
                    eOfI = (String.valueOf(i)).charAt(5);
                    a = stringNumber.charAt(0);
                    b = stringNumber.charAt(1);
                    c = stringNumber.charAt(2);
                    d = stringNumber.charAt(3);
                    e = stringNumber.charAt(4);

                    // following logic makes sure each number is different than each other
                    if (a != b && a != c && a != d && a != e) {
                        if (b != c && b != d && b != e) {
                            if (c != d && c != e) {
                                if (d != e) {
                                    // makes sure the E in the multiplication is the same as the E in the answer
                                    if (e == eOfI) {
                                        System.out.println("     " + val);
                                        System.out.println("  X      " + divisor);
                                        System.out.println("------------");
                                        System.out.println("    " + i);
                                        System.out.println("The total # of loops: " + counter);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }

            }

            // iterates counter to check how many times looped
                counter++;

        }

    }

}
