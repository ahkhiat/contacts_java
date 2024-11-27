import services.Contact;
import services.Home;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Home displayHome = new Home();
        Contact contactManager = new Contact();

        boolean running = true;

        while(running) {
            displayHome.homeMenu();

            System.out.println(":");
            String choice = scanner.nextLine();

            // Ajouter un contact
            if(choice.equals("1")) {
                boolean runAddContact = true;

                while (runAddContact) {
                    contactManager.addContact(scanner);
                    System.out.println("1 -> Entrer un nouveau contact");
                    System.out.println("2 -> Revenir au menu principal");
                    String continueAdd = scanner.nextLine();

                    if (!continueAdd.equals("1")){
                        runAddContact = false;
                    }
                }
            }
            // Rechercher un contact
            else if(choice.equals("2")) {
                boolean runSearchContact = true;

                while (runSearchContact) {
                    contactManager.searchContact(scanner);
                    System.out.println("1 -> Rechercher un nouveau contact");
                    System.out.println("2 -> Revenir au menu principal");
                    String continueSearch = scanner.nextLine();

                    if (!continueSearch.equals("1")){
                        runSearchContact = false;
                    }
                }
            }
            // Afficher tous les contacts
            else if(choice.equals("3")) {
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
            }
            else if(choice.equals("4")) {
                running = false;
            }

        }






    }

}

