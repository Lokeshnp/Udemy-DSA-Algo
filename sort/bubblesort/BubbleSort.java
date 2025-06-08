package sort.bubblesort;

import java.util.Arrays;

public class BubbleSort {
    public static void BubbleSort(int[] ar){
        for(int i=ar.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(ar[j]>ar[j+1]) {
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int ar[] = {4,2,6,5,1,3};
        BubbleSort(ar);
        System.out.println(Arrays.toString(ar));
    }
}
