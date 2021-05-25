package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskListTest {

    private Task testTask1;
    private Task testTask2;
    private Task testTask3;
    private Task testTask4;
    private TaskList taskList;

    @BeforeEach
    void setUp(){
        testTask1 = new Task("Geen benodigde uren zonder werktijd", 0, 0);
        testTask2 = new Task("Tien uur met 10 uur werktijd", 10, 10);
        testTask3 = new Task("Tien Uur zonder werktijd", 10, 0);
        testTask4 = new Task("Tien Uur met werktijd", 10, 9);
        taskList = new TaskList();
        taskList.addTask(testTask1);
        taskList.addTask(testTask2);
        taskList.addTask(testTask3);
    }

    @Test
    void checkStatusTask() {
        assertTrue(taskList.checkStatusTask(testTask1));
        assertTrue(taskList.checkStatusTask(testTask2));
        assertFalse(taskList.checkStatusTask(testTask3));
        assertFalse(taskList.checkStatusTask(testTask4));
    }
}