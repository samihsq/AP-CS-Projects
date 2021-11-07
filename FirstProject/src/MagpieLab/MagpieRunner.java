package MagpieLab;

import java.util.Scanner;

/**
 * MagpieRunner.java for Lab #7
 *
 * @author - Samih Qureshi
 * @author - Period 3
 * @author - Id 10023090
 *
 * @author - I received help from nobody.
 *
 */

public class MagpieRunner
{

    /**
     * Create a Magpie, give it user input, and print its replies.
     */
    public static void main(String[] args)
    {
        // creates Magpie4 object to run commands through
        Magpie4 maggie = new Magpie4();

        System.out.println (maggie.getGreeting());

        // user input
        Scanner in = new Scanner (System.in);
        String statement = in.nextLine();

        while (!statement.equals("Bye"))
        {
            // user input piped into Magpie4's getResponse method
            System.out.println (maggie.getResponse(statement));
            statement = in.nextLine();
        }
    }
}