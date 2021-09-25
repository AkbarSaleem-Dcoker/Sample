import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayUnion {
    public static void main(String[] args) {
        int[] firstArray = {0, 2, 4, 6, 8};
        int[] secondArray = {1, 3, 5, 7, 9};

        HashSet<Integer> set = new HashSet<>();

        List<Integer> list1 = IntStream.of(firstArray)
                .boxed()
                .collect(Collectors.toList());

        List<Integer> list2 = IntStream.of(secondArray)
                .boxed()
                .collect(Collectors.toList());


        set.addAll(list1);

        set.addAll(list2);

        System.out.println(set);
        System.out.println("aize of union list" + set.size());
    }
}
