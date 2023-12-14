import java.util.Scanner;

public class studentgradecalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Validate the number of subjects
        if (numSubjects <= 0) {
            System.out.println("Invalid number of subjects. Exiting.");
            return;
        }

        // Initialize variables
        int totalMarks = 0;

        // Input marks for each subject
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for Subject " + i + " out of 100: ");
            int marks = scanner.nextInt();

            // Validate marks (assume marks are out of 100)
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks. Marks should be between 0 and 100. Exiting.");
                return;
            }

            // Sum up the total marks
            totalMarks += marks;
        }

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / numSubjects;

        // Determine the grade based on the average percentage
        char grade = calculateGrade(averagePercentage);

        // Display the results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        // Close the scanner
        scanner.close();
    }

    private static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return 'A';
        } else if (averagePercentage >= 80) {
            return 'B';
        } else if (averagePercentage >= 70) {
            return 'C';
        } else if (averagePercentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}


