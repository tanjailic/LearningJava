package PredavanjeII;

//ZADATAK4: Modifikacija digitrona od prošle nedelje: Sve operacije smestiti u posebne metode, i kada je to potrebno pozivati odgovarajucu metodu.
// Vrteti se u petlji, sve dok se za kod operacije ne unese nepostojeci kod (default kod switch-a).

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean finish = true;

        do {
            //getting input for first operand
            System.out.println("Please enter first operand: ");
            double firstOperand = getIntInput(input);

            //getting input for second operand
            System.out.println("Please enter second operand: ");
            double secondOperand = getIntInput(input);

            //getting input for operation which will be performed
            System.out.println("Please enter which operation you would like to perform: \n" +
                    "a for addition\n" +
                    "s for subtraction\n" +
                    "m for multiplication\n" +
                    "d for division");

            String operation = input.next();

            //performing operation
            switch (operation) {
                //addition
                case "a":
                    System.out.println("Your result is: " + addition(firstOperand, secondOperand));
                    break;
                //subtraction
                case "s":
                    System.out.println("Your result is: " + subtraction(firstOperand, secondOperand));
                    break;
                //multiply
                case "m":
                    System.out.println("Your result is: " + multiplication(firstOperand, secondOperand));
                    break;
                //divide
                case "d":
                    if (firstOperand == 0 || secondOperand == 0) {
                        System.out.println("Division with 0 is not valid!");
                    } else {
                        System.out.println("Your result is: " + division(firstOperand, secondOperand));
                    }
                    break;
                default:
                    System.out.println("Operation is not valid!");
                    finish = false;

            }

        }
        while (finish == true);
        input.close();
    }

    static double addition(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }

    static double subtraction(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }

    static double multiplication(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }

    static double division(double firstOperand, double secondOperand) {
        return firstOperand / secondOperand;
    }

    static int getIntInput(Scanner input) {
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
            if (!check.matches("[0-9]+")) {
                System.out.println("Input has to be a number.");
                continue;
            }
            //parse input to int
            userInput = Integer.parseInt(check);

            //if all crateria is met return input
            return userInput;

        }

    }


}