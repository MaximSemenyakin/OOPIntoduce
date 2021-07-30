package geekbrains;

public class Person {

    private String name;
    private String post;
    private String email;
    private long telNumber;
    private int salary;
    private int age;

    public Person(String name, String post, String email, long telNumber, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.telNumber = telNumber;
        this.salary = salary;
        this.age = age;
    }

    public void getPersonInfo() {
        System.out.println(name + "\nДолжность: " + post + "\nПочта: " + email + "\nНомер телефона: " +
                telNumber + "\nЗарплата: " + salary + "\nВозраст: " + age + "\n");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(long telNumber) {
        this.telNumber = telNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
