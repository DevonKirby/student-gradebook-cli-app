package com.devon.gradebook.service;

import com.devon.gradebook.model.Gradebook;
import com.devon.gradebook.model.Student;

import java.util.Optional;

public class GradebookService {

    private final Gradebook gradebook;

    public GradebookService() {
        this.gradebook = new Gradebook();
    }

    public void addStudent(String name) {
        gradebook.addStudent(name);
    }

    public void addGrade(String studentName, String course, String grade) {
        Optional<Student> studentOpt = gradebook.findStudentByName(studentName);
        if (studentOpt.isPresent()) {
            studentOpt.get().addGrade(course, grade);
            System.out.println("Grade added.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void listStudents() {
        gradebook.listAllStudents();
    }

    public void printReportCard(String studentName) {
        Optional<Student> studentOpt = gradebook.findStudentByName(studentName);
        if (studentOpt.isPresent()) {
            studentOpt.get().printReportCard();
        } else {
            System.out.println("Student not found.");
        }
    }

    public Gradebook getGradebook() {
        return gradebook;
    }
}
