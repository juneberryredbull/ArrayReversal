// Eddie Hart
// Feb 5th, 2024
// CSC 1060

// get da scanner
import java.util.Scanner;

public class arrayreversal {
    public static void main(String[] args) {

        // here i define the scanner along with an index and an array to be used for later
        Scanner input = new Scanner(System.in);
        int index = 0;
        int[] numberHolder = new int[100];
        System.out.print("Enter values (-1 to stop)\n:");
        int userInput = input.nextInt();

        // this while loop keeps prompting users for inputs until they enter -1 to stop the loop
        while (userInput != -1) {
            numberHolder[index] = userInput;
            index++;
            System.out.print(":");
            userInput = input.nextInt();
        }

        // here i hold the index as finalIndex so that the for loop can stop at the last indexed input
        // i needed to do that so that i can subtract 1 from the index everytime the for loop runs to display the inputs in reverse order
        System.out.println("Your reversed values: ");
        int finalIndex = index;
        for (int c = 0; c < finalIndex; c++) {
            System.out.println(numberHolder[index-1]);
            index--;
        }


    }
}