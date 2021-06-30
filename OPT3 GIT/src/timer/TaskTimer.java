package timer;


public class TaskTimer {

    private State uses;

    private long startTime;
    private long finishTime;
    private long elapsedTime;

    public TaskTimer() {

        uses = new OffState(this);
    }

    public void changeState(State state){
        this.uses = state;
    }


    // start de timer van een bepaalde taak
    public void startTimer(){
        if(uses.askStart()){
            if(!uses.isRunning()){
                System.out.println(uses.start());
                changeState(new OnState(this));
                startTime = System.currentTimeMillis();
            }
            else{
                System.out.println("De timer staat al aan. ");
            }
        }

        else if(!uses.askStart()){
            if(uses.isRunning()){
                pauseTimer();
            }
            else {
                System.out.println("De timer is niet gestart.");
            }
        }

        else{
            System.out.println("Verkeerde invoer, probeer opnieuw: ");
            startTimer();
        }
    }

    // Pauzeert de timer van een bepaalde taak
    public void pauseTimer() {
        if(uses.askPause()){
            if(uses.isRunning()){
                System.out.println(uses.stop());
                changeState(new OffState(this));
                finishTime = System.currentTimeMillis();
            }
            else{
                System.out.println("De timer is al gepauzeerd. ");
                System.out.println();
            }
        }

        else if(!uses.askPause()){
            if(uses.isRunning()){
                startTimer();
            }
            else {
                System.out.println("De timer is niet gepauzeerd. ");
                System.out.println();
            }
        }

        else{
            System.out.println("Verkeerde invoer, probeer opnieuw: ");
            pauseTimer();
        }
    }


    // Rekent milliseconden om naar seconden
    public long getTimeInSeconds(){
        long totalSeconds = elapsedTime / 1000;
        System.out.println("Aantal gewerkte seconden = " + totalSeconds);
        return totalSeconds;
    }

    // Rekent milliseconden om naar seconden
    public long getTimeInMinutes(){
        long totalSeconds = elapsedTime / 1000;
        long totalMinutes = totalSeconds / 60;

        System.out.println("Aantal gewerkte minuten = " + totalMinutes);
        return totalMinutes;
    }

    // Rekent milliseconden om naar uren
    public long getTimeInHours(){
        long totalSeconds = elapsedTime / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;

        System.out.println("Aantal gewerkte uren = " + totalHours);
        return totalHours;

    }

    public void calculateTime(){
        elapsedTime = finishTime - startTime;

        getTimeInSeconds();
        System.out.println("=");
        getTimeInMinutes();
        System.out.println("=");
        getTimeInHours();
        System.out.println();
    }



}
