package PredavanjeII;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak5 {
    static public void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter array lenght: ");
        int listLenght = getUserInput(input);

        if(listLenght == 0){
            System.out.println("You don't have anything in your list!");
            input.close();
            return;
        }

       ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();

        System.out.println("Enter numbers in the list: ");
        for(int i = 0; i < listLenght; i++){
            int listNum = getUserInput(input);
            listOfNumbers.add(listNum);
        }

        Collections.sort(listOfNumbers);

        System.out.println("Which number do you want to check if t's in the list: ");
        int x = getUserInput(input);
        int index = Collections.binarySearch(listOfNumbers, x);


        if(index >= 0 && index < listOfNumbers.size() && listOfNumbers.get(index) == x){
            System.out.println("Your number is in the list!");
        }
        else{
            System.out.println("Your number is not in the list!");
        }


        System.out.println("The first numbers of your list are: ");
        //dok ima u listi brojeva i manje od 5 ih je ispisuj brojeve

        for(int i = 0; i < listOfNumbers.size() && i < 5; i++){
            System.out.println(listOfNumbers.get(i));
        }
        input.close();

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
