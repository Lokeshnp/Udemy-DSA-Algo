package hashtable.LeetCode2;

import java.util.*;


public class Main {

   public static List<Integer> findDuplicates(int[] nums){
       HashMap<Integer, Integer> numCounts = new HashMap<>();
       for(int num: nums){
           numCounts.put(num, numCounts.getOrDefault(num,0)+1);
       }
       List<Integer> list = new ArrayList<>();
       for(Map.Entry<Integer, Integer> entry:numCounts.entrySet()){
           if(entry.getValue()>1){
               list.add(entry.getKey());
           }
       }
       return list;
   }


    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 2, 1, 4, 5, 4};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println(duplicates);

        /*
            EXPECTED OUTPUT:
            ----------------
			[1, 2, 4]

        */

    }

}

