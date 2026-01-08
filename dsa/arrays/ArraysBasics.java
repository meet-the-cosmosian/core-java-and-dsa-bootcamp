public class ArraysBasics {
        public static void mainn (String args[] ) {

            // Declare and initialize an array
            int numbers[] = {10, 20, 30, 40, 50};

            // Print the elements of the array
            System.out.println("Elements of the array are:");

            // Loop se print
            for ( int i = 0; i < numbers.length; i++ ) {
                System.out.println(numbers[i]);
            }

            // Print the length of the array
            System.out.println("Length of the array is: " + numbers.length);

            // Accessing elements using index
            System.out.println("Element at index 2 is: " + numbers[2]);

            // Modifying an element
            numbers[2] = 100;

            System.out.println("After modifying, element at index 2 is: " + numbers[2]);

            // Print the modified array
            System.out.println("Modified array elements are:");

            // Loop se print
            for ( int i = 0; i < numbers.length; i++ ) {
                System.out.println(numbers[i]);
            }   

            System.out.println("Modified array elements are:");

        }
}
