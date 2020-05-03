
//Store your first name in a variable, and display the following:

            /*
             1. Display length of the first name.
             2. Does your name starts with "K" (Considering cases)
             3. First alphabet of your name
             4. Does your name ends with "M" (Ignoring cases)
            */

package Class2;

public class Task1 {

    public static void main(String[] args) {


        // 1.Store your first name in a variable and display length of the first name.

        String firstName = "Mariya";

        int firstNameLength = firstName.length();
        System.out.println("The length of my first name is: " + firstNameLength);

        // 2.Does your name starts with "K" (Considering cases)

        boolean doesStartsWith = firstName.startsWith("K");
        System.out.println("Does my first name starts with 'K'? " + doesStartsWith);

        // 3.First alphabet of your name

        char firstLetterOfName = firstName.charAt(0);
        System.out.println("The first letter of my name is: " + firstLetterOfName);

        // 4.Does your name ends with "M" (Ignoring cases)

        String firstNameUpper = firstName.toUpperCase();
        boolean ignoringCase = firstNameUpper.endsWith("M");
        System.out.println("Does my first name end with 'M'? " + ignoringCase);

    }
}



