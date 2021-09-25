import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsTest {

    public static void main(String[] args) {
      String[] address1 = new String[]  {"panjagutta","Hyderabad"};
        String[] address2 = new String[]  {"Lakdikapool","Hyderabad"};
        String[] address3 = new String[]  {"Tolichowki","Hyderabad"};
        String[] address4 = new String[]  {"Hitechcity","Hyderabad"};
        String[] address5 = new String[]  {"Manikonda","Hyderabad"};
      //  List<Customer>  list = Arrays.asList(new Customer[]{new Customer(1, "customer1", address, "9762538997", "SAp")});
        List<Customer> list = new ArrayList<>();
        list.add(new Customer(1, "customer1", address1, "9762538997", "Sattenapalli",21l));
        list.add(new Customer(1, "customer1", address2, "9762538996", "Sattenapalli",45l));
        list.add(new Customer(1, "customer1", address3, "9762538995", "Bangalore",34l));
        list.add(new Customer(1, "customer1", address4, "9762538994", "Vijayawada",8l));
        list.add(new Customer(1, "customer1", address5, "9762538993", "Vizag",63l));


       // list.stream().filter(customer-> Arrays.stream(Arrays.stream(customer.getAddress()).anyMatch(str->str.equals("panjagutta"))).

        Customer customer2 = list.stream().filter(customer -> customer.getCity().equals("Sattenapalli")).findFirst().get();
        List<Customer> customer3 = list.stream().filter(customer -> customer.getCity().equals("Sattenapalli")).collect(Collectors.toList());
        List<String> cityList = list.stream().map(customer -> customer.getCity()).collect(Collectors.toList());
        List<String> addressList = list.stream().flatMap(customer-> Arrays.stream(customer.getAddress())).collect(Collectors.toList());
      boolean flag = list.stream().flatMap(customer -> Arrays.stream(customer.getAddress())).collect(Collectors.toList()).contains("Manikonda");
      System.out.println(addressList);     System.out.println("Flag "+flag);

      list.stream().findAny().get();




    }
}
