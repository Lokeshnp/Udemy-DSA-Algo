package hashtable.LeetCode5;

import java.util.*;


public class Main {
    // public static int[] twoSum(int[] a, int target){
    //   //  HashMap<Integer, Integer> map = new HashMap();
    //     for(int i=0;i<a.length;i++){
    //         for(int j=i+1;j<a.length;j++){
    //             if(a[i]+a[j] == target ){
    //                 return new int[] {i,j};
    //             }
    //         }
    //     }
    //     return new int[] {};
    // }

  public static int[] twoSum(int[] numArray, int target){
      HashMap<Integer, Integer> numMap = new HashMap<>();
      for(int i=0;i<numArray.length;i++){
          if(numMap.containsKey(target-numArray[i])){
              return new int[]{numMap.get(target-numArray[i]), i};
          }
          numMap.put(numArray[i], i);
      }
      return new int[]{};
  }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 10)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 7)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 3)));
        System.out.println(Arrays.toString(twoSum(new int[]{}, 0)));

        /*
            EXPECTED OUTPUT:
            ----------------
            [0, 1]
            [1, 2]
            [0, 1]
            []
            [2, 3]
            [0, 1]
            []

        */

    }

}
