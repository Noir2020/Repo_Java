
//Use string methods to do following tasks:

           /*
        	1. Fetch the last word of the sentence
         	2. Display the total number of words in the myStatement.
         	3. replace all the 'r' characters with 'f' characters.
           */


package Class2;


public class Task2 {

    public static void main(String[] args) {


        // 1.Fetch the last word of the sentence

        String myStatement = "I am a good programmer";


        String[] words = myStatement.split(" ");
        int lastIndex = words.length-1;
        words[4]=words[4].substring(0);
        myStatement = words[4];
        System.out.println("The last word of the sentence is: " + myStatement);



        // 2.Display the total number of words in the myStatement.
        //String myStatement = "I am a good programmer"

        int totalNumberWords = words.length;
        System.out.println("The total number of words is: " + totalNumberWords);


        // 3.Replace all the 'r' characters with 'f' characters.
        //String myStatement = "I am a good programmer"

        String afterReplace = myStatement.replace("r","f");
        System.out.println("My result after replacing the characters: " + afterReplace);



    }
}
