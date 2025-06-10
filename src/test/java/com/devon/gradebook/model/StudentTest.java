package com.devon.gradebook.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    void testAddGrade() {
        Student student = new Student("Devon");
        student.addGrade("Math", "A");

        assertEquals("A", student.getCourseGrades().get("Math"));
    }
}
