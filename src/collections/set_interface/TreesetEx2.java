package src.collections.set_interface;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class TreesetEx2 {
    public static void main(String[] args) {
        TreeSet<Student> treeset = new TreeSet<>();
        Student st1 = new Student("Zaza", 1);
        Student st2 = new Student("Ivan", 2);
        Student st3 = new Student("Pavel", 4);
        Student st4 = new Student("Zara", 3);
        treeset.add(st1);
        treeset.add(st2);
        treeset.add(st3);
        treeset.add(st4);
        System.out.println(treeset);
        System.out.println(treeset.first());
        System.out.println(treeset.last());
        Student st5 = new Student("Zara", 3);
        System.out.println(treeset.headSet(st5));
        System.out.println(treeset.tailSet(st5));
        Student st6 = new Student("Ivan", 4);
        System.out.println(treeset.subSet(st5, st6));
    }
}

class Student implements Comparable<Student>{
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public int compareTo(Student other) {
        return this.course - other.course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
}
