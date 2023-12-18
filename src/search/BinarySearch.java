package search;

public class BinarySearch {

   public   static  int Search( int[] array, int target, int lowIndex , int hightIndex){

         if(lowIndex > hightIndex) {
             System.out.println("no matching value found");
             return  -1;
         }

         int middleIndex = (lowIndex + hightIndex ) /2;

         int middleValue = array[middleIndex];

         if(middleValue == target) {
             return middleIndex;
         }


         if(middleValue < target) {
         return  Search(array, target, middleIndex +1, hightIndex);
         }

         return Search(array, target, lowIndex, middleIndex - 1);

     }
}
