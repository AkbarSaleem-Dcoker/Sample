import java.util.List;
import java.util.OptionalInt;

public class StringReduce {
    public static void main(String[] args) {

        List<Integer> integers = List.of(12, 5, 8, 32, 13, 7);

        int max = integers.stream().mapToInt(i -> i).max().getAsInt();
        System.out.println(max);

        int max2  = integers.stream().reduce(0,(a,b)->a>b?a:b).intValue();
        System.out.println(max2);

        int sum  = integers.stream().reduce(0,(a,b)->a+b).intValue();

        System.out.println(sum);

         max  = integers.stream().reduce(Integer::max).get();

        System.out.println(max);
    }
}
