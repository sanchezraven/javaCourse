package src.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test8 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 87, 99, 2.1);
        Student st2 = new Student("Zaza", 'f', 17, 1, 5.0);
        Student st3 = new Student("Goga", 'm', 35, 12, 3.1);
        Student st4 = new Student("Masaha", 'f', 24, 5, 4.5);
        Student st5 = new Student("Remvbo", 'm', 43, 1, 23.1);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        Map<Integer, List<Student>> map = students.stream().map(student -> {
            student.setName(student.getName().toUpperCase());
            return student;
        })
                .collect(Collectors.groupingBy(s -> s.getCourse()));

        for (Map.Entry<Integer, List<Student>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }


        Map<Boolean, List<Student>> map2 =
                students.stream().collect(Collectors.partitioningBy(s -> s.getAvgGrade() > 7));

        for (Map.Entry<Boolean, List<Student>> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }
    }
}
