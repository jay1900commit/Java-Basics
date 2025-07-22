package AdvanceTopics.comparatorAndComparator;
import java.lang.*;

public class Employee implements Comparable<Employee> {

    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee other) {
        return this.id - other.id;
    }
}
