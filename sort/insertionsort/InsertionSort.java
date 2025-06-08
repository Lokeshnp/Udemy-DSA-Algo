package sort.insertionsort;

import java.util.Arrays;

public class InsertionSort {

    public static void InsertionSort(int[] ar){
        for(int i=1;i<ar.length;i++){
            int temp = ar[i];
            int j = i-1;
            while(j>-1 && temp<ar[j]){
                ar[j+1] = ar[j];
                ar[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int ar[] = {4,2,6,5,1,3};
        InsertionSort(ar);
        System.out.println(Arrays.toString(ar));
    }
}
