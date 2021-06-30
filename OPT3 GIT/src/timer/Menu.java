package timer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    MenuOption shows;
    Scanner scanner = new Scanner(System.in);

    public Menu() {
        shows = new MenuOption();
    }

    public void menu() {
        boolean loop = true;
        try {
            while (loop) {
                shows.printMenu();
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                    shows.option1();
                }

                if (choice == 2) {
                    shows.option2();
                }

                if (choice == 3) {
                    shows.option3();
                }
                if (choice == 4) {
                    shows.option4();
                }

                if (choice == 5) {
                    shows.option5();
                }

                if (choice == 6) {
                    shows.option6();
                }

                if (choice == 7) {
                    shows.option7();
                }
                if (choice == 8) {
                    shows.option8();
                }
                if (choice == 9) {
                    shows.option9();
                }

                if (choice == 0) {
                    loop = false;
                    System.out.println("Programma wordt afgesloten, BYE!");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid, try again. ");
        }
    }

    }




