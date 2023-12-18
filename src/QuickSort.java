import java.util.Arrays;

public class QuickSort {

    static void sorted(int[] inputArray, int lowIndex , int highIndex){


        if(lowIndex >= highIndex){
            return;
        }
        int pivotValue =  inputArray[highIndex];

        int leftPointer = lowIndex;

        int rightPointer = highIndex -1;


        while (leftPointer < rightPointer) {

            while(inputArray[leftPointer] <= pivotValue && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (inputArray[rightPointer] > pivotValue && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(inputArray, leftPointer, rightPointer);

        }

        swap(inputArray, leftPointer, highIndex);

        sorted(inputArray, lowIndex, leftPointer -1);
        sorted(inputArray, leftPointer + 1, highIndex);


    }


    static  void swap(int[] array, int leftIndex, int rightIndex){

           int temp = array[leftIndex];
           array[leftIndex] = array[rightIndex];
           array[rightIndex]= temp;

    }
}
