package timer;

public class TaskSchool extends Task{
    String subject;
    public TaskSchool(String taskName, String subject, int taskNumber) {
        super(taskName, taskNumber);
        this.subject = subject;
        timer = new TaskTimer();
        setRequiredTime(0);
    }

    public TaskSchool(String taskName, String subject, int requiredTime, int taskNumber) {
        super(taskName, requiredTime, taskNumber);
        this.subject = subject;
        timer = new TaskTimer();
    }

    @Override
    public String prepareGetNameTask() {
        return  " (School)";
    }
}
