import java.util.Scanner;
import java.util.LinkedList;
import java.util.Collections;

/**
 * Class reads a list of numbers from the user input using Scanner class.
 * Then saves those very numbers into an Integer LinkedList.
 * LinkedList is then sorted in ascending order using the Collections Framework.
 * 
 * @author Mayra Mavarez Finol
 * @version 1.0.0
 * @since Week 4 of CSC6301
 */
 public class SortLinkedList {
    /**
     * The main method of the program.
     * 
     * @param arg The command-line arguments (not used in this program).
     * @see java.util.Scanner
     * @see java.util.LinkedList
     * @see java.util.Collections
     */
    public static void main(String[] arg){
   
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Prompt for user input string to arrary 
        System.out.print("Enter list of integers:\n"); 
        System.out.print("Please use one line and seprated with spaces \nex.4 2 1\n"); 
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        
        // Add to linked list
        for (String str : inputArray) {
            linkedList.add(Integer.parseInt(str));
        }
        // Sort linked list from smallest to largest
        Collections.sort(linkedList);

        // Display the sorted list 
        System.out.println("Sorted Linked List:");
        System.out.println(linkedList);

        scanner.close();
    }
 }