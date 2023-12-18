import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("am running");

         int[] unSortedArray = new int[100000];

        for (int i = 0; i < unSortedArray.length; i++) {
            unSortedArray[i]=  (int)(Math.random() * 100 +1);
        }
        long startTime = System.currentTimeMillis();

//        System.out.println(Arrays.toString(unSortedArray));
//        BubbleSort sortedArray = new BubbleSort(unSortedArray);

//        System.out.println(Arrays.toString(sortedArray.value));


//        int[] selectionSortedArray = SelectionSort.sort(unSortedArray);


//        System.out.println(Arrays.toString(selectionSortedArray));

//        MergeSort mergeSortAlgorithm = new MergeSort(unSortedArray);
//        mergeSortAlgorithm.mergeSort(unSortedArray);
//        System.out.println(Arrays.toString(unSortedArray));



        QuickSort.sorted(unSortedArray, 0, unSortedArray.length -1);


        long endTime = System.currentTimeMillis();
        System.out.printf("time take by algorithm %s\n" , startTime - endTime);
        System.out.println(Arrays.toString(unSortedArray));

    }


}
