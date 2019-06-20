package PredavanjeI;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

        //Asking user to enter first operand
        System.out.println("Please enter operand values below: ");
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        double userInput1,userInput2 = 0;

        //Checking is the user input a number
        while (!input1.hasNextDouble()) {
            System.out.println("Please enter valid first operand: ");
            input1.next();
        }
        System.out.println("Please enter second operand: ");
        while (!input2.hasNextDouble()) {
            System.out.println("Please enter valid second operand: ");
            input2.next();
        }

        userInput1 = input1.nextDouble();
        userInput2 = input2.nextDouble();

        System.out.println("Please enter the first letter of the operation you want to perform:\n" +
                "a for addition\n" +
                "s for subtraction\n" +
                "m for multiplication\n" +
                "d for division ");

        Scanner input3 = new Scanner(System.in);
        String operator = input3.next();

        switch(operator){
            case "a":
            case "A":
                System.out.println("Your result is: " + (userInput1 + userInput2));
                break;
            case "s":
            case "S":
                System.out.println("Your result is: " + (userInput1 - userInput2));
                break;
            case "m":
            case "M":
                System.out.println("Your result is: " + (userInput1 * userInput2));
                break;
            case "d":
            case "D":
                System.out.println("Your result is: " + (userInput1 / userInput2));
                break;
            default:
                System.out.println("Cannot recognize the operation!");
        }

        input1.close();
        input2.close();
        input3.close();

    }
}
