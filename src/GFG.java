import java.io.*;
import java.util.*;

class GFG {
    public static int largestPrimeFactor(long number) {
        int i;
        long copyOfInput = number;
        for (i = 2; i <= copyOfInput; i++) {
            if (copyOfInput % i == 0) {
                copyOfInput /= i; i--; }
        }
        return i;
    }

    // Driver code
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
        Long num1 = sc.nextLong();
        Long num2 = sc.nextLong();
       long devisor1= largestPrimeFactor(num1);
        long devisor2= largestPrimeFactor(num2);

       long devisor =  devisor1==devisor2?devisor1:-1;
        System.out.println(devisor);
    }
}