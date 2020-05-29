package MidTerm;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {


        /**
         * Question 1:
         * Create a method to return an array after remove a specific value from a given int array.
         * Original array: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}    Remove: 24
         * Returned array: {32, 14, 98, 56, 148, 78}
         *
         * Input array:     {1, 2, 4, 3, 1, 6, 1}    Remove: 11
         * Returned Array:  {1, 2, 4, 3, 1, 6, 1}
         */


        /**
         * Question 2:
         * Create a method to return missing smallest positive integer (greater than 0) from given array.
         * Example:
         * 	For array : {1, 3, 5, 4, 2, 7}
         * 	Method should return : 6
         *
         * 	For array : {-1, -3, 4, 2}
         * 	Method should return : 1
         *
         * 	For array : {0, 5, -1, 1, 2, 5, 3, 7, 1, 2}
         * 	Method should return : 4
         */


        /**
         * Question 3:
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
         *
         */

/*
        int[] origArray = {32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
        int rNumber = 24;
        System.out.println(Arrays.toString(removeN(origArray, rNumber)));


        // This method is working for first 2 arrays. It doesn't work for this one: {0, 5, -1, 1, 2, 5, 3, 7, 1, 2}
        int[] num1 = {-1, -3, 4, 2};
        int[] num2 = {1, 3, 5, 4, 2, 7};
        int[] num3 = {0, 5, -1, 1, 2, 5, 3, 7, 1, 2};
        System.out.println(missingSmallestNum(num2));
*/


        int speedNum = 88;
        int overSpeed = 5;
        int speedCount = speedNum + overSpeed;
        if (speedCount > 88 && speedCount >= 178) {
            System.out.println("User speed = " + speedCount + ";" + "21 points (License suspended");
        } else if (speedCount > 85 && speedCount <= 88) {
            System.out.println("User speed = " + speedCount + ";" + " gets 3 point");
        } else if (speedCount >= 80 && speedCount <= 85) {
            System.out.println("User speed = " + speedCount + ";" + " gets 1 point");
        } else if (speedCount >= 75 && speedCount <= 80) {
            System.out.println("User speed = " + speedCount + ";" + " gets 1 point");
        } else if (speedCount >= 71 && speedCount <= 75) {
            System.out.println("User speed = " + speedCount + ";" + " gets 1 point");
        } else if (speedNum <= 70) {
            System.out.println("Thank you for driving within the speed limit");
        } else {
            System.out.println("");
        }
    }



        public static void removeN ( int[] array1, int removeNum){
            for (int k = 0; k < array1.length; k++) {
                if (array1[k] == removeNum) {
                    //if this condition is true, we remove an element
                    array1[k] = array1[k + 1];
                    //if we remove the element, we will replace it immediately with the nex upcoming one.
                    array1[k + 1] = 0;
                    //next element we assign with 0.
                }
            }
            for (int k = 0; k < array1.length; k++) {
                System.out.println(array1[k]);
            }
        }


        public static int[] missingSmallestNum ( int[] num){
            int start = num[0];
            int end = num[num.length - 1];
            boolean isMissing = false;

            for (int i = start; i < end; i++) {
                for (int j = 0; j < num.length - 1; j++) {
                    if (i == num[j]) {
                        isMissing = false;
                        break;
                    } else
                        isMissing = true;
                }
                if (isMissing && i > 0)
                    System.out.println(i);
            }
            return num;
        }
    }





















