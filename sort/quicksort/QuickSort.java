package sort.quicksort;

import java.util.Arrays;

public class QuickSort {

    private static void swap(int[] array, int firstIndex, int secondIndex){
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    private static int pivot(int[] array, int pivotIndex, int endIndex){
        int swapIndex = pivotIndex;
        for(int i=pivotIndex+1;i<=endIndex;i++){
            if ( array[i]<array[pivotIndex]) {
                swapIndex++;
                swap(array, swapIndex, i);
            }
        }
        swap(array, pivotIndex, swapIndex);
        return swapIndex;
    }

    public static void quickSort(int[] myArr){
        quickSortHelper(myArr, 0, myArr.length-1);
    }
    private static void quickSortHelper(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = pivot(array, left, right);
            quickSortHelper(array, left, pivotIndex-1);
            quickSortHelper(array, pivotIndex+1, right);
        }
    }

    public static void main(String[] args) {
        int[] myArr = {4,6,1,7,3,2,5};
        int returnIndex = pivot(myArr,0,6);
        System.out.println(returnIndex);
        System.out.println(Arrays.toString(myArr));

//        quickSort(myArr);
//        System.out.println(Arrays.toString(myArr));




    }
}
