package PredavanjeII;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String args[]) {
        System.out.println("Please enter two numbers in between which you want to get all even numbers: ");

        Scanner input = new Scanner(System.in);

        int startNumber = getUserInput(input);
        int endNumber = getUserInput(input);

        input.close();

        if (startNumber > endNumber) {
            int temp = startNumber;
            startNumber = endNumber;
            endNumber = temp;
        }

        System.out.println("Even numbers are: ");

        while (startNumber <= endNumber) {
            if (startNumber % 2 == 0) {
                System.out.println(startNumber);
            }
            startNumber++;
        }

    }

    static int getUserInput(Scanner input) {

        while (true) {

            //get user input
            String check = input.nextLine();

            //check if the input is an empty string, in that case continue;
            if (check.equals("")) {
                System.out.println("Empty input is not allowed.");
                continue;
            }

            int userInput = 0;

            //check if input has any char that's not a number, in that case continue;
            if (!check.matches("-?[0-9]+")) {
                System.out.println("Input has to be a number.");
                continue;
            }
            //parse input to int
            userInput = Integer.parseInt(check);

            //if all criteria is met return input
            return userInput;

        }

    }

}
