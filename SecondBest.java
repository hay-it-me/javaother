import java.util.Scanner;

public class SecondBest {
    public static void main(String[] args){
        // User enters the 6 digits
        System.out.print("Enter 6 digits: ");
        //Runs the scanner for the first 3 values
        Scanner userInput = new Scanner(System.in);
        int num1 = userInput.nextInt();
        int num2 = userInput.nextInt();
        //Initialise variables.
        int lowest;
        int highest;
        int secondHighest;
        int secondLowest;
        int number;
        //Sorts the first 2 values into highest and lowest.
        if (num1 >= num2) {
            lowest = num2;
            highest = num1;
            secondLowest = num1;
            secondHighest = num2;
        } else {
            lowest = num1;
            highest = num2;
            secondLowest = num2;
            secondHighest = num1;
        }

        // Loop 4 times to scan the remaining 4 numbers
        for (int i = 0; i < 4; i++) {
            number = userInput.nextInt();
            // Checks if it is the highest number, sets number to highest and makes the previous highest as 2nd highest.
            if (number > highest) {
                secondHighest = highest;
                highest = number;
            //Checks if greater than second highest number, if so sets the number to second highest.
            } else if (number > secondHighest) {
                secondHighest = number;
            // Checks if it is the lowest number, sets number to lowest and makes the previous lowest as 2nd lowest.
            } if (number < lowest) {
                secondLowest = lowest;
                lowest = number;
            //Checks if lower than second lowest number, if so sets the number to second lowest.
            } else if (number < secondLowest) {
                secondLowest = number;
            }
        } 
        //Prints out the 2nd highest and 2nd lowest number.
        System.out.println("Second highest number: " + secondHighest);
        System.out.println("Second lowest number: " + secondLowest);
    }
}