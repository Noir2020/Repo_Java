package ReviewTest;

public class MidTermTestReview2 {


    public static void main(String[] args) {


        int[] arrayMissingValue = {1, 3, 5, 4, 2, 7};
        int missingSmallestN = missingSmallestPositiveNum(arrayMissingValue);



        /**

         Java Boolean.
         Boolean expressions are powerful.
         They are used in conditional statements, such as if, while, and switch.
         When we plan a code where we are going to use in conditional statements, such as if, while, and switch,
         we have to keep in mind boolean expressions.
         Using boolean we let our program do something interesting, we will have more control of bits of code we want to execute.


         Suppose we have a boolean variable "isSummer" and we want an if-statement that runs if isSummer is true.
         Here is one way to write that code:
         if (isSummer == true) {
         ...
         That code works ok, but it is a little longer than necessary.
         It also has a problem, if we accidentally type a single "=" instead of "==":
         if (isSummer = true) {  // BAD bug
         ...
         Unfortunately, the above code compiles fine. When run, it assigns true to isSummer,
         and then the if-statement always passes since the test is always true.
         This bug is very hard to spot, since the "=" looks reasonable.
         A shorter way to write the code, and a good defense against the above bug is to use the boolean variable
         directly without "==" or anything, like this:
         if (isSummer) {
         ...
         Or for not isSummer, just:
         if (!isSummer) {
         ...
         Code that uses the boolean variable directly like that is nice and short.
         ---------------------------------------------------------------------------------------------------------



         Loops
         Loops can execute a block of code as long as a specified condition is reached.
         Loops are handy because they save time, reduce errors, and they make code more readable.

         Java provides three ways for executing the loops. While all the ways provide similar
         basic functionality, they differ in their syntax and condition checking time.

         Java while loop is a control flow statement that allows code to be executed repeatedly
         based on a given Boolean condition.
         The while loop can be thought of as a repeating if statement.
         If the condition evaluates to true then we will execute the body of the loop and go to update expression.

         Java While Loop
         The while loop loops through a block of code as long as a specified condition is true:

         while (boolean condition) {
         // code block to be executed
         }

         While loop starts with the checking of condition.
         If it evaluated to true, then the loop body statements are executed
         otherwise first statement following the loop is executed.
         For this reason it is also called Entry control loop
         Once the condition is evaluated to true, the statements in the loop body are executed.
         Normally the statements contain an update value for the variable being processed for the next iteration.
         When the condition becomes false, the loop terminates which marks the end of its life cycle.
         */


    }



     // Create a method to return missing smallest positive integer (greater than 0) from given array.
     // Example:
     // For array : {1, 3, 5, 4, 2, 7}
     // Method should return : 6
     //
     // For array : {-1, -3, 4, 2}
     // Method should return : 1
     //
     // For array : {0, 5, -1, 1, 2, 5, 3, 7, 1, 2}
     // Method should return : 4



    // We will start searching for the missing smallest positive integer in an array with number 1.
    // Because it is the smallest positive integer. We are generating logic for any given values in array.
    // Number 1 in our question array shouldn't confuse us.
    //
    //                  find 1 in array
    //                      if not found
    //                          break ---> store value in missingInteger
    //                  find 2 in array
    //                         if not found
    //                              break ---> store value in missingInteger
    //                  find 3 in array
    //                         if not found
    //                              break ---> store value in missingInteger
    //                  and so on...


    public static int missingSmallestPositiveNum(int[] arrayMissingValue) {
        int missingInt = 1;
        boolean keepGoing = true;
        while (keepGoing) {
        // If it evaluated to true, then the loop body statements are executed
            keepGoing = false;
            // Otherwise first statement following the loop is executed

            for (int i = 0; i < arrayMissingValue.length; i++) {
                if (arrayMissingValue[i] == missingInt) {
                    missingInt++;
                    // The important point to note when using while loop is that we need to use
                    // increment or decrement statement inside while loop so that the loop variable gets changed on each iteration,
                    // and at some point condition returns false.
                    // This way we can end the execution of while loop otherwise the loop would execute indefinitely.
                    keepGoing = true;
                    break;
                }
            }
        }
        return missingInt;
    }
}
