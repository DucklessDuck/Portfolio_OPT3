package com.company;

import java.util.ArrayList;

public class TaskList {
    private Boolean statusDone;
    private ArrayList<Task> taskList = new ArrayList<>();

    public void Display() {

    }

    // Maakt de taak aan en voegt de taak toe aan de tasklist
    public void createTask(Task task) {
        taskList.add(task);
    }


    // Verwijdert de gekozen taak
    public void removeTask(Task task) {
        taskList.remove(task);
    }

    // Wijzigt de naam van de taak
    public void renameTask(String taskName){
        for (Task task : taskList) {
            if (task.getTaskName().equals(taskName)) {
                task.setTaskName(taskName);
            }
            else{
                System.out.println("Taak niet gevonden.");
            }
        }
    }

    // Haalt de gemaakte uren op van alle taken
    public int getTotalHours() {
        return 0;
    }

    // Haalt de taak op uit de lijst
    public Task getTask(int taskNumber) {
        for (Task task : taskList) {
            if (task.getTaskNumber() == taskNumber) {
                return task;
            }
        }
        return null;
    }

}
