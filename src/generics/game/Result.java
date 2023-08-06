package src.generics.game;

public class Result {
    public static void main(String[] args) {
        Scoolar scoolar1 = new Scoolar("Ivan", 13);
        Scoolar scoolar2 = new Scoolar("Masha", 15);
        Scoolar scoolar3 = new Scoolar("Serega", 9);
        Scoolar scoolar4 = new Scoolar("Jora", 6);

        Student student1 = new Student("Kolya", 23);
        Student student2 = new Student("Katya", 19);

        Employee employee1 = new Employee("Zina", 56);
        Employee employee2 = new Employee("Elvira", 43);

        Team<Scoolar> scoolarTeam = new Team<>("Dragons");
        Team<Scoolar> scoolarTeam2 = new Team<>("Wisdoms");
        Team<Student> studentTeam = new Team<>("Pigies");
        Team<Employee> employeeTeam = new Team<>("Plankton");
        scoolarTeam.addNewParticipant(scoolar1);
        scoolarTeam.addNewParticipant(scoolar2);
        scoolarTeam2.addNewParticipant(scoolar3);
        scoolarTeam2.addNewParticipant(scoolar4);
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        scoolarTeam.playWith(scoolarTeam2);
    }
}
