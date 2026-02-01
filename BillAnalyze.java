import java.util.Scanner;

public class BillAnalyze {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        double highestBill = 0;
        double lowestBill = Double.MAX_VALUE;
        double sum = 0;
        int ctr = 0;
        System.out.println();
        System.out.println();
        while (true) {
            System.out.print("Enter Bill Amount (or 0/negative to stop): ");
            String input = s.nextLine();

            if (input.equalsIgnoreCase("no")) {
                break;
            }

            double currentBill = Double.parseDouble(input);

            if (currentBill <= 0) {
                break;
            }

            sum += currentBill;
            ctr++;

            if (currentBill > highestBill) {
                highestBill = currentBill;
            }
            if (currentBill < lowestBill) {
                lowestBill = currentBill;
            }
        }

        if (ctr > 0) {
            System.out.println("\n--- Analysis ---");
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + (sum / ctr));
            System.out.println("Highest: " + highestBill);
            System.out.println("Lowest: " + lowestBill);
        } else {
            System.out.println("No valid bills were entered.");
        }

        s.close();
    }
}