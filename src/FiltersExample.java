import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FiltersExample {
    public static void main(String[] args) {

        // Example 1

        List<String> list = Arrays.asList("Mango", "Banana", "Apple", "Orange");

        list.stream().filter(s -> s.equals("Mango")).forEach( System.out::println);


        List<Employee> empList = List.of(new Employee(23l, "Jareena", "A", 55000l, 25l),
                new Employee(21l, "Shannu", "B", 23000l, 20l),
                new Employee(26l, "Akbar", "C", 68000l, 30l),
                new Employee(45l, "Shakari", "B", 123000l, 21l),
                new Employee(86l, "Munni", "D", 62000l, 32l));

        List<String> collect = empList.stream().filter(employee -> employee.getAge() < 30)
                .sorted(Comparator.comparing(Employee::getAge))
                .map(Employee::getEmpName)
                .collect(Collectors.toList());
        System.out.println(collect);

        List<Student> studentList = empList.stream().filter(employee -> employee.getAge() < 30)
                .map(employee -> new Student(employee.empName,employee.getAge()))
                .collect(Collectors.toList());

        System.out.println(studentList);

        // count of ages
        long count = empList.stream()
                .mapToLong(Employee::getAge)
                .sum();
        System.out.println(count);

    }
}
