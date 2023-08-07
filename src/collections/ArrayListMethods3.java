package src.collections;

import src.generics.game.Student;

import java.util.ArrayList;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("masha");
        arrayList1.add("igor");
        arrayList1.add("vasya");
        System.out.println(arrayList1);
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("!!");
        arrayList2.add("??");
        arrayList2.add("..");
        arrayList1.addAll(1, arrayList2);
        System.out.println(arrayList1);

        ArrayList<Student> studentList = new ArrayList<>();
        Student student1 = new Student("Kolya", 23);
        Student student2 = new Student("Katya", 19);
        Student student3 = new Student("Katya", 19);
        studentList.add(student1);
        studentList.add(student2);
        int index = studentList.indexOf(student3);
        System.out.println(index);
        System.out.println(studentList.contains(new Student("Katya",18)));
    }


}
