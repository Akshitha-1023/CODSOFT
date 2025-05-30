import java.util.Scanner;

public class GradeEstimator {
    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);

        System.out.print("Enter how many subjects you have: ");
        int subjectCount = inputDevice.nextInt();

        int[] scoreArray = new int[subjectCount];

        for (int slot = 0; slot < subjectCount; slot++) {
            System.out.print("Enter marks for subject " + (slot + 1) + " (out of 100): ");
            scoreArray[slot] = inputDevice.nextInt();
        }

        int cumulativeScore = 0;
        for (int score : scoreArray) {
            cumulativeScore += score;
        }

        double meanPercentage = (double) cumulativeScore / subjectCount;

        char gradeSymbol;

        if (meanPercentage >= 90) {
            gradeSymbol = 'A';
        } else if (meanPercentage >= 80) {
            gradeSymbol = 'B';
        } else if (meanPercentage >= 70) {
            gradeSymbol = 'C';
        } else if (meanPercentage >= 60) {
            gradeSymbol = 'D';
        } else {
            gradeSymbol = 'F';
        }

        System.out.println("\n--- Report Card ---");
        System.out.println("Total Marks: " + cumulativeScore + " out of " + (subjectCount * 100));
        System.out.printf("Average Percentage: %.2f%%\n", meanPercentage);
        System.out.println("Final Grade: " + gradeSymbol);

        inputDevice.close();
    }
}
