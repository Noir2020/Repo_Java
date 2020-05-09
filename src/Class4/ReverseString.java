package Class4;

public class ReverseString {


    public static void main(String[] args) {


        /*

         Reverse a string

         String message = "happy holidays";
         Expected: syadiloh yppah
         Print: ("Message : " + message)
         Print: ("Message in reverse: " + reverseMessage)

         */

         String message = "happy holidays";
         String[] letters = message.split("");
         String reverseMessage = "";

         System.out.println("Message : " + message);

         for(int i = letters.length-1; i >= 0; i--) {
             reverseMessage = reverseMessage + letters[i];
         }
         System.out.println("Message in reverse: " + reverseMessage);
    }
}
