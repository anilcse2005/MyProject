package java8.employees;
import java.time.LocalDate;


public class Employee {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String department;
    private String role;
    private double salary;
    private LocalDate dateOfJoining;
    private String city;
    private String email;
    private boolean active;

    // Constructor
    public Employee(int id, String name, int age, String gender, String department,
                    String role, double salary, LocalDate dateOfJoining,
                    String city, String email, boolean active) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.role = role;
        this.salary = salary;
        this.dateOfJoining = dateOfJoining;
        this.city = city;
        this.email = email;
        this.active = active;
    }

    // Getters & Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getDepartment() { return department; }
    public String getRole() { return role; }
    public double getSalary() { return salary; }
    public LocalDate getDateOfJoining() { return dateOfJoining; }
    public String getCity() { return city; }
    public String getEmail() { return email; }
    public boolean isActive() { return active; }

    @Override
    public String toString() {
        return String.format("Employee{id=%d, name='%s', age=%d, gender='%s', dept='%s', role='%s', salary=%.2f, doj=%s, city='%s', active=%b}",
                id, name, age, gender, department, role, salary, dateOfJoining, city, active);
    }
}