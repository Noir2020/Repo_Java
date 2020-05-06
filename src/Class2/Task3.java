package Class2;

public class Task3 {

    public static void main(String[] args) {
        /*
         * Store your first name in a string variable.
         * Calculate the length of your name.
         * Note: without using length() method of String class.
         */

        String myFirstName = "Mariya";
        int lastIndexOfa = myFirstName.lastIndexOf('a');
        int sum = lastIndexOfa + 1;

        System.out.println("The length of my name is " + sum + " letters");



        //Correction for Task3
        /* "If this is the solution for:
            Calculate the length of your name
            without using length() method of String class
            then try to use split method to get each letter as an element of array.
            then calculate length of array (using array.length)


            String myFirstName = "Mariya";
            String[] letters = myFirstName.split("");
            int lengthOfName = letters.length;
            System.out.println("The length of my name is: " + lengthOfName);
         */


    }
}
