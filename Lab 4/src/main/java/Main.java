import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Student[] students = IntStream.rangeClosed(0, 3).mapToObj(i -> new Student("S" + i)).toArray(Student[]::new);
        List<Student> studentList = new LinkedList<>();
        studentList.addAll(Arrays.asList(students));

        List<Student> sortedStudentList = studentList.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());

        //Arrays.sort(students, Comparator.comparing(Student::getName));

        System.out.println("These are all the students:");

        for (Student s : sortedStudentList) {
            System.out.println(s.getName());
        }

        System.out.println();

        School[] schools = IntStream.rangeClosed(0, 2).mapToObj(i -> new School("H" + i)).toArray(School[]::new);
        schools[0].setCapacity(1);
        schools[1].setCapacity(2);
        schools[2].setCapacity(2);

        Set<School> schoolTreeSet = new TreeSet<>();
        schoolTreeSet.addAll(Arrays.asList(schools));

        System.out.println("These are all the schools:");

        for (School h : schoolTreeSet) {
            System.out.println(h.getName());
        }

        System.out.println();

        Map<Student, List<School>> studentPreferenceMap = new HashMap<>();
        studentPreferenceMap.put(students[0], Arrays.asList(schools[0], schools[1], schools[2]));
        studentPreferenceMap.put(students[1], Arrays.asList(schools[0], schools[1], schools[2]));
        studentPreferenceMap.put(students[2], Arrays.asList(schools[0], schools[1]));
        studentPreferenceMap.put(students[3], Arrays.asList(schools[0], schools[2]));

        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + students[i].getName() + ", preferences: " + studentPreferenceMap.get(students[i]));
        }

        System.out.println();

        Map<School, List<Student>> schoolPreferenceMap = new TreeMap<>();
        schoolPreferenceMap.put(schools[0], Arrays.asList(students[3], students[0], students[1], students[2]));
        schoolPreferenceMap.put(schools[1], Arrays.asList(students[0], students[2], students[1]));
        schoolPreferenceMap.put(schools[2], Arrays.asList(students[0], students[1], students[3]));

        for (int i = 0; i < schools.length; i++) {
            System.out.println("School " + schools[i].getName() + ", preferences: " + schoolPreferenceMap.get(schools[i]));
        }
    }
}
