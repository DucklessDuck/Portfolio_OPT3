package com.company;

public class Task {

    private long hoursPassed;
    private String taskName;
    private int requiredTime;
    private int taskNumber;
    private static int uniqueTaskNumber = 0;

    public Task(String taskName){
        this.taskName = taskName;
        this.requiredTime = 0;
        this.hoursPassed = 0;
        this.taskNumber = getUniqueTaskNumber();
    }

    public Task(String taskName, int requiredTime){
        this.taskName = taskName;
        this.requiredTime = requiredTime;
        this.hoursPassed = 0;
        this.taskNumber = getUniqueTaskNumber();
    }

    public Task(String taskName, int requiredTime, int hoursPassed){
        this.taskName = taskName;
        this.requiredTime = requiredTime;
        this.hoursPassed = hoursPassed;
        this.taskNumber = getUniqueTaskNumber();
    }

    public Boolean checkTask(Task task){
        if(getRequiredTime() != 0) {
            return (task.getRequiredTime() <= getHoursPassed());
        }
        else return false;
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

    //toevoegen van gewerkte uren
    public void setHoursPassed(int hoursPassed){
        this.hoursPassed = hoursPassed;
    }

    //Haalt de gemaakte uren op
    public long getHoursPassed(){
        return hoursPassed;
    }

    //Haalt de benodigde uren op
    public int getRequiredTime(){
        return requiredTime;
    }


}
