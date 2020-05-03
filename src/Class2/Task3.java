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

    }
}
