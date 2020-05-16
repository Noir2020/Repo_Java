package Class5;

public class Methods {


    public static void main(String[] args) {

        double[] numbers = {1,2,6,9,3,6,7,8,22};
        double numbersAverage = averageNumber(numbers);
        System.out.println("Average of the given array: " + numbersAverage);




        int[] numbers1 = {45, 22, 11, 65, 189, 91, 100, 81};
        System.out.println("Maximum value in the given array: " + maximum(numbers1));



        //This code is not working properly. I tried everything I couldn't figure out why.
        //At least, maybe logic is on a right path.
        /*
         for (int i = 0; i < names.length; i++) {
            boolean findName = names[i].equalsIgnoreCase(nameToSearch);
            if (findName == true) {
                System.out.println(nameToSearch + " is on position: " + "#" + namePosition(names, nameToSearch));
            } else {
                System.out.println(nameToSearch + " is not present in the array");
            }
        }

         */


        String[] names = {"john", "michael", "dora", "philip", "ilena", "palena", "fahry"};
        String nameToSearch = "philip";
        System.out.println(namePosition(names, nameToSearch));


        int[] scores = {90, 89, 191, 100, 81};
        String[] names2 = {"Happy", "Peace", "Jesse", "Kaitlin", "Lucky"};
        System.out.println(nameOfStudentMaxScore(scores, names2));


    }



    // Create a method to find average of an int-array
    /* (Before review)

    public static int averageNumber(int[] array){
        int total = 0;
        for(int value:array){
            total = total + value;
        }
        return total/array.length;
    }

     */

    // (After review)
    public static double averageNumber(double[] array){
        double total = 0;
        for(double value:array){
            total = total + value;
        }
        return total/array.length;
    }



    // Create a method to find maximum value in the given int-array
    public static int maximum(int[] numbers1) {
        int maxValue = numbers1[0];
        for (int i = 1; i < numbers1.length; i++) {
            if (maxValue < numbers1[i]) {
                maxValue = numbers1[i];
            }
        }
        return maxValue;
    }



    // Create a method that will tell the position of name of the given array
    /* (Before review)
    public static int namePosition(String[] array1, String nameToSearch) {
        int index = 0;
        for (int y = 0; y < array1.length; y++) {
            //if(array1[y] == nameToSearch);
            if (array1[y].equalsIgnoreCase(nameToSearch)) {
                index = y;
                break;
            }
        }
        return index;
    }
    */


    // (After review)
    public static String namePosition(String[] array1, String nameToSearch) {
        int position = 0; // in terms of value, not in terms of index
        String positionString = "";
        for (int y = 0; y < array1.length; y++) {
            if (array1[y].equalsIgnoreCase(nameToSearch)) {
                position = y + 1;
                break;
            }
        }
        if (position > 0) {
            positionString = nameToSearch + " is on position-" + position;
        } else {
            positionString = nameToSearch + " is not present in the array";
        }
        return positionString;
    }



    // Create a method that will tell the name of student with maximum marks/score
    /* (Before review)

    public static void nameOfStudentMaxScore() {
        int[] scores = {90, 89, 191, 100, 81};
        String[] names2 = {"Happy", "Peace", "Jesse", "Kaitlin", "Lucky"};
        names2[0] = names2[0].substring(0, 1).toUpperCase() + names2[0].substring(1).toUpperCase();
        System.out.println(names2[2] + " got the highest score " + maximum(scores));
    }


        Probably I should create 2 "for loops" and make them match/relate, so that when I print
        a maximum score the name of a student with a maximum score would be identified immediately basing on the
        index/position of the score.


        int[] scores = {90, 89, 191, 100, 81};
        String[] names = {"Happy", "Peace", "Jesse", "Kaitlin", "Lucky"};

        for (int i=0; i < scores.length; i++){
        for (int j=0; j < names.length; j++){
        }}

         */

    // (After review)
    public static String nameOfStudentMaxScore(int[] scores, String[] names2) {
            int maxValue = scores[0];
            int scoreIndex = 0;
            String maxResult = "";
            for (int i = 1; i < scores.length; i++) {
                if (maxValue < scores[i]) {
                    maxValue = scores[i];
                    scoreIndex = i;
                }
            }
            maxResult = names2[scoreIndex] + " scored the maximum score (" + maxValue + ")";
            return maxResult;
        }
    }





