import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CitiesProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int cost = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<count;i++){
            list.add(sc.nextInt());
        }
        int costPaid = sc.nextInt();
        int lastCityCost = list.get(list.size()-1);
        if(lastCityCost>0){
            for(int j=0;j< list.size();j++){
                if(list.get(j)>0){
                    cost+=list.get(j);
                }
            }
        }else{
            cost=-1;
        }

         System.out.println(cost);

    }
}
