package services;

import java.util.Scanner;

public class MenuDisplay {

    private final Scanner scanner;

    public MenuDisplay(Scanner scanner) {
        this.scanner = scanner;
    }

    public void showMenu() {
        System.out.println("*****************************");
        System.out.println("***    APPLI CONTACTS     ***");
        System.out.println("*****************************");
        System.out.println("1 -> Ajouter un contact");
        System.out.println("2 -> Rechercher un contact");
        System.out.println("3 -> Afficher tous les contacts");
        System.out.println("4 -> Quitter");
    }

    public String getUserChoice() {
        System.out.print(" : ");
        return scanner.nextLine();
    }
}
