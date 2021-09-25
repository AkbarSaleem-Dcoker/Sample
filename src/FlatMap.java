import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        String[] pnoneNum1 = new String[]  {"12","23"};
        String[] pnoneNum2 = new String[]  {"16","78"};
        String[] pnoneNum3 = new String[]  {"910","712"};
        String[] pnoneNum4 = new String[]  {"13","14"};
        String[] pnoneNum5 = new String[]  {"15","16"};
        //  List<Customer>  list = Arrays.asList(new Customer[]{new Customer(1, "customer1", address, "9762538997", "SAp")});
        List<Customer> list = new ArrayList<>();
        list.add(new Customer(1, "Akbar", pnoneNum1, "9762538997", "Sattenapalli",21l));
        list.add(new Customer(2, "customer2", pnoneNum2, "9762538996", "Sattenapalli",45l));
        list.add(new Customer(3, "customer3", pnoneNum3, "9762538995", "Bangalore",34l));
        list.add(new Customer(4, "customer4", pnoneNum4, "9762538994", "Vijayawada",8l));
        list.add(new Customer(5, "customer5", pnoneNum5, "9762538993", "Vizag",63l));


        String s1 = list.stream().flatMap(customer -> Arrays.stream(customer.getAddress()))
                .filter(s -> s.equals("12"))
                .map(customer->customer)
                        .findFirst().get();

//        List<Customer> collect = list.stream().filter(customer -> Arrays.stream(customer.getAddress()).anyMatch(s -> s.equals("16")))
//                .collect(Collectors.toList());


//        List<Integer> collect = list.stream().flatMap(customer -> Arrays.stream(customer.getAddress()))
//                .distinct()
//                  .mapToInt(Integer::valueOf)
//                    .boxed()
//                .sorted()
//                .collect(Collectors.toList());
//        System.out.println(collect);

        List<Integer> collect = list.stream().flatMap(customer -> Arrays.stream(customer.getAddress()))
                .distinct()
                .mapToInt(Integer::valueOf)
                .boxed()
                .sorted()
                .collect(Collectors.toList());

    }
}
