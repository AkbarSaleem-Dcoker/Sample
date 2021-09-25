import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        int m, n, i, j, temp;
        int smallest;
        int greatest;
        boolean flag= false;
       Scanner sc = new Scanner(System.in);
       m = sc.nextInt();
         n = sc.nextInt();
        int a[][] = new int[m][n];
        for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
        int search = sc.nextInt();
             greatest= a[0][0];
             smallest= a[0][0];
            // print original matrix
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    if(a[i][j]==search){
                        flag=true;
                        smallest = a[0][0];
                    }
                     if(greatest<a[i][j] && a[i][j]<search){
                        greatest=a[i][j];
                    }
                 }
             }
         if(flag){
                System.out.println(smallest);
            }else{
                System.out.println(greatest);
            }
     }
}
