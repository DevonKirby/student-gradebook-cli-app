package com.devon.gradebook.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Gradebook {
    private final List<Student> students;

    public Gradebook() {
        this.students = new ArrayList<>();
    }

    public void addStudent(String name) {
        if (findStudentByName(name).isPresent()) {
            System.out.println("A student with that name already exists.");
            return;
        }
        students.add(new Student(name));
        System.out.println("Student '" + name + "' added.");
    }

    public Optional<Student> findStudentByName(String name) {
        return students.stream()
                .filter(s -> s.getName().equalsIgnoreCase(name))
                .findFirst();
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public void listAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students enrolled yet.");
            return;
        }
        System.out.println("List of Students:");
        for (Student s : students) {
            System.out.println(" - " + s);
        }
    }
}
