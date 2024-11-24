package com.array;

public class ArrayUtitlities {
    public static void display(int[] array) {
    //System.out.println("displaying each element of the array ");
        System.out.println();
        for (int element : array) {
            System.out.println(element + " ");
        }
        System.out.println();
    }

      

    public static void printPrompt(int index) {
        System.out.print("Enter Number " + (index + 1) + ": ");
    }
   
    public static int search(int[] array, int search) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == search) {
                return i;
            }
        }
        return -1;
    }

    public static int totalOfElements(int[] array) {
        int total = 0;
       // System.out.println("Adding elements of the array:");
       // System.out.println();
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        //    System.out.println("Adding " + array[i] + " -> Running total: " + total);
        }
        System.out.println("Sum of arrays elements : " + total);
        System.out.println();
        return total;
        
    }
}