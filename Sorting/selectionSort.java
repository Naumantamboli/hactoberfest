import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {8,6,3,2,5,4};
        selectionsort(arr);
    }

    static void selectionsort(int[] arr){
        int n = arr.length;
        for(int i=0 ;i<n-1 ;i++){
            int k=i;
            for(int j=i+1 ;j<n ;j++){
                if(arr[j]<arr[k]){
                    k=j;
                }
            }
            swap(i,k,arr);
        }

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int a,int b,int[] arr){
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }
}
