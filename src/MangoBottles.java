import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MangoBottles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] bottles = {1,5,7,10};
        List<Integer> mango = new ArrayList<>();
        for(int i=0;i<count;i++){
            mango.add(sc.nextInt());
        }
        List<Integer> fillBottle = new ArrayList<>();
        for(int i =0;i<count;i++){
            if(mango.get(i)<5){
                fillBottle.add(mango.get(i));
            }else{
                int bottles_5 = (mango.get(i)/5) + (mango.get(i)%5==0?0:1);
                int bottles_7 = (mango.get(i)/7)+ (mango.get(i)%7==0?0:1);
                int bottles_10 = (mango.get(i)/10)+ (mango.get(i)%10==0?0:1);

               int lbc =  bottles_5<bottles_7 ? bottles_5:bottles_7;
                lbc = lbc<bottles_10?lbc:bottles_10;
                fillBottle.add(lbc);
            }
        }
        for(int bc : fillBottle){
            System.out.println(bc);
        }

    }
}
