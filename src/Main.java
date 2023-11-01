import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = random.nextInt(100) + 1;
        }

        System.out.print("DataPoints: ");
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();

        int sum = 0;
        for (int value : dataPoints) {
            sum += value;
        }
        double average = (double) sum / dataPoints.length;
        System.out.println("The average of the array is: " + average);
        System.out.println("The sum of the array is: " + sum);

        int userValue = SafeInput.getRangedInt(in,"Enter an integer between 1 and 100", 1, 100);

        int count = 0;
        for (int value : dataPoints) {
            if (value == userValue) {
                count++;
            }
        }
        System.out.println("The user's value was found " + count + " times in the array.");

        int userValue2 = SafeInput.getRangedInt(in,"Enter another integer between 1 and 100", 1, 100);

        int position = -1;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue2) {
                position = i;
                break;
            }
        }
        if (position != -1) {
            System.out.println("The value " + userValue2 + " was found at array index " + position);
        } else {
            System.out.println("The value " + userValue2 + " was not found in the array.");
        }

        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int value : dataPoints) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }
        System.out.println("Minimum value in the array: " + min);
        System.out.println("Maximum value in the array: " + max);

        double avg = getAverage(dataPoints);
        System.out.println("Average of dataPoints is: " + avg);
    }

    public static double getAverage(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return (double) sum / values.length;
    }
}