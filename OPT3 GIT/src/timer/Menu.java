package timer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private TaskList taskList;
    String name;

    Scanner scanner = new Scanner(System.in);

    public Menu(){
        taskList = new TaskList();
    }

    public void menu() {
        boolean loop = true;
        try {
            while (loop) {
                printMenu();
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                    option1();
                }

                if (choice == 2) {
                    option2();
                }

                if (choice == 3) {
                    taskList.display();
                }
                if (choice == 4) {
                    option4();
                }

                if (choice == 5) {
                    option5();
                }

                if (choice == 6) {
                    option6();
                }

                if(choice == 7){
                    option7();
                }
                if(choice == 8){
                    option8();
                }
                if (choice == 9){
                    option9();
                }

                if (choice == 0) {
                    loop = false;
                    System.out.println("Programma wordt afgesloten, BYE!");
            }
        } catch (InputMismatchException e){
            System.out.println("Invalid, try again. ");
        }
    }

    private void printMenu(){
        System.out.println("""
                    1. Taak voor school aanmaken
                    2. Taak voor werk aanmaken
                    3. Takenlijst ophalen
                    4. Gewerkte tijd ophalen van taak
                    5. Start timer
                    6. Stop timer
                    7. Verwijder taak
                    8. Wijzig de naam van de taak
                    9. Gewerkte tijd van een bepaalde taak zien
                    0. Exit
                    """);
    }

    private void option1(){
        setName();
        System.out.println("Naam van het vak?");
        String subject = scanner.nextLine();
        taskList.createTaskSchool(name, subject);
    }

    private void option2(){
        setName();
        taskList.createTaskWork(name);
    }

    private void option4(){
        System.out.println("Welke taak wilt u de gewerkte uren van ophalen?: ");
        taskList.display();
        System.out.println("Taaknummer: ");
        int taskNumber = scanner.nextInt();
        taskList.getTask(taskNumber);
    }

    private void option5(){
        System.out.println("Welke timer wilt u starten?");
        taskList.display();
        System.out.println("Uw keuze (cijfer): ");
        int choiceTask = scanner.nextInt();
        if(choiceTask == 0){
            menu();
        }
        else {
            taskList.getTask(choiceTask).getTimer().startTimer();
        }
    }

    private void option6(){
        System.out.println("Welke timer wilt u stoppen?");
        taskList.display();
        System.out.println("Nummer 0 om terug te gaan.");
        System.out.println("Uw keuze (cijfer): ");
        int choiceTask = scanner.nextInt();
        if(choiceTask == 0){
            menu();
        }
        else {
            taskList.getTask(choiceTask).getTimer().pauseTimer();
        }
    }

    public void option7(){
        System.out.println("Welke taak wilt u verwijderen? ");
        taskList.display();
        System.out.println("Nummer 0 om terug te gaan.");
        System.out.println("Uw keuze (cijfer): ");
        int choiceTask = scanner.nextInt();
        if(choiceTask == 0){
            menu();
        }
        else {
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
        System.out.println("Van welke taak wilt u de tijd van zien?");
        taskList.display();
        System.out.println("Nummer 0 om terug te gaan.");
        System.out.println("Uw keuze (cijfer): ");
        int choiceTask = scanner.nextInt();
        if(choiceTask == 0){
            menu();
        }
        else {
            taskList.getTask(choiceTask).getTimer().calculateTime();
        }
    }


    private void setName(){
        System.out.println("Naam van de taak?:\n");
        name = scanner.nextLine();
    }


}
