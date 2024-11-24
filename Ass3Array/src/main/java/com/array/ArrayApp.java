package com.array;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class ArrayApp 
{
    public static void main( String[] args )
    {
    
    
      // Prompt for array elements
      int size;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the size of the array: ");
      
      size = input.nextInt();
      int[] myArray = new int[size];
      
      
    for (int i = 0; i < size; i++) {
        ArrayUtitlities.printPrompt(i); // Prompt for each element
        myArray[i] = input.nextInt();
    }


        // Display the array elements
        System.out.println("\nElements in array:");
        ArrayUtitlities.display(myArray);
        
       // System.out.println("\nSum of array elements:");
        ArrayUtitlities.totalOfElements(myArray);
        
        while (true) {
            // Prompt the user to enter a number to search
            System.out.print("Enter the number to search: ");
            int numberToSearch = input.nextInt();

            // Call the search function
            int index = ArrayUtitlities.search(myArray, numberToSearch);

            // Display the result
            if (index != -1) {
                System.out.println("Element  " + numberToSearch + " found at index: " + (index + 1)); // Index is zero-based, so add 1 to display the correct position.
            } else {
                System.out.println("Element  " + numberToSearch + " not found");
            }

            // Ask the user if they want to continue
            System.out.print("Do you want to continue? (Y/N): ");
            String choice = input.next();

            // Exit the loop if the user enters "no"
            if (choice.equalsIgnoreCase("N")) {
                System.out.println("Goodbye!");
                break;
            }
        }
  
        input.close();
    
    }
}
