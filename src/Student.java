public class Student {
    private String name;
    private Long age;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(Long age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Long getAge() {
        return age;
    }

    public Student(String name, Long age) {
        this.name = name;
        this.age = age;
    }
}
