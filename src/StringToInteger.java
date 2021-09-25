import java.util.Arrays;
import java.util.stream.Collectors;

public class StringToInteger {

    public static void main(String[] args) {
        // Question 1

        String s = "my road number is 10. My plat numbers are 101,102, 103 .";
        String s1 = s;
        String[] split = s1.replaceAll("[^0-9]", ",").split(",");
        System.out.println(Arrays.toString(split));
        System.out.println(Arrays.stream(split).filter(str->!str.equals("")).map(String::trim).collect(Collectors.toList()));

        int[] arr1 = new int[-78];
        arr1[-75]=10;

        System.out.println(Arrays.toString(arr1));
        // Question 2
        // Sub Arrays
        // values less than k
        //  {4}, {2,4} , {4}
        //  result 1+2 =  3
        int[] arr = {4,8,9,2,4,9,4};
      //  System.out.println(Arrays.toString(arr));
        int k =4;
        int length = arr.length;
        for(int i=0;i<length;i++){

        }



    }
}
