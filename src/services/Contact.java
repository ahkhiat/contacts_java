package services;
import java.util.Scanner;

public class Contact {

    public void addContact(Scanner scanner) {
        System.out.println("Ajouter un nouveau contact");
        System.out.println();

        System.out.println("Entrez son nom :");
        String lastname = scanner.nextLine();

        System.out.println("Entrez son prénom : ");
        String firstname = scanner.nextLine();

        System.out.println("Entrez son numéro de téléphone : ");
        String phone = scanner.nextLine();

    }

    public void searchContact() {
        System.out.println("Vous recherchez un contact");
    }

    public void displayALlContacts() {
        System.out.println("Vous voulez afficher tous les contacts");
    }


}
