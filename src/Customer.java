import java.util.Arrays;

public class Customer {
    int id;
    String name;
    String[] Address;
    String mobileNumber;
    String city;
    Long age;

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Address=" + Arrays.toString(Address) +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }

    public Customer(int id, String name, String[] address, String mobileNumber, String city,Long age) {
        this.id = id;
        this.name = name;
        Address = address;
        this.mobileNumber = mobileNumber;
        this.city = city;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getAddress() {
        return Address;
    }

    public void setAddress(String[] address) {
        Address = address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
