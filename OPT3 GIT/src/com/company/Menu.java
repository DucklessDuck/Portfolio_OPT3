package com.company;

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
        while(loop) {
            System.out.println("""
                    1. Taak voor school aanmaken
                    2. Taak voor werk aanmaken
                    3. Takenlijst ophalen
                    4. Exit
                    """);

            int keuze = scanner.nextInt();
            scanner.nextLine();

            if (keuze == 1) {
                setName();
                    System.out.println("Naam van het vak?");
                    String subject = scanner.nextLine();
                    taskList.createTaskSchool(name, subject, true);
            }

            if(keuze == 2){
                setName();
                    Task task = new TaskWork(name, taskList.getUniqueTaskNumber());
                    taskList.createTaskWork(name,false);
                    taskList.addTask(task);
            }

            if(keuze == 3){
                taskList.display();
            }
        }
    }

    private void setName(){
        System.out.println("Naam van de taak?:\n");
        name = scanner.nextLine();
    }


}

