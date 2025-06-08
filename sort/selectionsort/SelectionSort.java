package sort.selectionsort;

import java.util.Arrays;

public class SelectionSort {

    public static void SelectionSort(int[] ar){
        for(int i=0;i<ar.length;i++){
            int minIndex=i;
            for(int j=i+1;j< ar.length;j++){
                if(ar[j]<ar[minIndex]){
                    minIndex = j;
                }
            }
            if(i != minIndex){
                int temp = ar[i];
                ar[i] = ar[minIndex];
                ar[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int ar[] = {4,2,6,5,1,3};
        SelectionSort(ar);
        System.out.println(Arrays.toString(ar));
    }
}
