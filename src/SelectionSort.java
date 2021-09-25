import java.util.Arrays;

public class SelectionSort {


    public static void main(String[] args) {

        int[] arr = {76,43,72,32,7,10};

        SelectionSort selectionSort = new SelectionSort();
        
        selectionSort.sort(arr);

        System.out.println(Arrays.toString(arr));
        
    }

    private void sort(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                  int  temp = arr[i];
                  arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
