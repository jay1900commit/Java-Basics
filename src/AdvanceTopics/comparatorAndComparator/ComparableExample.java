package AdvanceTopics.comparatorAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(103, "Jay"));
        employees.add(new Employee(102, "Amit"));
        employees.add(new Employee(104, "Raj"));
        employees.add(new Employee(101, "Rahul"));

        Collections.sort(employees);

        for(Employee e : employees){
            System.out.println(e);
        }

    }
}
