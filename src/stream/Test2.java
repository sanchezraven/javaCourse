package src.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 87, 99, 2.1);
        Student st2 = new Student("Zaza", 'f', 17, 1, 5.0);
        Student st3 = new Student("Goga", 'm', 35, 12, 3.1);
        Student st4 = new Student("Masaha", 'f', 24, 5, 4.5);
        Student st5 = new Student("Remvbo", 'm', 43, 1, 23.1);
        List<Student> students = new ArrayList<>();
        List<Student> sortedStudents;
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        sortedStudents = students.stream().sorted( (x,y) ->
            x.getName().compareTo(y.getName())
        ).collect(Collectors.toList());
        System.out.println(sortedStudents);

        students = students.stream().filter(e ->
                e.getAge() > 22 && e.getAvgGrade() < 7.2)
                .collect(Collectors.toList());
        System.out.println(students);
    }
}


class Student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public  Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }
}