package src.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;

public class StudentInfo {

//    void testStudents(ArrayList<Student> al, StudentsChecks sc) {
//        for (Student s : al) {
//            if(sc.check(s)) {
//                System.out.println(s);
//            }
//        }
//    }

    void testStudents(ArrayList<Student> al, Predicate<Student> pr) {
        for (Student s : al) {
            if(pr.test(s)) {
                System.out.println(s);
            }
        }
    }


//    void printStudentsOverGrade(ArrayList<Student> al, double grade) {
//        for (Student s : al) {
//            if (s.avgGrade > grade) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsUnderAge(ArrayList<Student> al, int age) {
//        for (Student s : al) {
//            if (s.age < age) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsMix(ArrayList<Student> al, int age, double grade, char sex) {
//        for (Student s : al) {
//            if (s.age > age && s.avgGrade < grade && s.sex == sex) {
//                System.out.println(s);
//            }
//        }
//    }
}

class Test {
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
//        info.testStudents(students, new CheckOverGrade());
//        System.out.println("_____________________");
//        info.testStudents(students, new StudentsChecks() {
//            @Override
//            public boolean check(Student s) {
//                return s.age<30;
//            }
//        });
        info.testStudents(students, s -> s.avgGrade>8);
        System.out.println("_____________________");
        info.testStudents(students, (Student s) -> {return s.age<30;});
        System.out.println("_____________________");
        info.testStudents(students, (Student s) -> {
            return s.age>20 && s.avgGrade < 9.3 && s.sex=='f';
        });

//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.course-o2.course;
//            }
//        });
        Collections.sort(students, (s1, s2) -> {return s1.course - s2.course;});
        System.out.println(students);
//        info.printStudentsOverGrade(students, 8);
//        System.out.println("_____________________");
//        info.printStudentsUnderAge(students, 30);
//        System.out.println("_____________________");
//        info.printStudentsMix(students, 20, 9, 'f');
    }
}

//interface StudentsChecks {
//    boolean check(Student s);
//}

//class CheckOverGrade implements StudentsChecks {
//    @Override
//    public boolean check(Student s) {
//        return s.avgGrade>8;
//    }
//}