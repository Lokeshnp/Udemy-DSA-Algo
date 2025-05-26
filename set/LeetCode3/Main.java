package set.LeetCode3;

import java.util.*;


public class Main {

   public static List<int[]> findPairs(int[] a1, int[] a2, int target){
       Set<Integer> set= new HashSet<>();
       List<int[]> pairs = new ArrayList<>();
       for(int i:a1){
           set.add(i);
       }
       for(int j:a2){
           if(set.contains(target-j)){
               pairs.add(new int[]{target-j, j});
           }
       }
       return pairs;
   }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8, 10};
        int target = 7;

        List<int[]> pairs = findPairs(arr1, arr2, target);
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }

        /*
            EXPECTED OUTPUT:
            ----------------
            [5, 2]
            [3, 4]
            [1, 6]

        */

    }

}
