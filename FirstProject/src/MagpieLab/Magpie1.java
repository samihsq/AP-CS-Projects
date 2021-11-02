package MagpieLab;

/**
 * Magpie1.java  
 *
 * College Board Magpie Chatbot Lab
 * Activity 2: Running a Simplified Magpie Code
 * No interactions yet.  Canned conversation.
 *
 * KC 11/07/2020 Modified from CSAwesome website.
 *
 */

public class Magpie1
{
    // Program entry point
    public static void main(String[] args)
    {
        Magpie1 maggie = new Magpie1();

        System.out.println(maggie.getGreeting());
        System.out.println();
        System.out.println(">My mother and I talked last night.");
        System.out.println(maggie.getResponse("My mother and I talked last night."));
        System.out.println();
        System.out.println(">I said no.");
        System.out.println(maggie.getResponse("I said no!"));
        System.out.println();
        System.out.println(">The weather is nice.");
        System.out.println(maggie.getResponse("The weather is nice."));
        System.out.println();
        System.out.println(">Do you know my brother?");
        System.out.println(maggie.getResponse("Do you know my brother?"));
    }

    // Greeting
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }

    // Based on the statement, get some response
    public String getResponse(String statement)
    {
        String response = "";
        if (statement.indexOf("no") >= 0)
        {
            response = "Why so negative?";
        }
        else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0)
        {
            response = "Tell me more about your family.";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }

    // Canned random responses if the program doesn't have a good response.
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 4;
        int randomNum = (int)(Math.random() * NUMBER_OF_RESPONSES);
        String response = "";

        if (randomNum == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (randomNum == 1)
        {
            response = "Hmmm.";
        }
        else if (randomNum == 2)
        {
            response = "Do you really think so?";
        }
        else if (randomNum == 3)
        {
            response = "You don't say.";
        }
        return response;
    }
}