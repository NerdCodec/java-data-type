import java.util.Scanner;

public class speed {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt for distance
        System.out.print("Enter the distance covered (in meters): ");
        int distance = scanner.nextInt();

        // Prompt for time
        System.out.print("Enter the time taken (in seconds): ");
        int time = scanner.nextInt();

        // Calculate speed
        if (time != 0) { // Avoid division by zero
            int speed = distance / time;
            System.out.println("The speed is: " + speed + "m/s");
        } else {
            System.out.println("Time cannot be zero.");
        }

        // Close the scanner
        scanner.close();
    }
}
