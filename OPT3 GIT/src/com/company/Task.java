package com.company;

import java.util.ArrayList;

public class Task {

    private int secondsPassed;
    private String taskName;
    private int requiredTime;
    private int taskNumber;
    private static int UniqueTaskNumber = 0;

    public Task(String taskName){
        this.taskName = taskName;
        this.requiredTime = 0;
        this.secondsPassed = 0;
        this.taskNumber = getUniqueTaskNumber();
    }

    public Task(String taskName, int requiredTime){
        this.taskName = taskName;
        this.requiredTime = requiredTime;
        this.secondsPassed = 0;
        this.taskNumber = getUniqueTaskNumber();
    }

    // Aanmaken unieknummer voor nieuwe taak
    public int getUniqueTaskNumber(){
        return UniqueTaskNumber++;
    }

    //  Nummer van taak ophalen
    public int getTaskNumber(){
        return taskNumber;
    }

    // Toevoegen van benodigde uren
    public void editTaskTime(int requiredTime){
        this.requiredTime = requiredTime;
    }

    //Haalt de naam van de taak op
    public String getTaskName(){
        return taskName;
    }

    public void editPassedTime(int actualTime){
        secondsPassed = actualTime;
    }

    //Haalt de gemaakte uren op
    public int getHoursTask(){
        return secondsPassed;
    }

    //Haalt de benodigde uren op
    public int getRequiredTime(){
        return requiredTime;
    }

    public Boolean checkTask(Task task){
       if(getRequiredTime() != 0) {
           return (task.getRequiredTime() <= task.getHoursTask());
       }
       else return false;
    }


}
