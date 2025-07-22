package AdvanceTopics.comparatorAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(103, "Jay"));
        students.add(new Student(104, "Pawan"));
        students.add(new Student(101, "Mohit"));
        students.add(new Student(102, "Ajay"));

        Collections.sort(students, (s1,s2) ->{
            return s1.name.compareTo(s2.name);
        });

        for(Student s : students){
            System.out.println(s);
        }
    }
}
