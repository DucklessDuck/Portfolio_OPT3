package timer;

public abstract class Task {

    private long hoursPassed;
    private String taskName;
    private int requiredTime;
    private int taskNumber;
    TaskTimer timer;


    public Task(String taskName, int taskNumber){
        this.taskName = taskName;
        this.requiredTime = 0;
        this.hoursPassed = 0;
        this.taskNumber = taskNumber;
        timer = new TaskTimer();
    }

    public Task(String taskName, int requiredTime, int taskNumber){
        this.taskName = taskName;
        this.requiredTime = requiredTime;
        this.hoursPassed = 0;
        this.taskNumber = taskNumber;
        timer = new TaskTimer();
    }

    public abstract String prepareGetNameTask();

    public void setTaskName(String taskName){
        this.taskName = taskName;
    }

    //Haalt de naam van de taak op
    public String getTaskName(){
        if(this instanceof TaskSchool){
            return taskName + prepareGetNameTask();
        }
        else if(this instanceof TaskWork){
            return taskName + prepareGetNameTask();
        }
        return taskName;
    }

    //  Nummer van taak ophalen
    public int getTaskNumber(){
        return taskNumber;
    }

    // Toevoegen van benodigde uren
    public void setRequiredTime(int requiredTime){
        this.requiredTime = requiredTime;
    }

    //Haalt de gemaakte uren op
    public long getHoursPassed(){
        return hoursPassed += timer.getTimeInHours();
    }


    public TaskTimer getTimer(){
        return timer;
    }


}
