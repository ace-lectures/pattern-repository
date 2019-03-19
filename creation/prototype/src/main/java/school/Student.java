package school;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Student {


    private String name;
    public void setName(String name) { this.name = name; }

    private Set<String> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new HashSet<>();
    }

    private Student(Student that) {
        this.name = that.name;
        this.courses = new HashSet<>(that.courses);
    }

    public void registerTo(String course) {
        try {
            System.out.println("  Registering ["+name+"] to ["+course+"]");
            System.out.print("    => dbconnect ... ");
            TimeUnit.MILLISECONDS.sleep(200);
            System.out.print("validate ... ");
            TimeUnit.MILLISECONDS.sleep(100);
            System.out.print("register ... ");
            TimeUnit.MILLISECONDS.sleep(100);
            this.courses.add(course);
            System.out.print("disconnect ... ");
            TimeUnit.MILLISECONDS.sleep(200);
            System.out.println(" <=");
        } catch (InterruptedException ie) {
            throw new RuntimeException(ie);
        }
    }

    public Student duplicate() {
        System.out.println("  Cloning " + this.toString());
        return new Student(this);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(courses, student.courses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, courses);
    }
}
