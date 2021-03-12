import java.util.Objects;

/**
 * Class School
 * Contains the name and capacity of the school
 */

public class School implements Comparable<School> {
    private String name;
    private int capacity;

    /**
     * Constructor with parameter
     * @param name represents the name of the school
     */

    public School(String name) {
        this.name = name;
    }

    /**
     * Getter for name
     * @return the name of the school
     */

    public String getName() {
        return name;
    }

    /**
     * Getter for capacity
     * @return the capacity of the school
     */

    public int getCapacity() {
        return capacity;
    }

    /**
     * Setter for capacity
     * @param capacity represents the capacity to be set
     */

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return capacity == school.capacity && Objects.equals(name, school.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capacity);
    }

    @Override
    public int compareTo(School o) {
        return this.name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
