
/*
Create variable to store student-score and total-possible-score based on
the percentage
*/

package Class3;

public class StudentGrade {

    public static void main(String[] args) {

        /*
         * Create variable to store student-score and total-possible-score
         * based on the percentage
         *
         * Display grade to student
         * Grade A: 91-100
         * Grade B: 81-90
         * Grade C: 71-80
         * Grade D: 61-70
         * Grade E: 51-60
         * Grade F: less than or equal to 50
         */




        int studentScore = 107;
        double maxScore = 123;
        double score1OfScore2 = (studentScore/maxScore)*100;


        if (score1OfScore2 >= 91 && score1OfScore2 <= 100) {
            System.out.println("Your percentage: " + score1OfScore2 +
                    " and your grade is: A");

        } else if (score1OfScore2 >= 81 && score1OfScore2 <= 90) {
            System.out.println("Your percentage: " + score1OfScore2 +
                    " and your grade is: B");

        } else if (score1OfScore2 >= 71 && score1OfScore2 <= 80) {
            System.out.println("Your percentage: " + score1OfScore2 +
                    " and your grade is: C");

        } else if (score1OfScore2 >= 61 && score1OfScore2 <= 70) {
            System.out.println("Your percentage: " + score1OfScore2 +
                    " and your grade is: D");

        } else if (score1OfScore2 >= 51 && score1OfScore2 <= 60) {
            System.out.println("Your percentage: " + score1OfScore2 +
                    " and your grade is: E");

        } else if (score1OfScore2 <= 50) {
            System.out.println("Your percentage: " + score1OfScore2 +
                    " and your grade is: F");

        } else {
            System.out.println("Your score is too low. " +
                    "Please, retake the course.");
        }
    }
}
