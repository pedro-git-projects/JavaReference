package objectOrientedProgramming.manyToMany;

import java.util.ArrayList;
import java.util.List;

public class Student {

    final String name;
    // When a list is final, what is not able to change is the memory address associated with the list
    // We can change list elements, we just can't change its address
    final List<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void addCourse(Course course) {
        this.courses.add(course);
        course.students.add(this);
    }
}
