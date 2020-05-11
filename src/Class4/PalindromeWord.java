package Class4;

public class PalindromeWord {

    public static void main(String[] args) {



        /*

        Check if word is palindrome
        String word = "level";
        boolean result = false;

         */

        String word = "level";
        String wordLower = word.toLowerCase();
        String[] letters = wordLower.split("");
        String inReverse = "";



        for(int i = letters.length-1; i >= 0; i--) {
            inReverse = inReverse + letters[i];
        }
        boolean result = wordLower.equals(inReverse.toLowerCase());
        System.out.println("is " + word + " a palindrome: " + result);

    }
}
