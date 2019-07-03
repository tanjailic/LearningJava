package PredavanjeII;

import java.util.Random;
import java.util.Scanner;

public class Zadatak3 {

    public static void main(String srgs[]) {

        //generate loto number
        Random random = new Random();
        int lotoNum = random.nextInt(51);

        Scanner input = new Scanner(System.in);

        //call function that gets a valid user input
        int userInput = 0;

        do{
            userInput = getUserInput(input);
        }
        while(luckyGuess(userInput, lotoNum) == 2);

        input.close();

    }

    static int luckyGuess(int input, int random) {
        if (input == random) {
            System.out.println("You guessed the number!");
            return 0;
        } else if (input <= random + 5 && input >= random - 5) {
            System.out.println("Good try! You were realy close!");
            System.out.println("You're number was " + input + " and the loto number is " + random);
            return 1;
        } else {
            System.out.println("Please try again!");
            return 2;
        }

    }

    //function that gets valid user input
    static int getUserInput(Scanner input) {

        while (true) {
            System.out.println("Please enter a number between 1 and 50.");

            //get user input
            String check = input.nextLine();

            //check if the input is an empty string, in that case continue;
            if (check.equals("")) {
                System.out.println("Empty input is not allowed.");
                continue;
            }

            int userInput = 0;

            //check if input has any char that's not a number, in that case continue;
            if (!check.matches("[0-9]+")) {
                System.out.println("Input has to be a number.");
                continue;
            }
            //parse input to int
            userInput = Integer.parseInt(check);

            //check if the number is between 1 and 50, if not continue;
            if (userInput < 1 || userInput > 50) {
                System.out.println("Number must be between 1 and 50.");
                continue;
            }

            //if all crateria is met return input
            return userInput;

        }

    }

}

