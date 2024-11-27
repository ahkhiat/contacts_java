package services;
import java.util.Scanner;

public class Home {

    private final Scanner scanner;
    private final ContactService contactManager;
    private final MenuDisplay menuDisplay;

    public Home(ContactService contactManager, Scanner scanner) {
        this.contactManager = contactManager;
        this.scanner = scanner;
        this.menuDisplay = new MenuDisplay(scanner);
    }

    public  void homeMenu() {

        boolean running = true;

        while(running) {

            // Affichage du menu d'accueil
            menuDisplay.showMenu();

            String choice = menuDisplay.getUserChoice();

            // Ajouter un contact
            if (choice.equals("1")) {
                boolean runAddContact = true;

                while (runAddContact) {
                    contactManager.addContact(scanner);
                    System.out.println("1 -> Entrer un nouveau contact");
                    System.out.println("2 -> Revenir au menu principal");
                    String continueAdd = scanner.nextLine();

                    if (!continueAdd.equals("1")) {
                        runAddContact = false;
                    }
                }
            }

            // Rechercher un contact
            else if (choice.equals("2")) {
                boolean runSearchContact = true;

                while (runSearchContact) {
                    contactManager.searchContact(scanner);
                    System.out.println("1 -> Rechercher un nouveau contact");
                    System.out.println("2 -> Revenir au menu principal");
                    String continueSearch = scanner.nextLine();

                    if (!continueSearch.equals("1")) {
                        runSearchContact = false;
                    }
                }
            }

            // Afficher tous les contacts
            else if (choice.equals("3")) {
                boolean runDisplayAllContacts = true;

                while (runDisplayAllContacts) {
                    contactManager.displayALlContacts(scanner);
                    System.out.println("1 -> Lister les contacts à nouveau");
                    System.out.println("2 -> Revenir au menu principal");
                    String continueDisplay = scanner.nextLine();

                    if (!continueDisplay.equals("1")) {
                        runDisplayAllContacts = false;
                    }
                }

            } else if (choice.equals("4")) {
                System.out.println("-----------------------------");
                System.out.println("A bientôt");
                running = false;
            }
        }
    }
}
