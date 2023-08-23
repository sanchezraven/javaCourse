package src.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(8);
        arrayList.add(12);
        arrayList.add(-8);
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(150);
        arrayList.add(-30);
        Collections.sort(arrayList);
        int index = Collections.binarySearch(arrayList, 12);
        System.out.println(index);

        Employee employee1 = new Employee(100,"kis", 2020);
        Employee employee2 = new Employee(3,"jess", 1999);
        Employee employee3 = new Employee(8,"jo", 3620);
        Employee employee4 = new Employee(22,"pol", 15800);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        System.out.println(employeeList);
        Collections.sort(employeeList);
        System.out.println(employeeList);
        int index2 = Collections.binarySearch(employeeList, new Employee(8,"jo", 3620));
        System.out.println(index2);
    }


}

class Employee implements Comparable<Employee>{
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        int res = this.id - anotherEmp.id;
        if (res == 0) {
            res = this.name.compareTo(anotherEmp.name);
        }
        return res;
    }
}