package com.company;

public class TaskSchool extends Task{
    String subject;
    public TaskSchool(String taskName, String subject, int taskNumber) {
        super(taskName, taskNumber);
        this.subject = subject;
        setRequiredTime(0);
    }

    public TaskSchool(String taskName, String subject, int requiredTime, int taskNumber) {
        super(taskName, requiredTime);
        setRequiredTime(0);
    }


    @Override
    public String getNameTask() {
        return  " (School)";
    }


}
