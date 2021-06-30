package timer;

import java.util.Scanner;

public class MenuOption {
    private TaskList taskList;
    Scanner scanner = new Scanner(System.in);

    public MenuOption(){
        taskList = new TaskList();
    }

    public void printMenu(){
        System.out.println("""
                    1. Taak voor school aanmaken
                    2. Taak voor werk aanmaken
                    3. Takenlijst ophalen
                    4. Gewerkte tijd ophalen van taak
                    5. Start timer
                    6. Stop timer
                    7. Verwijder taak
                    8. Wijzig de naam van de taak
                    9. Gewerkte tijd(sec, min, hrs) van een bepaalde taak zien
                    0. Exit
                    """);
    }

    public void option1(){
        System.out.println("Naam van de taak?:\n");
        String name = scanner.nextLine();
        System.out.println("Naam van het vak?");
        String subject = scanner.nextLine();
        taskList.createTaskSchool(name, subject);
    }

    public void option2(){
        System.out.println("Naam van de taak?:\n");
        String name = scanner.nextLine();
        taskList.createTaskWork(name);
    }

    public void option3(){
        taskList.display();
    }

    public void option4(){
        System.out.println("Welke taak wilt u de gewerkte uren van ophalen?: ");
        taskList.display();
        System.out.println("Taaknummer: ");
        int taskNumber = scanner.nextInt();
       taskList.getTask(taskNumber).getHoursPassed();
    }

    public void option5(){
        System.out.println("Welke timer wilt u starten?");
        taskList.display();
        System.out.println("Uw keuze (cijfer): ");
        int choiceTask = scanner.nextInt();
        if(choiceTask != 0){
            taskList.getTask(choiceTask).getTimer().startTimer();
        }
    }

    public void option6(){
        System.out.println("Welke timer wilt u stoppen?");
        taskList.display();
        System.out.println("Nummer 0 om terug te gaan.");
        System.out.println("Uw keuze (cijfer): ");
        int choiceTask = scanner.nextInt();
        if(choiceTask != 0){
            taskList.getTask(choiceTask).getTimer().pauseTimer();
        }
    }

    public void option7(){
        System.out.println("Welke taak wilt u verwijderen? ");
        taskList.display();
        System.out.println("Nummer 0 om terug te gaan.");
        System.out.println("Uw keuze (cijfer): ");
        int choiceTask = scanner.nextInt();
        if(choiceTask != 0){
            taskList.removeTask(taskList.getTask(choiceTask));
        }
    }

    public void option8(){
        System.out.println("Van welke taak wilt u de naam veranderen?");
        taskList.display();
        System.out.println("Vul het taaknummer in: ");
        int taskNumber = scanner.nextInt();
        System.out.println("Naar welke naam wilt u de taak benoemen (Zonder spaties)? : ");
        scanner.nextLine();
        String taskName = scanner.nextLine();
        taskList.renameTask(taskNumber, taskName.trim());
    }

    public void option9(){
        System.out.println("Van welke taak wilt u alle tijden zien?");
        taskList.display();
        System.out.println("Nummer 0 om terug te gaan.");
        System.out.println("Uw keuze (cijfer): ");
        int choiceTask = scanner.nextInt();

        if(choiceTask != 0) {
            taskList.getTask(choiceTask).getTimer().calculateTime();
        }
    }

}
