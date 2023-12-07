import java.util.Arrays;

public class SelectionSort {

    public  static int[] sort(int[] unsortedArray){


        for (int i =0; i < unsortedArray.length; i++){
            int smallIndex = i;
            for (int j = i + 1; j < unsortedArray.length; j++){
                if(unsortedArray[smallIndex] > unsortedArray[j]) {
                    smallIndex = j;
                }
            }
            int temp = unsortedArray[smallIndex];
            unsortedArray[smallIndex] = unsortedArray[i];
            unsortedArray[i] = temp;
        }
        return  unsortedArray;
    }
}
