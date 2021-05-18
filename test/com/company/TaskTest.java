package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    Task task;

    @BeforeEach
    void setUp(){
        task = new Task("TestTaak", 1, 0);
    }

    @Test
    public void initTest() {
        assertEquals(0,task.getHoursTask());
        assertEquals(null, task.getTaskName());
    }


    @Test
    public void addFirstTask(){
        task.addTask(task.getTaskName(), task.getHoursTask());
    }

}