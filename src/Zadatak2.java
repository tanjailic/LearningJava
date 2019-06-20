package PredavanjeI;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        //getting input for first operand
        System.out.println("Please enter first operand: ");
        double firstOperand = input.nextInt();
        //getting input for second operand
        System.out.println("Please enter second operand: ");
        double secondOperand = input.nextInt();
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
                System.out.println(firstOperand + secondOperand);
                break;
             //subtraction
            case "s":
                System.out.println(firstOperand - secondOperand);
                break;
            //multiply
            case "m":
                System.out.println(firstOperand * secondOperand);
                break;
            //divide
            case "d":
                if(firstOperand == 0 || secondOperand == 0){
                System.out.println("Division with 0 is not valid!");
                break;
            }
                System.out.println(firstOperand / secondOperand);
                break;
            default:
                System.out.println("Operation is not valid!");

        }
        input.close();
    }

}
