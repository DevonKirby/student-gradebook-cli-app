package com.devon.gradebook.model;

import java.util.Map;
import java.util.HashMap;

public class Student {
    private String name;
    private Map<String, String> courseGrades;

    public Student(String name) {
        this.name = name;
        this.courseGrades = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(String course, String grade) {
        courseGrades.put(course, grade);
    }

    public Map<String, String> getCourseGrades() {
        return courseGrades;
    }

    public void printReportCard() {
        System.out.println("Report Card for " + name + ":");
        if (courseGrades.isEmpty()) {
            System.out.println("  No grades recorded.");
        } else {
            for (Map.Entry<String, String> entry : courseGrades.entrySet()) {
                System.out.println("  " + entry.getKey() + ": " + entry.getValue());
            }
        }
    }

    @Override
    public String toString() {
        return name + " (" + courseGrades.size() + " courses)";
    }
}
