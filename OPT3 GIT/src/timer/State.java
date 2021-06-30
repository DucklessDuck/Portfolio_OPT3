package timer;

public abstract class State {
    TaskTimer timer;

    public State(TaskTimer timer){
        this.timer = timer;
    }

    public abstract String start();
    public abstract String stop();
    public abstract boolean askStart();
    public abstract boolean askPause();
    public abstract boolean isRunning();
}
