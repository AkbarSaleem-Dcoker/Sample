import java.util.Scanner;

public class SmallestInteger {

    public static void main(String[] args) {
        int value=0;
    Scanner sc = new Scanner(System.in);
   int num1 =  sc.nextInt();
   int arr[] = new int[num1];
    for(int i=0 ;i<num1;i++){
        arr[i]=sc.nextInt();
    }
      int sn =   sc.nextInt();
    for(int i=sn+1; ;i++){
        for(int n:arr){
            if(i%n==0){
                value =i;
                System.out.println("Answer"+i);
                break;
            }
        }
        if(value>0){
            break;
        }
    }

    }
}
