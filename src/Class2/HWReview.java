//Homework review and correction

package Class2;


public class HWReview {

    public static void main(String[] args) {

        //Correction for Task2
        //use lastIndex variable to fetch value from words-array


        String myStatement = "I am a good programmer";
        String[] words = myStatement.split(" ");
        int lastIndex = words.length-1;
        String lastWord = words[lastIndex];
        System.out.println("The last word of the sentence is: " + lastWord);


        //Correction for Task3
        /* Deepak: "If this is the solution for:
            Calculate the length of your name
            without using length() method of String class
            then try to use split method to get each letter as an element of array.
            then calculate length of array (using array.length)
         */

        String myFirstName = "Mariya";
        String[] letters = myFirstName.split("");
        int lengthOfName = letters.length;
        System.out.println("The length of my name is: " + lengthOfName);

        


    }
}
