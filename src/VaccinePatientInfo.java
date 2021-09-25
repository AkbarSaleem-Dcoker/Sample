import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VaccinePatientInfo {
    public static void main(String[] args) {
        String output = "Yes";
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
       List<Integer> vaccines = new ArrayList<>();
        List<Integer> miCore = new ArrayList<>();
        for(int i=0;i<count;i++){
            vaccines.add(sc.nextInt());
        }

        for(int j=0;j<count;j++){
            miCore.add(sc.nextInt());
        }

        for(int k=0;k<count;k++){
            if(vaccines.get(k)>miCore.get(k)){
                output="No";
                break;
            }
        }

        System.out.println(output);
    }
}
