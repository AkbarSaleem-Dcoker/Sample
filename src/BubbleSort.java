import java.util.Arrays;

public class BubbleSort {


    public static void main(String[] args) {

        int arr[] = {75,86,25,48,10,35,1};
        int size = arr.length;
        for(int i=0; i<size-1;i++)
         for(int j=0;j<size-1-i;j++) {
             if(arr[j]>arr[j+1]){
                 int temp = arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1] = temp;
             }
         }

        System.out.println(Arrays.toString(arr));

    }
}
