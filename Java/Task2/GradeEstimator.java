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
