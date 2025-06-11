package sort.mergesort;

import java.util.Arrays;

public class MergeSort {
    public static int[] merge(int[] a1, int[] a2){
        int[] combined = new int[a1.length+a2.length];
        int index=0;
        int i=0;
        int j=0;
        while(i<a1.length && j<a2.length){
            if(a1[i]<a2[j]){
                combined[index] =a1[i];
                index++;
                i++;
            }else{
                combined[index] =a2[j];
                index++;
                j++;
            }
        }
        while(i<a1.length){
            combined[index] =a1[i];
            index++;
            i++;
        }
        while(j<a2.length){
            combined[index] =a2[j];
            index++;
            j++;
        }
        return combined;
    }

    public static int[] mergeSort(int[] ar){
        int mid = ar.length/2;
        if(ar.length == 1) return ar;
        int[] left = mergeSort(Arrays.copyOfRange(ar, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(ar, mid, ar.length));

        return merge(left, right);
    }

    public static void main(String[] args) {
//        int[] a1 = {1,3,7,8};
//        int[] a2 = {2,4,5,6};
//        System.out.println(Arrays.toString(merge(a1, a2)));
        int[] originalAr = {3,1,4,2};
        int[] sortedAr = mergeSort(originalAr);
        System.out.println(Arrays.toString(sortedAr));
    }
}
