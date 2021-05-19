package com.company;

import java.util.ArrayList;

public class Task {

    private int secondsPassed;
    private String taskName;
    private int requiredTime;
    private int taskNumber;
    private static int uniqueTaskNumber = 0;

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

    public void setTaskName(String taskName){
        this.taskName = taskName;
    }

    //Haalt de naam van de taak op
    public String getTaskName(){
        return taskName;
    }

    // Aanmaken unieknummer voor nieuwe taak
    public int getUniqueTaskNumber(){
        return uniqueTaskNumber++;
    }

    //  Nummer van taak ophalen
    public int getTaskNumber(){
        return taskNumber;
    }

    // Toevoegen van benodigde uren
    public void setTaskTime(int requiredTime){
        this.requiredTime = requiredTime;
    }

    public void editPassedTime(int actualTime){
        secondsPassed = actualTime;
    }

    //Haalt de gemaakte uren op
    public int getHoursPassed(){
        return secondsPassed;
    }

    //Haalt de benodigde uren op
    public int getRequiredTime(){
        return requiredTime;
    }

    public Boolean checkTask(Task task){
       if(getRequiredTime() != 0) {
           return (task.getRequiredTime() <= task.getHoursPassed());
       }
       else return null;
    }


}
