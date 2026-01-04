package dsa.arrays;

import java.util.Scanner;

public class Questions {

    // Question: Take an array as input from the user. Search for a given number x and print the index at which it occurs.
    public static void mainn (String args[] ) {
        
        Scanner sc = new Scanner (System.in);

        // Input size of the array
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        System.out.println("Enter the elements of the array: ");
        int numbers[] = new int[size];

        // Input elements in the array
        for ( int i = 0; i < size; i++ ) {
            numbers[i] = sc.nextInt();
        }

        // Input the number to be searched
        System.out.println("Enter the number to be searched: ");
        int x = sc.nextInt();

        // Search for x in the array
        for ( int i = 0; i < size; i++ ) {
            if ( numbers[i] == x ) {
                System.out.println("Number found at index: " + i);
                return;
            }
        }
        
        // If number is not found
        System.out.println("Number not found in the array.");
        sc.close();
    }
}
