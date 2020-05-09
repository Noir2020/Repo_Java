package Class4;

public class Abbreviation {

    public static void main(String[] args) {


        /*
         * Write code to create abbreviation for any given string
         * Example: String msg = "Outfit of the day"
         * Expected: OOTD
         * String msg = "have a great day to you"
         * Expected: HAGDTY
         *
         * //code
         *
         * System.out.println("Abbreviation : " + abr);
         */

        // #1. A way to solve a problem.
        // It would get complicated if our length gets too long

        String msg = "have a great day to you";

        String[] words = msg.split(" ");
        words[0] = words[0].substring(0, 1).toUpperCase();
        words[1] = words[1].substring(0, 1).toUpperCase();
        words[2] = words[2].substring(0, 1).toUpperCase();
        words[3] = words[3].substring(0, 1).toUpperCase();
        words[4] = words[4].substring(0, 1).toUpperCase();
        words[5] = words[5].substring(0, 1).toUpperCase();

        msg = words[0] + words[1] + words[2] + words[3] +
                words[4] + words[5];


        System.out.println("Abbreviation: " + msg);


        // #2.Another way to solve a problem.
        /*
            This way will handle any length.
            We can add values to a string or delete them,
            our code will take care of it.
        */


        String msg1 = "have a great day to you";
        String[] wds = msg1.split(" ");
        String abr = "";


        for (int i = 0; i < wds.length; i++) {
            abr = abr + wds[i].toUpperCase().substring(0, 1);
        }
        System.out.println("Abbreviation: " + abr);

    }
}



