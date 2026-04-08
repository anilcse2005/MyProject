package java8.employees;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeData {

    public static List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Anil Kumar", 32, "Male", "IT", "Developer", 75000, LocalDate.of(2018, 5, 10), "Pune", "anil.kumar@company.com", true));
        employees.add(new Employee(2, "Priya Sharma", 28, "Female", "HR", "Manager", 65000, LocalDate.of(2019, 3, 15), "Delhi", "priya.sharma@company.com", true));
        employees.add(new Employee(3, "Ravi Patel", 40, "Male", "Finance", "Analyst", 82000, LocalDate.of(2015, 7, 20), "Mumbai", "ravi.patel@company.com", true));
        employees.add(new Employee(4, "Sneha Iyer", 35, "Female", "IT", "Architect", 120000, LocalDate.of(2012, 1, 5), "Bangalore", "sneha.iyer@company.com", true));
        employees.add(new Employee(5, "Suresh Reddy", 30, "Male", "Sales", "Executive", 55000, LocalDate.of(2020, 8, 12), "Chennai", "arjun.mehta@company.com", true));
        employees.add(new Employee(6, "Neha Gupta", 26, "Female", "Marketing", "Associate", 48000, LocalDate.of(2021, 6, 18), "Pune", "neha.gupta@company.com", true));
        employees.add(new Employee(7, "Karan Singh", 45, "Male", "Finance", "Manager", 95000, LocalDate.of(2010, 11, 25), "Delhi", "karan.singh@company.com", true));
        employees.add(new Employee(8, "Meera Nair", 38, "Female", "IT", "Tester", 70000, LocalDate.of(2016, 9, 30), "Mumbai", "meera.nair@company.com", true));
        employees.add(new Employee(9, "Vikram Joshi", 29, "Male", "Sales", "Manager", 72000, LocalDate.of(2019, 4, 10), "Pune", "vikram.joshi@company.com", true));
        employees.add(new Employee(10, "Kavita Jain", 33, "Female", "HR", "Executive", 60000, LocalDate.of(2017, 2, 14), "Delhi", "ritu.verma@company.com", true));

        employees.add(new Employee(11, "Suresh Reddy", 50, "Male", "Finance", "Director", 150000, LocalDate.of(2005, 12, 1), "Hyderabad", "suresh.reddy@company.com", true));
        employees.add(new Employee(12, "Suresh Reddy", 27, "Female", "Marketing", "Executive", 52000, LocalDate.of(2020, 10, 5), "Mumbai", "anita.desai@company.com", true));
        employees.add(new Employee(13, "Raj Malhotra", 31, "Male", "IT", "Developer", 78000, LocalDate.of(2018, 6, 22), "Pune", "raj.malhotra@company.com", true));
        employees.add(new Employee(14, "Pooja Bhat", 36, "Female", "Sales", "Executive", 58000, LocalDate.of(2016, 3, 19), "Delhi", "pooja.bhat@company.com", true));
        employees.add(new Employee(15, "Ajay Singh", 42, "Male", "IT", "Manager", 110000, LocalDate.of(2011, 7, 8), "Bangalore", "amit.trivedi@company.com", true));
        employees.add(new Employee(16, "Shalini Rao", 34, "Female", "HR", "Manager", 68000, LocalDate.of(2017, 11, 11), "Chennai", "shalini.rao@company.com", true));
        employees.add(new Employee(17, "Deepak Yadav", 29, "Male", "Finance", "Analyst", 80000, LocalDate.of(2019, 1, 25), "Delhi", "deepak.yadav@company.com", true));
        employees.add(new Employee(18, "Kavita Jain", 37, "Female", "Marketing", "Manager", 90000, LocalDate.of(2014, 4, 17), "Mumbai", "kavita.jain@company.com", true));
        employees.add(new Employee(19, "Manish Kumar", 41, "Male", "Sales", "Director", 130000, LocalDate.of(2009, 9, 9), "Pune", "manish.kumar@company.com", true));
        employees.add(new Employee(20, "Divya Kapoor", 25, "Female", "IT", "Intern", 35000, LocalDate.of(2022, 1, 3), "Delhi", "divya.kapoor@company.com", true));

        employees.add(new Employee(21, "Ashok Pillai", 39, "Male", "Finance", "Consultant", 87000, LocalDate.of(2013, 5, 20), "Chennai", "ashok.pillai@company.com", true));
        employees.add(new Employee(22, "Nisha Rani", 28, "Female", "HR", "Recruiter", 56000, LocalDate.of(2020, 7, 15), "Mumbai", "nisha.rani@company.com", true));
        employees.add(new Employee(23, "Rohit Sharma", 32, "Male", "IT", "Tester", 69000, LocalDate.of(2018, 8, 12), "Pune", "rohit.sharma@company.com", true));
        employees.add(new Employee(24, "Sunita Agarwal", 35, "Female", "Marketing", "Executive", 60000, LocalDate.of(2016, 2, 28), "Delhi", "sunita.agarwal@company.com", true));
        employees.add(new Employee(25, "Ajay Singh", 44, "Male", "Sales", "Manager", 95000, LocalDate.of(2010, 10, 10), "Bangalore", "ajay.singh@company.com", true));
        employees.add(new Employee(26, "Geeta Menon", 30, "Female", "Finance", "Analyst", 77000, LocalDate.of(2019, 12, 5), "Mumbai", "geeta.menon@company.com", true));
        employees.add(new Employee(27, "Sanjay Gupta", 46, "Male", "IT", "Architect", 125000, LocalDate.of(2008, 6, 14), "Delhi", "sanjay.gupta@company.com", true));
        employees.add(new Employee(28, "Radhika Bose", 33, "Female", "HR", "Executive", 61000, LocalDate.of(2017, 9, 21), "Pune", "radhika.bose@company.com", true));
        employees.add(new Employee(29, "Tarun Khanna", 29, "Male", "Marketing", "Associate", 50000, LocalDate.of(2021, 3, 11), "Chennai", "tarun.khanna@company.com", true));
        employees.add(new Employee(30, "Swati Mishra", 27, "Female", "Sales", "Executive", 57000, LocalDate.of(2020, 5, 6), "Mumbai", "swati.mishra@company.com", true));

        return employees;
    }
}
