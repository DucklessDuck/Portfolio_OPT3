package com.company;

public class TaskWork extends Task{

    public TaskWork(String taskName, int taskNumber) {
        super(taskName, taskNumber);
    }

    public TaskWork(String taskName, int requiredTime, int taskNumber) {
        super(taskName, requiredTime, taskNumber);
    }

    @Override
    public String prepareGetNameTask() {
        return " (Work)";
    }

}
