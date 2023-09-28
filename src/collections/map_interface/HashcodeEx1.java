package src.collections.map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashcodeEx1 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Zaza", "Kotov", 3);
        Student st2 = new Student("Ivan", "Sidorov", 2);
        Student st3 = new Student("Pavel", "Ivanov", 4);
        map.put(st1, 7.5);
        map.put(st2, 2.3);
        map.put(st3, 4.7);
        Student st4 = new Student("Ivan", "Sidorov", 2);
        boolean result = map.containsKey(st4);
        System.out.println(result);

        for (Map.Entry<Student, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

class Student {
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
}
