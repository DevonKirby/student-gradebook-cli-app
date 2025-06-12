package com.devon.gradebook.model;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class GradebookTest {

    @Test
    void testAddAndFindStudent() {
        Gradebook gradebook = new Gradebook();
        gradebook.addStudent("Devon");

        Optional<Student> result = gradebook.findStudentByName("Devon");
        assertTrue(result.isPresent());
        assertEquals("Devon", result.get().getName());
    }
}