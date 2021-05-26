package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    Task taskTest;

    @Test
    public void checkTaskTest(){
        taskTest = new Task("firstTestTask", 10);
        assertFalse(taskTest.checkTask(taskTest));
        taskTest.editTaskTime(0);
        taskTest.editPassedTime(2);
        assertFalse(taskTest.checkTask(taskTest));
        taskTest.editTaskTime(100);
        taskTest.editPassedTime(100);
        assertTrue(taskTest.checkTask(taskTest));
    }
}