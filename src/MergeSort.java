import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {

    final  int[] unSortedArray;

    public MergeSort(int[] unSortedArray) {
        this.unSortedArray = unSortedArray;
    }


    public void mergeSort(int[] inputArray){

        if(inputArray.length <= 1) {
            return;
        }

        int halfLength  =  inputArray.length /2;

        int secondHalfLength =  inputArray.length - halfLength;

        int[] leftHalf = new int[halfLength];

        int[] rightHalf = new int[secondHalfLength];

        for (int i =0; i < halfLength; i++){
            leftHalf[i] = inputArray[i];
        }

        for (int j=halfLength; j < inputArray.length; j++){
            rightHalf[j - halfLength] = inputArray[j];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merger(inputArray, leftHalf, rightHalf);
    }



    private void  merger(int[] input, int[] leftHalf, int[] rightHalf) {

        int arr = 0, left = 0, right = 0;


        while (left < leftHalf.length && right < rightHalf.length) {

            if (leftHalf[left] > rightHalf[right]) {

                input[arr] = rightHalf[right];

                right++;

            } else {

                input[arr] = leftHalf[left];

                left++;

            }

            arr++;
        }

        while (left < leftHalf.length) {
            input[arr] = leftHalf[left];
            left++;
            arr++;

        }
        while (right < rightHalf.length) {
            input[arr] = rightHalf[right];
            right++;
            arr++;

        }

    }
}
