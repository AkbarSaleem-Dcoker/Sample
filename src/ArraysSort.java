import java.util.Arrays;
import java.util.Collections;

public class ArraysSort {
    public static void main(String[] args) {

        Integer[] ele = new Integer[]{45,3,-23,4,1,89,32,11};
        String[] names = {"Jarru","Shannu","Saleem","Shakari"};
        // Arrays sorting Techniques
     //   Arrays.sort(ele);  Technique one

        Arrays.sort(ele, Collections.reverseOrder());
        Arrays.sort(names);
        System.out.println(Arrays.toString(ele));
        System.out.println(Arrays.toString(names));

      //  Other sorting Techniques we have


    }
}
