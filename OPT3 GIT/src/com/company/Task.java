package com.company;

public class Task {

    private int secondsPassed;
    private String taskName;
    private int requiredTime;

    public Task(String taskName, int requiredTime, int secondsPassed){

    }

    //voegt een taak toe
    public void addTask(String taskName){

    }

    // voegt een taak toe met de benodigde uren
    public void addTask(String taskName, int requiredTime){
    }

    // verwijdert de gekozen taak
    public void removeTask(String taskName){
    }

    public String getTaskName(){
        return taskName;
    }

    //Haalt de gemaakte uren op van een bepaalde taak
    public int getHoursTask(){
        return secondsPassed;
    }

    // Haalt de gemaakte uren op van alle taken
    public int getTotalHours(){
        return 0;
    }



}
