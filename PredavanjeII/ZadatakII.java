package PredavanjeII;

import java.util.Scanner;

public class ZadatakII {
    public static void main(String args[]) {
        System.out.println("Please enter number the number of students that took the test: ");
        Scanner input = new Scanner(System.in);

        int numOfStudents = getIntInput(input);

        if(numOfStudents == 0){
            System.out.println("OK, bye, bye!");
            return;
        }

        String maxStudentsName = "";
        int maxTestScore = -1;

        for (int i = 1; i <= numOfStudents; i++) {
            System.out.println("Please enter name and test score of " + i + " student: ");

            String studentsName = getStringInput(input);
            int testScore = getIntInput(input);
            if (maxTestScore < testScore) {
                maxTestScore = testScore;
                maxStudentsName = studentsName;
            }

        }

        System.out.println("Student with most points on test is " + maxStudentsName + " and has " + maxTestScore + " points.");
        input.close();
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

    static String getStringInput(Scanner input) {
        while (true) {

            //get user input
            String name = input.nextLine();

            //check if the input is an empty string, in that case continue;
            if (name.equals("")) {
                System.out.println("Empty input is not allowed.");
                continue;
            }

            return name;
        }

    }
}