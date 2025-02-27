import java.util.Random;
import java.util.Scanner;

public class DmvSimulator {
    public static void main(String[] args) {

    System.out.println("Welcome to the DMV!");

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    // Generate a random number between 1 and 200 for the user
    int userNumber = random.nextInt(200) + 1;
    System.out.println("Your number is: " + userNumber + ". Please wait until your number is called.");

    // Call out numbers starting from the next number after user's number and wrap around
    int currentNumber = userNumber % 200 + 1; // Starts after user's number
    while (currentNumber != userNumber) {
        System.out.println("Now serving: " + currentNumber);
        currentNumber = currentNumber % 200 + 1;
    }
    System.out.println("Unfortunately, you don’t have the required paperwork. Please come back with the proper documents.");

    scanner.close();

    }
}