package Class4;

public class AfterModification {

    public static void main(String[] args) {


        /*

        String line = "once upOn a tiMe in the UNIVERSE";
        Expected: Once Upon A Time In The Universe
        Print: ("Line before modification:" + line)
        Print: ("Line after modification: " + line)

         */


        String line = "once upOn a tiMe in the UNIVERSE";
        String[] words = line.split(" ");
        String sentence = "";



        System.out.println("Line before modification: " + line);



        for(int i = 0; i < words.length; i++) {
            sentence = sentence + words[i].substring(0,1).toUpperCase() +
                    words[i].substring(1).toLowerCase() + " ";
        }
            System.out.println("Line after modification: " + sentence.trim() + ".");


    }
}
