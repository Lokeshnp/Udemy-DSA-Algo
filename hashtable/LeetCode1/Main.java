package hashtable.LeetCode1;

import java.util.HashMap;

public class Main {

   public static boolean itemInCommon(int[] arrya1, int[] array2){
       HashMap<Integer, Boolean> map = new HashMap<>();
       for(int i: arrya1){
           map.put(i, true);
       }
       for(int j:array2){
           if(map.get(j) != null) return true;
       }
       return false;
   }


    public static void main(String[] args) {

        int[] array1 = {1,2,3};
        int[] array2 = {4,5,7};

        System.out.println(itemInCommon(array1, array2));

    }

}