import java.util.Objects;

/**
 * Class Student
 * Contains the name of the student
 */

public class Student {
    private String name;

    /**
     * Constructor with parameter
     * @param name represents the name of the student
     */

    public Student(String name) {
        this.name = name;
    }

    /**
     * Getter for name
     * @return the name of the student
     */

    public String getName() {
        return name;
    }

    /**
     * Setter for name
     * @param name represents the name to be set
     */

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
