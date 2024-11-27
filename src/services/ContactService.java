package services;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

import models.Contact;

public class ContactService {

    private List<Contact> contacts;

    public ContactService() {
        contacts = new ArrayList<>();
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

        Contact contact = new Contact(firstname, lastname, phone);
        contacts.add(contact);
    }

    public void searchContact(Scanner scanner) {
        System.out.println("Entrez le nom ou le prénom du contact à rechercher");

        String searchName = scanner.nextLine().toLowerCase();

        boolean found = false;
        for (Contact contact : contacts) {
            if (contact.getLastname().toLowerCase().contains(searchName) || contact.getFirstname().toLowerCase().contains(searchName)) {
                System.out.println(contact);
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
            // Tri croissant
            Collections.sort(contacts, new Comparator<Contact>() {
                @Override
                public int compare(Contact contact1, Contact contact2) {
                    return contact1.getLastname().compareTo(contact2.getLastname());
                }
            });
        }
        else if (choice.equals("2")) {
            // Tri décroissant
            Collections.sort(contacts, new Comparator<Contact>() {
                @Override
                public int compare(Contact contact1, Contact contact2) {
                    return contact2.getLastname().compareTo(contact1.getLastname());
                }
            });
        }
        else {
            System.out.println("Veuillez taper 1 ou 2");
        }
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
        System.out.println();
    }


}
