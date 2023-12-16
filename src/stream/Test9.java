package src.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test9 {
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

        Student minAge = students.stream().min( (x,y) -> x.getAge() - y.getAge()).get();
        System.out.println(minAge);

        Student maxAge = students.stream().max( (x,y) -> x.getAge() - y.getAge()).get();
        System.out.println(maxAge + "\n ___________");

        students.stream().filter(e -> e.getAge() > 20).limit(2).forEach(System.out::println);
        System.out.println("____________");
        students.stream().filter(e -> e.getAge() > 20).skip(3).forEach(System.out::println);

        List<Integer> courses = students.stream().mapToInt(s -> s.getCourse()).boxed().collect(Collectors.toList());
        System.out.println(courses);

        int sum = students.stream().mapToInt(s->s.getCourse()).sum();
        System.out.println(sum);

        double avg = students.stream().mapToDouble(s->s.getAvgGrade()).average().getAsDouble();
        System.out.println(avg);

        int minCourse = students.stream().mapToInt(s->s.getCourse()).min().getAsInt();
        System.out.println(minCourse);

        int maxCourse = students.stream().mapToInt(s->s.getCourse()).max().getAsInt();
        System.out.println(maxCourse);
    }
}
