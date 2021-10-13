package Unit2Lab;

/**
 * The Unit2Lab.Student class represents a student in a student administration system.
 * It holds the student details relevant in our context.
 *
 * @author Michael Kölling and David Barnes
 * @version 2016.02.29
 *
 * Enhanced by KC 10/06/2020
 */
public class Student
{
    // the student's name
    private String name;
    // the student ID, set to Integer to practice with wrapper class
    private Integer id;
    // Unit2Lab.Student's grade
    private int grade;

    /**
     * Create a new student with a given name and ID number.
     * No grade info, but the default for instance varialbe will kick in. (0 for int).
     */
    public Student(String studentName, Integer studentID)
    {
        name = studentName;
        id = studentID;
    }

    /**
     * Create a new student with a given name, ID number and the grade
     */
    public Student(String theName, Integer theID, int theGrade)
    {
        name = theName;
        id = theID;
        grade = theGrade;
    }

    /**
     * Return the full name of this student.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Return the first name of this student.
     */
    public String getFirstName()
    {
        return name.substring(0, name.indexOf(" "));
    }

    /**
     * Return the last name of this student.
     */
    public String getLastName()
    {
        return name.substring(name.indexOf(" ") + 1);
    }

    /**
     * Return the student ID of this student.
     */
    public Integer getStudentID()
    {
        return id;
    }

    /**
     * Return the student's grade.
     */
    public int getGrade()
    {
        return grade;
    }

    /**
     * Set name of this student.
     */
    public void setName(String newName)
    {
        name  = newName;
    }

    /**
     * Set ID of this student.
     */
    public void setStudentID(Integer newID)
    {
        id = newID;
    }

    /**
     * Set student's grade.
     */
    public void setGrade(int newGrade)
    {
        grade = newGrade;
    }

    /**
     * Print the student's name, ID number and grade to the output terminal.
     * Use \t (tab) to separate columns
     */
    public String toString()
    {
        return "Name: " + name + "\tID: " + id + "\tGrade: " + grade;
    }
}