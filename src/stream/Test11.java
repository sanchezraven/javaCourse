package src.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test11 {
    static class Student {
        public String name;
        public int grade;

        public String getName() {
            return name;
        }

        public int getGrade() {
            return grade;
        }

        public Student(String name, int grade) {
            this.name = name;
            this.grade = grade;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", grade=" + grade +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("A", 100), new Student("B", 100), new Student("C", 93));

        students.sort(Comparator.comparing(student -> student.name, Comparator.reverseOrder()));
        students.forEach(System.out::println);


    }

    Stream<String> getWorkersNames(Stream<Organization> organizationStream) {
        return organizationStream
                .map(Organization::getWorkers)
                .filter(workers -> workers.size() > 7)
                .flatMap(List::stream)
                .map(Worker::getName)
                .distinct();
    }

    Map<Integer, Organization> collectorMap (List<Organization> organizations) {
        return organizations.stream()
                .collect(Collectors.toMap(Organization::getId, organization -> organization));
    }

    Map<String, List<Worker>> collectorMap2 (List<Worker> workers) {
        return workers.stream()
                .collect(Collectors.groupingBy(Worker::getPosition));
    }

    Map<String, Long> collectorMap3 (List<Worker> workers) {
        return workers.stream()
                .collect(Collectors.groupingBy(Worker::getPosition, Collectors.counting()));
    }

    Map<String, Double> collectorMapSalary (List<Worker> workers) {
        return workers.stream()
                .collect(Collectors.groupingBy(Worker::getPosition, Collectors.averagingDouble(Worker::getSalary)));
    }

        interface Organization {
            int getId();
            List<Worker> getWorkers();
        }

        interface Worker {
            String getName();
            String getPosition();
            double getSalary();
        }
}

