import java.util.List;

public class AlternateRowsList {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

      //
        //  integers.stream().

        for(int i=0;i<integers.size();i++){
            if(i%2!=0){
                System.out.println(integers.get(i));
            }
        }

    }
}
