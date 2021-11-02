package Unit2Lab; /**
 * Unit2.java
 *
 * @author - Samih Qureshi
 * @author - Period 3
 * @author - Id 10023090
 *
 * @author - I received help from nobody.
 *
 */

import java.util.Locale;

public class Unit2 {
    public static void main(String args[]) {

        // created all Student instances
        Student SnowWhite = new Student("Snow White", 1001);
        Student HumptyDumpty = new Student("Humpty Dumpty", 10012);
        Student PrinceCharming = new Student("Prince Charming", 10023);
        Student SleepingBeauty = new Student("Sleeping Beauty", 1004, 90);
        Student HennyPenny = new Student("Henny Penny", 1005, 80);

        // printed out initial attributes of Student instances
        System.out.println(SnowWhite);
        System.out.println(HumptyDumpty);
        System.out.println(PrinceCharming);
        System.out.println(SleepingBeauty);
        System.out.println(HennyPenny);

        // created GAFE for all Student instances by cutting up first, last, and id number
        String SnowWhiteFirst = SnowWhite.getFirstName();
        String SnowWhiteLast = SnowWhite.getLastName();
        String SnowWhiteIdString = String.valueOf(SnowWhite.getStudentID());
        String SnowWhiteGAFE = (SnowWhiteFirst.substring(0, 3) + SnowWhiteLast.substring(0,3) + SnowWhiteIdString.substring(SnowWhiteIdString.length()-3)).toLowerCase();
        // random grade set between 0 and 100 for all Student instances
        SnowWhite.setGrade((int)(Math.random()*101));

        // GAFE + random name for HumptyDumpty
        String HumptyDumptyFirst = HumptyDumpty.getFirstName();
        String HumptyDumptyLast = HumptyDumpty.getLastName();
        String HumptyDumptyIdString = String.valueOf(HumptyDumpty.getStudentID());
        String HumptyDumptyGAFE = (HumptyDumptyFirst.substring(0, 3) + HumptyDumptyLast.substring(0,3) + HumptyDumptyIdString.substring(HumptyDumptyIdString.length()-3)).toLowerCase();
        HumptyDumpty.setGrade((int)(Math.random()*101));

        // GAFE + random name for PrinceCharming
        String PrinceCharmingFirst = PrinceCharming.getFirstName();
        String PrinceCharmingLast = PrinceCharming.getLastName();
        String PrinceCharmingIdString = String.valueOf(PrinceCharming.getStudentID());
        String PrinceCharmingGAFE = (PrinceCharmingFirst.substring(0, 3) + PrinceCharmingLast.substring(0,3) + PrinceCharmingIdString.substring(PrinceCharmingIdString.length()-3)).toLowerCase();
        PrinceCharming.setGrade((int)(Math.random()*101));

        // GAFE + random name for SleepingBeauty
        String SleepingBeautyFirst = SleepingBeauty.getFirstName();
        String SleepingBeautyLast = SleepingBeauty.getLastName();
        String SleepingBeautyIdString = String.valueOf(SleepingBeauty.getStudentID());
        String SleepingBeautyGAFE = (SleepingBeautyFirst.substring(0, 3) + SleepingBeautyLast.substring(0,3) + SleepingBeautyIdString.substring(SleepingBeautyIdString.length()-3)).toLowerCase();
        SleepingBeauty.setGrade((int)(Math.random()*101));

        // GAFE + random name for HennyPenny
        String HennyPennyFirst = HennyPenny.getFirstName();
        String HennyPennyLast = HennyPenny.getLastName();
        String HennyPennyIdString = String.valueOf(HennyPenny.getStudentID());
        String HennyPennyGAFE = (HennyPennyFirst.substring(0, 3) + HennyPennyLast.substring(0,3) + HennyPennyIdString.substring(HennyPennyIdString.length()-3)).toLowerCase();
        HennyPenny.setGrade((int)(Math.random()*101));


        System.out.println();
        // printing attributes for all Student instances, including GAFE and randomized grade
        System.out.println("Name: " + SnowWhite.getName() + "\tID: " + SnowWhite.getStudentID() + "\tGAFE: " + SnowWhiteGAFE + "\tGrade: " + SnowWhite.getGrade());
        System.out.println("Name: " + HumptyDumpty.getName() + "\tID: " + HumptyDumpty.getStudentID() + "\tGAFE: " + HumptyDumptyGAFE + "\tGrade: " + HumptyDumpty.getGrade());
        System.out.println("Name: " + PrinceCharming.getName() + "\tID: " + PrinceCharming.getStudentID() + "\tGAFE: " + PrinceCharmingGAFE + "\tGrade: " + PrinceCharming.getGrade());
        System.out.println("Name: " + SleepingBeauty.getName() + "\tID: " + SleepingBeauty.getStudentID() + "\tGAFE: " + SleepingBeautyGAFE + "\tGrade: " + SleepingBeauty.getGrade());
        System.out.println("Name: " + HennyPenny.getName() + "\tID: " + HennyPenny.getStudentID() + "\tGAFE: " + HennyPennyGAFE + "\tGrade: " + HennyPenny.getGrade());

        System.out.println();

        // total calculated by adding all grades together
        int total = SnowWhite.getGrade() + HumptyDumpty.getGrade() + PrinceCharming.getGrade() + SleepingBeauty.getGrade() + HennyPenny.getGrade();
        // average calculated by dividing total by total students (5)
        double average = total / 5.0;

        // variance calculated through squaring all the differences of the grade and average (squaring is always positive number so no Math.abs() needed)
        double variance = (Math.pow(SnowWhite.getGrade() - average, 2) + Math.pow(HumptyDumpty.getGrade() - average, 2) + Math.pow(PrinceCharming.getGrade() - average, 2) + Math.pow(SleepingBeauty.getGrade() - average, 2) + Math.pow(HennyPenny.getGrade() - average, 2)) / 5;
        // standard deviation calculated through the square root of the variance
        double standev = Math.sqrt(variance);

        // all calculated values printed
        System.out.println("Total: " + total);
        System.out.print("Average: ");
        // formatted all values (except total, which is int) with %.2f formatting
        System.out.printf("%.2f", average);
        System.out.println();
        System.out.print("Variance: ");
        System.out.printf("%.2f", variance);
        System.out.println();
        System.out.print("Standard deviation: ");
        System.out.printf("%.2f", standev);



    }
}
