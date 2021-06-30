package timer;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskList {
    private ArrayList<Task> taskList = new ArrayList<>();
    private static int uniqueTaskNumber = 1;

    Scanner scanner = new Scanner(System.in);

    public TaskList(){
        Task task1 = new TaskSchool("Taak voor school" , "OPT3", 20, getUniqueTaskNumber());
        Task task2 = new TaskWork("Taak voor werk" , 24, getUniqueTaskNumber());
        addTask(task1);
        addTask(task2);
    }

    public void display() {
        for(Task task : taskList){
            System.out.println("Taaknr" + task.getTaskNumber() + " Taaknaam: " + task.getTaskName());
        }
        System.out.println();
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
    public void renameTask(int taskNumber, String taskName){
        for (Task task : taskList) {
            if (task.getTaskNumber() == taskNumber) {
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


    // Haalt de taak op uit de lijst
    public Task getTask(int taskNumber) {
        for (Task task : taskList) {
            if (task.getTaskNumber() == taskNumber) {
                return task;
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
}

