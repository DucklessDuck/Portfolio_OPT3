package com.company;

import java.util.ArrayList;

public class TaskList {
    private ArrayList<Task> taskList = new ArrayList<>();

    // Maakt de taak aan en voegt de taak toe aan de tasklist
    public void addTask(Task task){
        taskList.add(task);
    }

    // Verwijdert de gekozen taak
    public void removeTask(Task task){
        taskList.remove(task);
    }

    // Haalt de taak op uit de lijst
    public Task getTask(int taskNumber){
        for(Task task : taskList){
            if(task.getTaskNumber() == taskNumber){
                return task;
            }
        }
        return null;
    }

    // Haalt de gemaakte uren op van alle taken
    public int getTotalHours(){
        return 0;
    }
}
