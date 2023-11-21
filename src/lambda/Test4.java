package src.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Test4 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 87, 99, 2.1);
        Student st2 = new Student("Zaza", 'f', 17, 1, 5.0);
        Student st3 = new Student("Goga", 'm', 35, 12, 3.1);
        Student st4 = new Student("Masaha", 'f', 24, 5, 4.5);
        Student st5 = new Student("Remvbo", 'm', 43, 1, 23.1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();

        Function<Student, Double> f = student -> student.avgGrade;
        Double res = avgSmth(students, st -> st.avgGrade);
        System.out.println(res);
    }

    private static double avgSmth(List<Student> list, Function<Student, Double> f) {
        double result = 0;
        for (Student st : list) {
            result += f.apply(st);
        }
        result = result/list.size();
        return result;
    }
}
