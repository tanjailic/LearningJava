import java.util.Random;
import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {

        //generate loto number
        Random random = new Random();
        int lotoNum = random.nextInt(51);

        //call function that gets a valid user input
        int userInput = getUserInput();

        //check if user guest loto number
        if (userInput == lotoNum){
            System.out.println("You guessed the number!");
        }
        else if(userInput <= lotoNum + 5 && userInput >= lotoNum - 5){
            System.out.println("Good try! You were realy close!");
            System.out.println("You're number was " + userInput + " and the loto number is " + lotoNum);
        }
        else{
            System.out.println("Better luck next time! The loto number is " + lotoNum + " and you said " + userInput);
        }

    }

    //function that gets valid user input
    static int getUserInput(){
        Scanner input = new Scanner(System.in);

        while(true) {
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
            if(!check.matches("[0-9]+")){
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
            input.close();
            return userInput;

        }

    }

}

