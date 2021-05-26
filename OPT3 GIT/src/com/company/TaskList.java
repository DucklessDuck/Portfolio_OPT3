package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskList {
    private Boolean statusDone;
    private ArrayList<Task> taskList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void Display() {
        //...
    }

    // Maakt de taak aan en voegt de taak toe aan de tasklist
    public void addTask(Task task) {
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
        int totalHours = 0;
        for(Task task : taskList){
            totalHours += task.getHoursPassed();
        }
        return totalHours;
    }

    // Haalt de taak op uit de lijst
    public Task getTask(int taskNumber) {
        for (Task task : taskList) {
            if (task.getTaskNumber() == taskNumber) {
                return task;
            }
            else{
                return null;
            }
        }
        return null;
    }

    // aanmaken en toevoegen van een taak met alleen een naam
    public void createTask(String taskName){
        if(taskName.replaceAll("\\s", "").length() != 0){
            Task task = new Task(taskName);
            addTask(task);
        }
        else{
            System.out.println("De taak heeft geen naam");
        }
    }

    // aanmaken en toevoegen van een taak met naam en benodigde tijd
    public void createTask(String taskName, int requiredTime){
        if(taskName.length() != 0 && requiredTime != 0) {
            Task task = new Task(taskName, requiredTime);
            addTask(task);
        }
    }

    // aanmaken en toevoegen van een taak met naam, benodigde tijd en al gewerkte tijd
    public void createTask(String taskName, int requiredTime, int hoursPassed){
        if(taskName.length() != 0 && requiredTime != 0 && hoursPassed != 0){
            Task task = new Task(taskName, requiredTime, hoursPassed);
            addTask(task);
        }
    }


    //checkt de status van de taak
    public Boolean checkStatusTask(Task task){
        if(task.getRequiredTime() < task.getHoursPassed()) {
            statusDone = true;
        }
        else statusDone = task.getHoursPassed() == task.getRequiredTime();
        return statusDone;
    }

}
