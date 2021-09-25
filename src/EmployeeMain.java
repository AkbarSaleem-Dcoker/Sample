import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {

    public static void main(String[] args) {


        List<Employee> employees = getEmployees();


        List<Integer> list = List.of(65, 35, 76, 98, 26, 156);

        List<Integer> list1 = Arrays.asList(65, 35, 76, 98, 26, 156);

//        Collections.sort(list1);
//        Collections.reverse(list1);

        //  System.out.println(list1);
         //   list.stream().sorted().forEach(System.out::println);  // natural sorting
          //  list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);  // stream reverse order
        //    List<Integer> collect = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

//       employees.stream().map(Employee::getEmpName).
//                collect(Collectors.toList()).forEach(System.out::println);  // without Sort
//        employees.stream().sorted(Comparator.comparing(Employee::getEmpName)).
//                map(Employee::getEmpName).collect(Collectors.toList()).forEach(System.out::println); // natural order with name

//        employees.stream().sorted(Comparator.comparing(Employee::getEmpName).reversed()).
//               map(Employee::getEmpName).collect(Collectors.toList()).forEach(System.out::println); // reverse order with name


        String s = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).
                map(Employee::getEmpName).findFirst().get();  // Employee name with greater salary
      System.out.println("Employee with greater salary : " + s);
//
//
//        Employee employee = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).
//                findFirst().get();
//
//        System.out.println(employee);
//
//
        List<Employee> empList = List.of(new Employee(23l, "Jareena", "A", 55000l, 25l),
                new Employee(21l, "Shannu", "B", 23000l, 20l),
                new Employee(26l, "Akbar", "C", 68000l, 30l),
                new Employee(45l, "Shakari", "B", 123000l, 21l),
                new Employee(86l, "Munni", "D", 62000l, 32l));


        //  empList.stream().reduce(Employee::getSalary).get();
    }

    public static List<Employee> getEmployees() {
        List<Employee> employees = List.of(new Employee(23l, "Jareena", "A", 55000l),
                new Employee(21l, "Shannu", "B", 23000l),
                new Employee(26l, "Akbar", "C", 68000l),
                new Employee(45l, "Shakari", "B", 123000l),
                new Employee(86l, "Munni", "D", 62000l));
        return employees;
    }

}
