package unit10lab;

/**
 * Recursion.java
 *
 * @author - K Chang
 * @since 05/2021
 *
 * For Unit 10 recursion lab
 * Total 12 tasks.
 * The main method will call recursive methods to perform various tasks.
 */
public class Recursion {
    public static void main(String[] args)
    {
        // Test case #1: Sum all natural numbers from 1 up to n
        System.out.println("[1. Sum natural numbers up to n]");
        System.out.println("================================");
        System.out.println("Sum natural numbers 1 to 4: " + sumNumbers(4));
        System.out.println("Sum natural numbers 1 to 25: " + sumNumbers(25));
        System.out.println();

        // Test case #2: Add all digits of a given number n
        System.out.println("[2. Add all digits of a given number n]");
        System.out.println("=======================================");
        System.out.println("Sum of digits 1234: " + sumDigits(1234));
        System.out.println("Sum of digits 8379014: " + sumDigits(8379014));
        System.out.println();

        // Test case #3: Reverse a given string
        System.out.println("[3. Reverse a given string]");
        System.out.println("===========================");
        System.out.println("Reverse of \"noon\" is: " + reverseString("noon"));
        System.out.println("Reverse of \"Rolls Royce\" is: " + reverseString("Rolls Royce"));
        System.out.println();

        // Test case #4: Determine a palindrome word
        // Must call reverseString in #3
        System.out.println("[4. Palindrome words]");
        System.out.println("=====================");
        if ("noon".equals(reverseString("noon")))
            System.out.println("\"noon\" is a palindrome word");
        else
            System.out.println("\"noon\" is not a palindrome word");

        if ("California".equals(reverseString("California")))
            System.out.println("\"California\" is a palindrome word");
        else
            System.out.println("\"California\" is not a palindrome word");
        System.out.println();

        // Test case #5: Reverse all digits of a given number n
        System.out.println("[5. Reverse all digits of a given number n]");
        System.out.println("===========================================");

        // There are different ways to implement this.
        // You can treat the number as a number
        // Or you can handle it as a number/string
        // You can pick one of these two test cases that work for your method
        // Uncomment the one you decide to use
        // Test case 5a - mostly treat n as a string.
        // This will call a method which returns a string.
        //System.out.println("Reverse of 1234: " + reverseDigits2(1234));
        //System.out.println("Reverse of 83791306: " + reverseDigits2(83791306));
        //System.out.println();

        // Test case 5b - treat n as a number.  This calls a void method.
        System.out.print("Reverse of 1234: ");
        reverseDigits(1234);
        System.out.println();
        System.out.print("Reverse of 83791306: ");
        reverseDigits(83791306);
        System.out.println();
        System.out.println();

        // Test case #6: Decimal to binary conversion
        System.out.println("[6. Convert a decimal to a binary]");
        System.out.println("============================");
        System.out.print("10 in binary: ");
        binary(10);
        System.out.println();
        System.out.print("32 in binary: ");
        binary(32);
        System.out.println();
        System.out.println();

        // Test case #7: Binary to decimal conversion
        System.out.println("[7. Convert a binary to a decimal]");
        System.out.println("============================");
        System.out.print("Binary 1101 to decimal: " + decimal (1101));
        System.out.println();
        System.out.print("Binary 11101 to decimal: " + decimal (11101));
        System.out.println();
        System.out.println();

        // Test case #8: Find exponential values
        System.out.println("[8. Find the exponential value for base b and exponent m]");
        System.out.println("============================");
        System.out.println("Exponent (2 to 4th power): " + exponent(2, 4));
        System.out.println("Exponent (3 to 6nd power): " + exponent(3, 6));
        System.out.println();

        // Test case #9: Logarithm
        System.out.println("[9. Find the logarithmic value for base b and exponential value m]");
        System.out.println("============================");
        System.out.println("Log base 2 of 16: " + logarithm(16, 2));
        System.out.println("Log base 3 of 6561: " + logarithm(6561, 3));
        System.out.println();

        // Test case #10: GCF using Euclid's Algorithm
        System.out.println("[10. Find the GCF of a and b]");
        System.out.println("============================");
        System.out.println("GCF of 20 and 8: " + gcf(20, 8));
        System.out.println("GCF of 15 and 30: " + gcf(15, 30));
        System.out.println();

        // Test case #11: Fibonacci Sequence
        int sum = 0;
        System.out.println("[11. Fibonacci Sequence]");
        System.out.println("=======================");
        System.out.print("4 terms of Fibonacci sequence: ");
        for (int i = 0; i < 4; i++)
        {
            sum += fibonacci(i);
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
        System.out.println("Sum of 4 terms of Fibonacci sequence: " + sum);
        System.out.println();

        sum = 0;
        System.out.print("8 terms of Fibonacci sequence: ");
        for (int i = 0; i < 8; i++)
        {
            sum += fibonacci(i);
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
        System.out.println("Sum of 8 terms of Fibonacci sequence: " + sum);
        System.out.println();

        // Test case #12: Merge Sort and binary search
        System.out.println("[12. Merge sort and binary search]");
        System.out.println("=================================");
        int[] intArray = {4, 2, 8, 6, 0, 5, 1, 7, 3, 9};
        int[] tempArray = new int[intArray.length];

        System.out.print("Array before sorting: ");
        for (int i = 0; i < intArray.length; i++)
        {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();

        // Test case to show binary search won't work on unsorted data.
        // 8 is the target, 0 and intArray.length are the begin and end
        // indexes of intArray we will look through for the target.
        int pos = recursiveBinarySearch(intArray, 8, 0, intArray.length);
        System.out.println("8 is in array index: " + pos);
        System.out.println("Is this correct? Most likely the answer is wrong...");
        System.out.println();

        // Sort the array with merge sort
        // intArray contains unsorted elements. 0 and intArray.length-1 are the
        // start and end indexes where we will sort elements.
        // Sorted elemented are put in tempArray first, but then it will be
        // copied over to intArray so intArray will be sorted after mergeSort returns.
        mergeSort(intArray, 0, intArray.length - 1, tempArray);

        System.out.print("Array after sorting : ");
        for (int i = 0; i < intArray.length; i++)
        {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();

        // Test binary search again on sorted data.  Should work now.
        pos = recursiveBinarySearch(intArray, 8, 0, intArray.length);
        System.out.println("8 is in array index: " + pos);
        System.out.println("It should be correct now!");
        System.out.println();

        // Test case #13: Print the Pascal Triangle for n rows
        // You probably need two passes.  First is a for loop to
        // print the leading spaces and then use a recursive
        // method to print all numbers.
        System.out.println("[13. Pascal Triangle]");
        System.out.println("=====================");
        System.out.println("4 rows of Pascal Triangle:");
        printPascalTriangle(4);
        System.out.println();

        System.out.println("7 rows of Pascal Triangle:");
        printPascalTriangle(7);
        System.out.println();
    }

    // ===============All methods start here================
    // #1 Sum all natural numbers from 1 up to n
    public static int sumNumbers(int n)
    {
        if (n == 1) {
            return 1;
        }
        else {
            return n + sumNumbers(n);
        }
    }

    // #2 Add all digits of a given number n
    public static int sumDigits(int n)
    {
        if (n / 10 == 0) {
            return 0;
        }
        else {
            int val = (n % 10);
            return val + sumDigits(n/10);
        }
    }

    // #3/#4 Reverse a given string
    public static String reverseString(String str)
    {
        String val = str.substring(str.length()-1);
        if (val.equals("")) {
            return val;
        }
        return val + reverseString(str.substring(0,str.length()-1));
    }

    // #5 Reverse all digits of a given number n
    // Two approaches.  Only implement one of the following 3 methods.
    // Can also "cheat" by treating it as a string!
    // Method 1 - concatenate as a string while doing % and / as a number
    public static String reverseDigits2(int n)
    {
        if (n/10 == 0) {
            return "";
        }
        int val = n % 10;
        return val + reverseDigits2(n/10);
    }

    // Treat n as a string and utilize the reverseString method in #3
    public static String reverseDigits1(int n)
    {
        return reverseString(Integer.toString(n));
    }

    // Method 2 - treat n as a number.
    // You need to print one digit out each time in this method.
    public static void reverseDigits(int n)
    {
        if (n/10 == 0) {
            System.out.print("");
        }
        else {
            System.out.print(n%10);
            reverseDigits(n/10);
        }

    }

    // #6 Convert a decimal numberto a binary number
    public static void binary(int num)
    {
        if (num == 0) {

        } else {
            System.out.print(num%2);
            binary(num/2);
        }

    }

    // #7 Convert a binary number to a decimal number
    static int curr = 1;
    public static int decimal(int num)
    {
        if (num == 0) {

        } else {
            int add = (num % 10) * curr;
            curr *= 2;
            System.out.print(add);
            decimal(num/10);
        }
    }

    // #8 Find exponents
    // The base and the exponent are integers.
    public static int exponent(int base, int exp)
    {
        if (exp == 0) {
            return 1;
        } else {
            return base * exponent(base, exp-1);
        }
    }

    // #9 Find Logarithms - due to rounding, limit parameter to only positive int
    public static int logarithm(int log, int base)
    {
        
    }

    // #10 Find GCF of a and b using Euclid's Algorithm
    public static int gcf(int a, int b)
    {
    }

    // #11 Find n terms of Fibonacci sequence
    public static int fibonacci(int n)
    {
    }

    // #12 Merge Sort
    public static void mergeSort(int[] arr, int from, int to, int[] temp)
    {
    }

    // Merge two arrays - array index range is [from] to [to]
    // temp is an array to hold the sorted elements.
    // Need to copy temp to arr once the sorting is completed.
    public static void merge(int[] arr, int from, int mid, int to, int[] temp)
    {
    }

    // #12 Binary search - return the index of the target
    // start and end are the array indexes that we will look through for the target.
    public static int recursiveBinarySearch(int[] arr, int target, int start, int end)
    {
    }

    // #13 Print the Pascal Triangle for n rows
    /**
     * n = 1, print (a+b)^0
     *                                      1
     * n = 2, print (a+b)^1
     *                                      1
     *                                     1 1
     * n = 3, print (a+b)^2
     *                                      1
     *                                     1 1
     *                                    1 2 1
     */

    public static void printPascalTriangle(int n)
    {
    }

}

