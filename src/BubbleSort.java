public class BubbleSort {

       int[] value ;
       BubbleSort(int[] rawValue){
         value = rawValue;

         for (int i =0; i< value.length; i++) {
             for(int j=0; j< value.length -1 -i; j++) {
                     int temp = value[j + 1];

                     if (value[j] > value[j+1]) {
                         value[j +1] = value[j];
                         value[j] = temp;
                     }
             }
         }
       }
}
