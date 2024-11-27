package services;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import models.User;

public class Contact {

    private List<User> users;

    public Contact() {
        users = new ArrayList<>();
    }

    public void addContact(Scanner scanner) {
        System.out.println("Ajouter un nouveau contact");
        System.out.println();

        System.out.println("Entrez son nom :");
        String lastname = scanner.nextLine();

        System.out.println("Entrez son prénom : ");
        String firstname = scanner.nextLine();

        System.out.println("Entrez son numéro de téléphone : ");
        String phone = scanner.nextLine();

        User user = new User(firstname, lastname, phone);
        users.add(user);
    }

    public void searchContact(Scanner scanner) {
        System.out.println("Vous recherchez un contact");
        String searchName = scanner.nextLine();

        boolean found = false;
        for (User user : users) {
            if (user.getLastname().equalsIgnoreCase(searchName)) {
                System.out.println("Contact trouvé :");
                System.out.println(user);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Aucun contact trouvé avec le nom : " + searchName);
        }
        System.out.println();
    }

    public void displayALlContacts() {
        System.out.println("Vous voulez afficher tous les contacts");
    }


}
