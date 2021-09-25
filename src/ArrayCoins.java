import java.util.Scanner;

public class ArrayCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int loop =  sc.nextInt();
        int arr[] = new int[loop];
        for(int i =0;i<loop;i++){
            arr[i]= sc.nextInt();
        }
        int firstPlayerSum =0;
        int secondPlayerSum =0;
        int interchange = loop/2;

        for(int i=0;i<loop;i++){
     if(i<interchange){
                firstPlayerSum=firstPlayerSum+arr[i];
            }else{
                if(i==interchange){
                    firstPlayerSum=firstPlayerSum+arr[i];
                }
                secondPlayerSum=secondPlayerSum+arr[i];
            }
        }

        if(secondPlayerSum==firstPlayerSum){
            System.out.println("DRAW");
        }else if(secondPlayerSum>firstPlayerSum){
            System.out.println("PLAYER 2 WINS");
        }else{
            System.out.println("PLAYER 1 WINS");
        }
    }
}
