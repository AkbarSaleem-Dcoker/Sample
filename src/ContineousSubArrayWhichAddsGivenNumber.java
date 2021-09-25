import java.util.ArrayList;

public class ContineousSubArrayWhichAddsGivenNumber {
    public static void main(String[] args) {
        int[] arr ={1,2,3,7,5};
        ArrayList<Integer> list = subarraySum(arr,5,12);
        System.out.println(list);
    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int sum =0;
            list.clear();
            for(int j=i;j<n;j++){
                sum+=arr[j];
                list.add(arr[j]);
                if(sum==s || sum>s){
                    if(sum==s){
                        return list;
                    }
                    break;
                }
            }
        }

        return list;
    }
}
