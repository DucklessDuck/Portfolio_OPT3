package com.company;

public abstract class Task {

    private long hoursPassed;
    private String taskName;
    private int requiredTime;
    private int taskNumber;


    public Task(String taskName, int taskNumber){
        this.taskName = taskName;
        this.requiredTime = 0;
        this.hoursPassed = 0;
        this.taskNumber = taskNumber;
    }

    public Task(String taskName, int requiredTime, int taskNumber){
        this.taskName = taskName;
        this.requiredTime = requiredTime;
        this.hoursPassed = 0;
        this.taskNumber = taskNumber;
    }

    public abstract String getNameTask();


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
        if(this instanceof TaskSchool){
            return "Taaknaam: " + taskName + getNameTask();
        }
        else if(this instanceof TaskWork){
            return "Taaknaam: " + taskName + getNameTask();
        }
        return "Taaknaam: " + taskName;
    }

    //  Nummer van taak ophalen
    public int getTaskNumber(){
        return taskNumber;
    }

    // Toevoegen van benodigde uren
    public void setRequiredTime(int requiredTime){
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
