package ReviewTest;

import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {

        /* Question 1:
         *
         * Create a method to return an array after removing a specific value from a given int array.
         * Original array: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}
         * Remove: 24
         * Returned array: {32, 14, 98, 56, 148, 78}
         *
         * Input array:     {1, 2, 4, 3, 1, 6, 1}
         * Remove: 11
         * Returned Array:  {1, 2, 4, 3, 1, 6, 1}
         */

        int[] originalArray = {32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
        int removeValue = 24;
        System.out.println(Arrays.toString(originalArray));
        // ??? int[] arrayAfterValueRemove = removeValueFromArray(originalArray, removeValue);
        // ??? System.out.println(Arrays.toString(arrayAfterValueRemove));


        /* Question 2:
         *
         * Create a method to return missing smallest positive integer (greater than 0) from given array.
         * Example:
         * For array : {1, 3, 5, 4, 2, 7}
         * Method should return : 6
         *
         * For array : {-1, -3, 4, 2}
         * Method should return : 1
         *
         * For array : {0, 5, -1, 1, 2, 5, 3, 7, 1, 2}
         * Method should return : 4
         */

        int[] arrayMissingValue = {1, 3, 5, 4, 2, 7};
        // ??? int missingSmallestN = missingSmallestPositiveNum(arrayMissingValue);



        /* Question 3:
         *
         * Scenario: Traffic ticketing system
         * Write a method, that will print (not return) the points charged against the license for over speeding.
         *    1. Speed Limit = 70
         *    2. Every 5 miles over the speed limit will add 1 point
         *    3. If user gets 12 points for a speed then license is suspended
         *
         *  Example:
         *      user speed = 78 ; 1 points
         *      user speed = 88 ; 3 points
         *      user speed = 178 ; 21 points (License suspended).
         *      user speed = 70 ; Thank you for driving within the speed limit.
         *
         *      88 -> 3
         *      70
         *      70-75 : 1
         *      75-80 : 1
         *      80-85 : 1
         *      85-88
         */



    }



    // Question 1.
    public static int[] removeValueFromArray(int[] array, int numRemove) {
        int removeNumberCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numRemove) {
                removeNumberCount++;
            }
        }
        int[] returnedArray = new int[array.length - removeNumberCount];
        int tempPlace = 0;
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != removeNumberCount) {
                tempPlace = array[i];
                if (returnedArray[j] == 0) {
                    returnedArray[j] = tempPlace;
                    j++;
                }
            }
        }
        return returnedArray;
    }



    // Question 2
    public static int missingSmallestPositiveNum(int[] arrayMissingValue) {
        int missingInt = 1;
        boolean keepGoing = true;
        while (keepGoing) {
            keepGoing = false;
            for (int i = 0; i < arrayMissingValue.length; i++) {
                if (arrayMissingValue[i] == missingInt) {
                    missingInt++;
                    keepGoing = true;
                    break;
                }
            }
        }
        return missingInt;
    }
}
