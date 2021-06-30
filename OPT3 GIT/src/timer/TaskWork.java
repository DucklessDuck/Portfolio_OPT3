package timer;

public class TaskWork extends Task{

    public TaskWork(String taskName, int taskNumber) {
        super(taskName, taskNumber);
        timer = new TaskTimer();
    }

    public TaskWork(String taskName, int requiredTime, int taskNumber) {
        super(taskName, requiredTime, taskNumber);
        timer = new TaskTimer();
    }

    @Override
    public String prepareGetNameTask() {
        return " (Work)";
    }

}

