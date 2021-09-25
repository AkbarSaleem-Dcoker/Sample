import java.util.Arrays;

public class OccuranceOfInteger {
    public static void main(String[] args) {
        int[] array = {2,4,8,1,7,87,45,21,4,6,4};
        long count=0;
        int occurence =4;
       /* int count =0;
        for(int ele:array){
            if(ele==4){
                count++;
            }
        }*/

   //   count= Arrays.stream(array).filter(ele->ele==occurence).count();  Streams program
        System.out.println("Occurance of Element 4 is : "+ count);
    }
}
