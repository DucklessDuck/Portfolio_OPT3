package timer;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskList {
    private Boolean statusDone;
    private ArrayList<Task> taskList = new ArrayList<>();
    private static int uniqueTaskNumber = 0;

    Scanner scanner = new Scanner(System.in);

    public void display() {
        for(Task task : taskList){
            System.out.println("|" + task.getTaskName() + " |TaakNr: " + task.getTaskNumber() + " |benodigde uren: " + task.getRequiredTime());
        }
    }

    // Maakt de taak aan en voegt de taak toe aan de tasklist
    public void addTask(Task task) {
        taskList.add(task);
    }

    // Verwijdert de gekozen taak
    public void removeTask(Task task) {
        taskList.remove(task);
    }

    // Wijzigt de naam van de taak
    public void renameTask(String taskName){
        for (Task task : taskList) {
            if (task.getTaskName().equals(taskName)) {
                task.setTaskName(taskName);
            }
            else{
                System.out.println("Taak niet gevonden.");
            }
        }
    }

    // Aanmaken unieknummer voor nieuwe taak
    public int getUniqueTaskNumber(){
        return uniqueTaskNumber++;
    }

    // Haalt de gemaakte uren op van alle taken
    public int getTotalHours() {
        int totalHours = 0;
        for(Task task : taskList){
            totalHours += task.getHoursPassed();
        }
        return totalHours;
    }

    // Haalt de taak op uit de lijst
    public Task getTask(int taskNumber) {
        for (Task task : taskList) {
            if (task.getTaskNumber() == taskNumber) {
                return task;
            }
            else{
                return null;
            }
        }
        return null;
    }

    // aanmaken en toevoegen van een Werktaak
    public void createTaskWork(String taskName){
        int requiredTime = askRequiredTime();

        if(taskName.replaceAll("\\s", "").length() != 0 && requiredTime == 0){
            Task task = new TaskWork(taskName, getUniqueTaskNumber());
            addTask(task);
        }
        else if(taskName.replaceAll("\\s", "").length() != 0 && requiredTime > 0){
            Task task = new TaskWork(taskName, requiredTime, getUniqueTaskNumber());
            addTask(task);
        }
        else{
            System.out.println("De taak heeft geen naam");
        }
    }

    // aanmaken en toevoegen van een Schooltaak
    public void createTaskSchool(String taskName, String subject){
        int requiredTime = askRequiredTime();

        if(taskName.replaceAll("\\s", "").length() != 0 && requiredTime == 0){
            Task task = new TaskSchool(taskName, subject, getUniqueTaskNumber());
            addTask(task);
        }
        else if(taskName.replaceAll("\\s", "").length() != 0 && requiredTime > 0){
            Task task = new TaskSchool(taskName, subject,  requiredTime, getUniqueTaskNumber());
            addTask(task);
        }
        else{
            System.out.println("De taak heeft geen naam");
        }
    }

    public int askRequiredTime(){
        System.out.println("Heeft u benodigde uren? J/N: ");
        String keuze = scanner.nextLine();
        if(keuze.equalsIgnoreCase("j")) {
            System.out.println("Hoeveel uren?: ");
            return scanner.nextInt();
        }
        else{
            return 0;
        }
    }

    //checkt de status van de taak
    public Boolean checkStatusTask(Task task){
        if(task.getRequiredTime() < task.getHoursPassed()) {
            statusDone = true;
        }
        else statusDone = task.getHoursPassed() == task.getRequiredTime();
        return statusDone;
    }

}
