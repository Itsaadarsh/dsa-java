package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Logan", "Paul", 1));
        employeeList.add(new Employee("Jake", "Paul", 2));
        employeeList.add(new Employee("Mike", "Malak", 3));

        employeeList.forEach(emp -> {
            System.out.println(emp);
        });

        employeeList.set(1, new Employee("asd", "asdasd", 1));
        System.out.println(employeeList.get(1));
    }
}
