import java.util.Scanner;
import java.util.Stack;
import java.util.Collections;

/**
 * Class reads a list of numbers from the user input using Scanner class.
 * Then saves those very numbers into an Integer Stack.
 * Stack is then sorted in ascending order using the Collections Framework.
 * 
 * @author Mayra Mavarez Finol
 * @version 1.0.0
 * @since Week 5 of CSC6301
 */

public class MainClass{
    /**
     * The main method of the program.
     * 
     * @param arg The command-line arguments (not used in this program).
     * @see java.util.Scanner
     * @see java.util.Stack
     * @see java.util.Collections
     */
    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        
        // Prompt for user input string to array 
        System.out.print("Enter list of integers:\n"); 
        System.out.print("Please use one line and separated with spaces \nex.4 2 1\n"); 
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");

        // Add to stack 
        for (String str : inputArray) {
            stack.push(Integer.parseInt(str));
        }
        
        // Sort stack from smallest to largest
        Collections.sort(stack);

        // Display the sorted list 
        System.out.println("Sorted Stack:");
        System.out.println(stack);

        scanner.close();
    }
}