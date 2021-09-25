import java.util.List;
import java.util.Map;

public class MapWithStreams {

    public static void main(String[] args) {

        // Collectors has joining method to add some string
        List<Employee> employees = EmployeeMain.getEmployees();

//        System.out.println(employeeList.stream().collect(Collectors.groupingBy(EmployeeModel::getGender,Collectors.mapping(EmployeeModel::getPreferredName, Collectors.toList()))));
//        System.out.println(employeeList.stream().collect(Collectors.groupingBy(EmployeeModel::getGender,Collectors.mapping(Function.identity(), Collectors.toList()))));
//        System.out.println(employeeList.stream().collect(Collectors.groupingBy(EmployeeModel::getGender,Collectors.mapping(empl -> empl, Collectors.toList()))));

        Map<Employee, String> employeeMap = Map.of(employees.get(1), "One",employees.get(2), "two",employees.get(3), "three",
                employees.get(4), "four");

        System.out.println(employeeMap);

       // employeeMap.entrySet().stream().reduce(
    }
}
