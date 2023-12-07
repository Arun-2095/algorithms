import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("am running");

         int[] unSortedArray = {2,1,8,3,5,6};

        for (int i = 0; i < unSortedArray.length; i++) {
            unSortedArray[i]=  (int)(Math.random() * 50 +1);
        }

        System.out.println(Arrays.toString(unSortedArray));
//        BubbleSort sortedArray = new BubbleSort(unSortedArray);

//        System.out.println(Arrays.toString(sortedArray.value));


        int[] selectionSortedArray = SelectionSort.sort(unSortedArray);

        System.out.println(Arrays.toString(selectionSortedArray));
    }


}
