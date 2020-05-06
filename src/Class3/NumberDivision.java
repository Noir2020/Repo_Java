
package Class3;

public class NumberDivision {

    public static void main(String[] args) {

        /*
         * store value in a variable
         * if number is divisible by 3, print "divisible by 3"
         * if number is divisible by 5, print "divisible by 5"
         * if number is divisible by 3 and 5, print "divisible by both"
         * if not divisible by 3 or 5, print the number
         */


        /*
         * number%3 == 0 --> print "divisible by 3"
         * number%5 == 0 --> print "divisible by "
         * number%3 == 0 && number%5 == 0 --> print "divisible by both"
         * number%3 != 0 || number%5 ! = 0 --> print the number
         */


        int number = 6749;

        if (number % 3 == 0) {
            System.out.println("Divisible by 3.");

        } else if (number % 5 == 0) {
            System.out.println("Divisible by 5.");

        } else if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Divisible by both.");

        } else if (number % 3 != 0 || number % 5 != 0) {
            System.out.println("The number is: " + number);

        } else {
            System.out.println("Try again with a new number.");
        }
    }

}
