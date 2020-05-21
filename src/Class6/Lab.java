package Class6;

import java.util.Arrays;

public class Lab {



    public static void main(String[] args) {


        /**
         * int[] numbers = {11, 22, 43, 32, 54, 1}
         * sort the given array.
         * [1, 11, 22, 32, 43, 54]
         */

        int[] unsortedNum = {11, 22, 43, 32, 54, 1};
        int[] sortedNum = sortArray(unsortedNum);
        System.out.println(Arrays.toString(sortedNum));

    }

    public static int[] sortArray(int[] num) {
        for(int i=0; i<num.length-1; i++){
            for(int j=i+1; j<num.length; j++){
                if(num[j]<num[i]){
                    int goToTempPlace = num[j];
                    num[j]=num[i];
                    num[i]=goToTempPlace;
                }
            }
        }
        return num;
    }

}

