package Class5;

public class Methods {


    public static void main(String[] args) {

        int[] numbers = {1,2,6,9,3,6,7,8,22};
        int numbersAverage = averageNumber(numbers);
        System.out.println("Average of the given array: " + numbersAverage);




        int[] numbers1 = {45, 22, 11, 65, 189, 91, 100, 81};
        System.out.println("Maximum value in the given array: " + maximum(numbers1));


        //This code is not working properly. I tried everything I couldn't figure out why.
        //At least, maybe logic is on a right path.
        String[] names = {"john", "michael", "dora", "philip", "ilena", "palena", "fahry"};
        String nameToSearch = "philip";
        for (int i = 0; i < names.length; i++) {
            boolean findName = names[i].equalsIgnoreCase(nameToSearch);
            if (findName == true) {
                System.out.println(nameToSearch + " is on position: " + "#" + namePosition(names, nameToSearch));
            } else {
                System.out.println(nameToSearch + " is not present in the array");
            }
        }

        nameOfStudent();

    }



    // Create a method to find average of an int-array
    public static int averageNumber(int[] array){
        int total = 0;
        for(int value:array){
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
    public static int namePosition(String[] array1, String nameToSearch) {
        int index = 0;
        for (int y = 0; y < array1.length; y++) {
            if (array1[y] == nameToSearch) {
                index = y;
                break;
            }
        }
        return index;
    }



    // Create a method that will tell the name of student with maximum marks/score
    public static void nameOfStudent() {
        int[] scores = {90, 89, 191, 100, 81};
        String[] names2 = {"Happy", "Peace", "Jesse", "Kaitlin", "Lucky"};
        names2[0] = names2[0].substring(0, 1).toUpperCase() + names2[0].substring(1).toUpperCase();
        System.out.println(names2[2] + " got the highest score " + maximum(scores));



        /*

        Probably I should create 2 "for loops" and make them match/relate, so that when I print
        a maximum score the name of a student with a maximum score would be identified immediately basing on the
        index/position of the score.


        int[] scores = {90, 89, 191, 100, 81};
        String[] names = {"Happy", "Peace", "Jesse", "Kaitlin", "Lucky"};

        for (int i=0; i < scores.length; i++){
        for (int j=0; j < names.length; j++){
        }

         */



    }
}



