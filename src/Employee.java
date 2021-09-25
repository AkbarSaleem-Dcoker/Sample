import java.util.List;

public class Employee {
    Long empId;
    String empName;
    String empGrage;
    Long salary;
    String email;
    List<String> phoneNumbers;
    Long age;

    public Employee(Long empId, String empName, String empGrage, Long salary, String email, List<String> phoneNumbers, Long age) {
        this.empId = empId;
        this.empName = empName;
        this.empGrage = empGrage;
        this.salary = salary;
        this.email = email;
        this.phoneNumbers = phoneNumbers;
        this.age = age;
    }

    public Employee(Long empId, String empName, String empGrage, Long salary, String email,Long age) {
        this.empId = empId;
        this.empName = empName;
        this.empGrage = empGrage;
        this.salary = salary;
        this.email = email;
        this.age = age;
    }

//    public Employee(long l, String jareena, String a, long l1, long l2) {
//    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empGrage='" + empGrage + '\'' +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }

    public Employee(Long empId, String empName, String empGrage, Long salary) {
        this.empId = empId;
        this.empName = empName;
        this.empGrage = empGrage;
        this.salary = salary;
    }

    public Employee(Long empId, String empName, String empGrage, Long salary,Long age) {
        this.empId = empId;
        this.empName = empName;
        this.empGrage = empGrage;
        this.salary = salary;
        this.age =age;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpGrage() {
        return empGrage;
    }

    public void setEmpGrage(String empGrage) {
        this.empGrage = empGrage;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }


}
