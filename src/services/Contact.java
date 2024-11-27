package services;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

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
        System.out.println("Entrez le nom ou le prénom du contact à rechercher");

        String searchName = scanner.nextLine().toLowerCase();

        boolean found = false;
        for (User user : users) {
            if (user.getLastname().toLowerCase().contains(searchName) || user.getFirstname().toLowerCase().contains(searchName)) {
                System.out.println(user);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Aucun contact trouvé avec le nom : " + searchName);
        }
        System.out.println();
    }

    public void displayALlContacts(Scanner scanner) {
        System.out.println("-------------------------");
        System.out.println("Liste des contacts");
        System.out.println("-------------------------");
        System.out.println("1 -> Par ordre croissant");
        System.out.println("2 -> Par ordre décroissant");

        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            Collections.sort(users, new Comparator<User>() {
                @Override
                public int compare(User user1, User user2) {
                    return user1.getLastname().compareTo(user2.getLastname());
                }
            });
        }
        else if (choice.equals("2")) {
            Collections.sort(users, new Comparator<User>() {
                @Override
                public int compare(User user1, User user2) {
                    return user2.getLastname().compareTo(user1.getLastname()); // Tri par nom inverse
                }
            });
        }
        else {
            System.out.println("Veuillez taper 1 ou 2");
        }
        for (User user : users) {
            System.out.println(user);
        }
        System.out.println();
    }


}
