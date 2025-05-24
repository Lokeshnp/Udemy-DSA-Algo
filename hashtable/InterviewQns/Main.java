package hashtable.InterviewQns;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {2,3,5};
        int[] array2 = {4,6,7};
        System.out.println(itemInCommon(array1, array2));
    }

//    public static boolean itemInCommon(int[] array1, int[] array2){
//        for(int i : array1){
//            for(int j : array2){
//                if(i==j) return true;
//            }
//        }
//        return false;
//    }

    public static boolean itemInCommon(int[] array1, int[] array2){
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        for(int i: array1){
            hashMap.put(i, true);
        }
        for(int j: array2){
            if(hashMap.get(j)!=null) return true;
        }
        return false;
    }
}
