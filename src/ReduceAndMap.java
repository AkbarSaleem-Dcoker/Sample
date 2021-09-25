import java.util.Optional;
import java.util.stream.Stream;

public class ReduceAndMap {

    public static void main(String[] args) {

        Stream<Integer> integerStream = Stream.of(3, 5, 6, 8, 28, 1, 65, 23);
       int sum = integerStream.mapToInt(i -> i).sum();
        System.out.println(sum);
//
       Integer integer = integerStream.reduce(Integer::sum).get();
//        System.out.println("Sum Value : "+integer);
//
        Integer reduce = integerStream.reduce(0, (a, b) -> a + b);


//
//        System.out.println("Sum with reduce : "+ reduce);

     //   Integer maxValue = integerStream.reduce(0, (a, b) -> a>b?a:b);
    // In integer class we have sum , max , min methods
        Integer maxValue2 = integerStream.reduce(Integer::max).get();


        System.out.println(maxValue2);

        Stream<String> words = Stream.of("Spring", "Core Java", "Spring Boot", "microServices");
        String maxCharString = words.reduce((a, b) -> a.length() > b.length() ? a : b).get();
        System.out.println(maxCharString);



    }
}
