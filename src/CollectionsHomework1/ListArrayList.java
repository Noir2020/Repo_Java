package CollectionsHomework1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayList {

    public static void main(String[] args) {

        // Question 1
        // Create a method, that will return all duplicate values in the given String array.
        // String[] words = {"happy", "peace", "joy", "grow", "laugh", "happy", "laugh", "joy"};
        // Result ---> ["happy", "joy", "laugh"]

        String[] words = {"happy", "peace", "joy", "grow", "laugh", "happy", "laugh", "joy"};
        System.out.println(duplicateValuesInArray(words));
        // in comparison with array[], to print arrayList we need only array name



        // Question 2
        // Create a method, that will return the common elements/value in the given int-array
        // int[] arr1 = {11,32,43,54,65};
        // int[] arr2 = {76,11,89,43,87,23,32};
        // Result ---> [11,32,43]

        int[] arr1 = {11,32,43,54,65};
        int[] arr2 = {76,11,89,43,87,23,32};
        System.out.println(commonValues(arr1, arr2));

    }



    public static List <String> duplicateValuesInArray(String[] array){
        List <String> duplicates = new ArrayList<>();
        // we create an ArrayList where we are going to store our duplicate values if there are any
        // As we set our ArrayList datatype to String list, so, all our values should be of String datatype
        // upon creation of this ArrayList it stores 0 values, the length of it 0
        // using .add method we will store values in our ArrayList
        // dealing with array[] we would have to create a new array[] and set a length

        for(int i=0; i<array.length-1; i++){
            // we've seen this method before
            // it simply takes the first value in the array and...
            for(int j=i+1; j<array.length; j++){
                // ...and checks with the rest of the values in the same array starting with one ahead of it
                if((array[i].equals(array[j])) && (i != j)){
                    // duplicate value found
                    duplicates.add(array[i]);
                    break;
                }
            }
        }
        return duplicates;
    }


    public static List <Integer> commonValues(int[] array1, int[] array2){
        List <Integer> commonVal = new ArrayList<>();
        for(int i=0; i<array1.length; i++){
            for(int j=0; j<array2.length; j++){
                if((array1[i] == (array2[j])) && (i != j)){
                    commonVal.add(array1[i]);
                    break;
                }
            }
        }
        return commonVal;
    }

}
