import java.util.Scanner;

public class LeapYearCounter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String year;
        System.out.print("Enter year: ");
        year = s.nextLine();

        System.out.print(checker(year));

        s.close();
    }

    public static String checker(String year) {
        double years = Double.parseDouble(year);

        if (years % 4 != 0) {
            return "Year " + year + " is NOT a Leap Year";
        }

        if (years % 100 != 0) {
            return "Year " + year + " is a Leap Year";
        }

        if (years % 400 == 0) {
            return "Year " + year + " is a Leap Year";
        } else {
            return "Year " + year + " is NOT a Leap Year";
        }
    }
}