package objectOrientedProgramming.manyToMany;

public class CourseTest {
    public static void main(String[] args) {
        Student s1 = new Student("Pedro");
        Student s2 = new Student("Tati");
        Student s3 = new Student("Dias");

        Course c1 = new Course("Computer architecture");
        Course c2 = new Course("Computer networks");
        Course c3 = new Course("Calculus");

        // As this is a bidirectional relation, it doesn't matter if we're adding
        // The student to the course
        // Or the course to the student

        c1.addStudent(s1);
        c1.addStudent(s2);

        c2.addStudent(s3);


        s1.addCourse(c3);
        s2.addCourse(c3);
        s3.addCourse(c3);

        for(Student student: c1.students){
            System.out.println("My name is " + student.name + " " + "and I'm taking " + c1.name + ".");
        }
    }
}
