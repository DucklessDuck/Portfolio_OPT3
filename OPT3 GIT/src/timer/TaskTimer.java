package timer;


import java.util.Scanner;

public class TaskTimer{

    long startTime;
    long finishTime;
    long passedTime;
    long elapsedTime;
    Scanner scanner = new Scanner(System.in);


    //Visualisation timer
    public void displayTime(){
        // ...
    }

    // start de timer van een bepaalde taak
    public void startTimer(){
        System.out.println("""
                Start de timer van deze taak?\s
                1. Ja\s
                2. Nee""");
        int choice = scanner.nextInt();

        if(choice == 1){
            startTime = System.currentTimeMillis();
            System.out.println("De timer is gestart!");
        }

        else if(choice == 2){
            System.out.println("De timer is niet gestart.");
        }

        else{
            System.out.println("Probeer opnieuw");
            startTimer();
        }
    }

    // Pauzeert de timer van een bepaalde taak
    public void pauseTimer() {
        System.out.println("""
                De timer op pauze zetten?
                1. Ja
                2. Nee""");
        int choice = scanner.nextInt();

        if(choice == 1){
            finishTime = System.currentTimeMillis();
            System.out.println("De timer is gepauzeerd!");
        }

        else if(choice == 2){
            System.out.println("De timer is niet gepauzeerd.");
        }

        else{
            System.out.println("Probeer opnieuw");
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
        passedTime += elapsedTime;

        getTimeInSeconds();
        getTimeInMinutes();
        getTimeInHours();
    }



}
