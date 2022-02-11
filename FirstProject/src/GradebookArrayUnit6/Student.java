package GradebookArrayUnit6;

/**
 * Student.java
 *
 * @author - Samih Qureshi
 * @author - Period 3
 * @author - Id 10023090
 *
 *
 */
public class Student
{
    // Declare your PIVs here
    // Name stores full name (first name + " " + last name)
    // Student ID is a String and can have different lengths
    // Student's grade level is an int
    // 5 scores in a double array

    String name;
    String ID;
    int GL;
    double[] scores = new double[5];

    // Constructor - data array size needs to match with # of PIV
    // If you don't use String's split method to process data,
    // you can change the constructor here to suit your needs.
    public Student(String[] data)
    {
        // data is an array with 8 elements.
        // First element is name, 2nd is ID, 3rd is grade level.
        // The next 5 are the scores.
        // They are stored as Strings
        // Need to convert to the correct datatype before you can make
        // a Student object.

        name = data[0];
        ID = data[1];
        GL = Integer.parseInt(data[2]);

        for(int i = 3; i < data.length; i++) {
            // need to subtract by 3 because data starts at the index of 3, but our scores array starts at 0
            scores[i-3] = Double.parseDouble(data[i]);
        }


    }

    // Getters - fill in when necessary
    public String getName()
    {
        return name;
    }

    public String getID()
    {
        return ID;
    }

    public int getGradeLevel()
    {
        return GL;
    }

    // This returns 5 scores in a double array.
    public double[] getScoresArray()
    {
        return scores;
    }

    // Get only one score specified by 1-5
    public double getOneScore(int whichScore)
    {
        return scores[whichScore];
    }

    // Setters - fill in when necessary
    public void setName(String name)
    {
        this.name = name;
    }

    public void setID(String id)
    {
        this.ID = id;
    }

    public void setGradeLevel(int gradeLevel)
    {
        this.GL = gradeLevel;
    }

    // This sets scores array using the passed in array parameter.
    public void setScoresArray(double[] scores)
    {
        for(int i = 0; i < scores.length; i++) {
            this.scores[i] = scores[i];
        }
    }

    // Set only one score specified by 1-5
    public void setOneScore(int whichScore, double score)
    {
        this.scores[whichScore-1] = score;
    }

    // Print out student record with a score avg at the end
    // Each field is separated by "\t" (tab)
    public void printStudentRecord()
    {
        // scoreStr contains all 5 scores as a string (separated by \t)
        // You don't have to do the same if you have a different way
        // to print scores.

        String scoreStr = "";
        double avg = 0;

        for(double score : scores) {
            scoreStr += score + "\t";
            avg += score;
        }

        avg = avg/scores.length;

        System.out.println(name + "\t" + ID + "\t" + GL + "\t" + scoreStr + avg);
    }

    // Allow students to drop one lowest score
    // Print out the record with original avg and new avg
    // Each field is separated by "\t" (tab)
    // The dropped score will have a * next to it
    public void printStudentRecordDropLowest()
    {

            // creating variables for score manipulation
            double avg = 0;
            int cnt = 0;
            double val = 0;
            int counter = 0;
            int index = 0;
            double lowest = 100;

            String scoreStr = "";

            for(double grade:scores) {
                // calculating the lowest grade through less than statement
                if (grade < lowest) {
                    lowest = grade;
                    index = counter;
                }
                counter++;
            }
            for(double indiv:scores) {
                avg += indiv;
                // if the lowest value is found, print a star next to it
                if (cnt == index) {
                    val = indiv;
                    scoreStr += indiv + "*\t";
                } else {
                    scoreStr += indiv + "\t";
                }
                cnt++;
            }

            double oldAvg = avg/scores.length;
            // calculate the modified average by removing the lowest score and reducing the divisor by 1
            double newAvg = (avg-val)/(scores.length - 1);

            System.out.println(name + "\t" + ID + "\t" + GL + "\t" + scoreStr + oldAvg + "\t" + newAvg);
    }
}