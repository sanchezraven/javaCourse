package src.stream;

import java.util.*;
import java.util.stream.Stream;

public class Test10 {

    public static void main(String[] args) {
        streamSimpleTask();
    }

    static class Person {
        enum Position {
            ENGINEER, DIRECTOR, MANAGER;
        }

        private String name;
        private int age;
        private Position position;

        public Person(String name, int age, Position position) {
            this.name = name;
            this.age = age;
            this.position = position;
        }

        public int getAge() {
            return age;
        }
    }


    private static void streamSimpleTask() {
        List<Person> persons = new ArrayList<>(Arrays.asList(
                new Person("Bob1", 35, Person.Position.MANAGER),
                new Person("Bob2", 44, Person.Position.DIRECTOR),
                new Person("Bob3", 25, Person.Position.ENGINEER),
                new Person("Bob4", 82, Person.Position.ENGINEER),
                new Person("Bob5", 44, Person.Position.MANAGER),
                new Person("Bob6", 49, Person.Position.MANAGER),
                new Person("Bob7", 17, Person.Position.ENGINEER),
                new Person("Bob8", 66, Person.Position.MANAGER)
        ));

        List<String> engineersNames = persons.stream()
                .filter(person -> person.position == Person.Position.ENGINEER)
                .sorted(Comparator.comparingInt(Person::getAge))
                .map(person -> person.name)
                .toList();
        System.out.println(engineersNames);

        System.out.println("--------------");

        Optional<Integer> optionaLResult = persons.stream()
                .map(Person::getAge)
                .sorted(Collections.reverseOrder())
                .reduce(Integer::sum);

        Integer result = optionaLResult.orElse(null);
        System.out.println(result);
        System.out.println("------------------");

        Stream.of("123", "123", "456", "789", "000")
                .distinct()
                .forEach(System.out::println);

        System.out.println("------------------");
        Stream.of("123", "123", "456", "789", "000")
                .skip(3)
                .forEach(System.out::println);
    }
}
