package ReviewTest;

import java.util.Arrays;

public class MidTermTestReview {


    public static void main(String[] args) {

        /**

         Java Arrays. Arrays are used to store multiple values in a single variable,
         instead of declaring separate variables for each value.

         int[] grades;
         String[] names;
         char[] letters;
         -------------->
         we just declared arrays but not initialized them yet


         Method 1 to initialize an array:

         int[] grades = new int[23];
         --------------------------->
         -we assigned an array to data, in [23] a number of elements we can store in array
         -if we use this method to initialize an array, we always have to set a size of that array
         -all 23 elements have a 0 value for now
         -to assign a value to an element we have to access every element individually, for example:
         grades[8] = 70;
         grades[11] = 88;
         grades[21] = 91;
         ...............
         --------------->
         we accessed an element at index 8 and assigned a value of 70
         we accessed an element at index 11 and assigned a value of 88
         we accessed an element at index 21 and assigned a value of 91
         the elements we didn't access and assign a value to them stay 0


         Method 2 to initialize an array:

         int[] grades = {3,6,1,44,9,28,55,7};
         ----------------------------------->
         -we know the value of all elements but we don't know how many elements we will have in array (a size of array), it's okay!
         -this method is good if we know the values upfront




         Difference:


         Method 1                                                   Method 2
         int[] grades = new int[23];                                int[] grades = {3,6,1,44,9,28,55,7};
         .............
         grades[8] = 70;
         grades[11] = 88;
         grades[21] = 91;
         ..............
         ----------------------------------------------------------------------------------------------------------->


         If we don't know the values upfront we can use Method 1 to fill an array with the help of
         some kind of dynamic and creative way (for example with the help of: for-loop).
         **/


        int[] grades = new int[23];
        grades[8] = 70;
        System.out.println(grades[8]);
        // Method 1 to initialize an array
        // 70

        int[] numbers = {3, 6, 1, 44, 9, 28, 55, 7};
        System.out.println(Arrays.toString(numbers));
        // Method 2 to initialize an array with already known values
        // [3, 6, 1, 44, 9, 28, 55, 7]

        int[] num = new int[11];
        System.out.println(Arrays.toString(num));
        // we initialized an array and set a size for it but we didn't assign any value to any single element of this array
        // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        for (int i = 0; i < 11; i++) {
            num[i] = 3;
        }
        System.out.println(Arrays.toString(num));
        // using for-loop we assigned 3 to every single element in the array
        // [3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]


        // How would we search through an array if we have hundreds of elements?
        int[] num1 = {5, 23, 32, 44, 97, 6, 11, 74, 3};
        for (int i = 0; i < num1.length; i++) {
            // .length is very handy here. Instead of counting elements manually we can simply write num1.length
            if (num1[i] == 6) {
                System.out.println("FOUND! At index: " + i);
            }
        }


        // How would we search through an array to find the number of times an element appears in an array?
        int[] num2 = {5, 23, 32, 44, 97, 6, 11, 74, 3, 44, 15, 44, 0, 2, 44};
        int find = 44;
        int numberAppearedInArray = 0;
        for (int i = 0; i < num2.length; i++) {
            if (num2[i] == find) {
                numberAppearedInArray++;
            }
        }
        System.out.println("Number " + find + " FOUND! " + numberAppearedInArray + " times.");


        // How can we sort an array?
        int[] unsorted = {99, 4, 51, 3, 85, 11, 38};
        for (int i = 0; i < unsorted.length - 1; i++) {
            // Lets start with index 0. What number we have? 99. Lets compare number 99 with other numbers, one by one.
            for (int j = i + 1; j < unsorted.length; j++) {
                // What number we will start to compare our number 99 with? With number 4! Then with number 51 and so on.
                if (unsorted[j] < unsorted[i]) {
                    // The 1st for-loop we started with index 0, the 2nd for-loop we started with index 1. To do what?
                    // To compare! And move around to sort the array starting with the smallest number.
                    // Lets assume every j is smaller i
                    int temporaryStorePlace = unsorted[j];
                    // j is waiting to be moved in case if it gets smaller than i.
                    unsorted[j] = unsorted[i];
                    // We guess j is smaller than i and i gives away its place in the array.
                    // The i's place becomes j's permanent place
                    unsorted[i] = temporaryStorePlace;
                    // i cannot just disappear. It goes to j's temporary place. It can be compared again an be moved around.
                }
            }
        }
        System.out.println(Arrays.toString(unsorted));


        // How we would return an array after removing a specific value from a given int array?
        // Original array: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}
        // Remove: 24
        // Returned array: {32, 14, 98, 56, 148, 78}

        // {32, 14, 24, 98, 24, 56, 148, 24, 78, 24} ---> {32, 14, 98, 56, 148, 78}
        // The length of array will change.
        // We don't have a direct method to delete an element, shrink an array and display it in a shorter way.
        // We have to do some manipulation.

        // Basically we will have a new array where we will store the values except the one we will remove
        // We know 2 methods to initialize a new array:
        //    1: int[] array1 = {148, 24, 78, 24, 32, 14, 24, 98,}; We know all our values, we just store them!
        //    2: int[] array2 = new int[size]; We always have to give a size in this method!
        // For our question, we are going to use Method 2. And we will give a meaningful name: int[] returnedArray = new int[size];

        // What would be a size? We don't know if the value we want to remove occurs in the array 1 time or multiple times.
        // Depending on that the size of a new array can change accordingly. Let's find out!
        // From the exercises before we know how to find an element and count how many times it occurs in a given array.


        int[] originalArray = {32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
        int removeValue = 24;
        int getRemoveValueCount = 0;
        int tempPlace = 0;
        int j=0;
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] == removeValue) {
                getRemoveValueCount++;
            }
        }
        System.out.println("Number " + removeValue + " FOUND! " + getRemoveValueCount + " times.");

        // Our specific number 24 occurs in the array 4 times!
        // So, our new array's size will be size-4 OR size-getRemoveValueCount.
        // If we apply all our knowledge together the correct size for our new array will be:
        // int[] returnedArray = new int[originalArray.length-getRemoveValueCount];

        int[] returnedArray = new int[originalArray.length-getRemoveValueCount];
        // Now, we are going to assign values to our new array. We cannot just randomly transfer those values.
        for (int i = 0; i < originalArray.length; i++) {
            // Let's loop original Array
            if(originalArray[i] != removeValue){
                // If no value in original array matches the value we want to remove
                // we will transfer this value to a reserved for it place
                tempPlace = originalArray[i];
                // Let's hold the transferred value in this place before it goes into a new array
                // tempPlace is like our carriage which will store and take a value to a new place, and later a new place
                // will be filled with a value that tempPlace would bring to it.
                if(returnedArray[j] == 0){
                // As from theory above, when we create an array with a fixed size, all our elements have a value = 0.
                // To assign a value to an element we have to access this element individually.
                   returnedArray[j] = tempPlace;
                   // Here, we access an element of our new array and assign an element.
                   // tempPlace variable holds a value that we store from original array.
                   j++;
                   // the for-loop will help to store the values one by one.
                }
            }
        }
        System.out.println(Arrays.toString(originalArray));
        System.out.println(Arrays.toString(returnedArray));
    }
}


