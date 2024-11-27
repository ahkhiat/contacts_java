import services.Contact;
import services.Home;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Home displayHome = new Home();
        boolean running = true;

        while(running) {
            displayHome.homeMenu();

            System.out.println(":");
            String choice = scanner.nextLine();

            if(choice.equals("1")) {
                Contact addContact = new Contact();
                addContact.addContact(scanner);
            }
            else if(choice.equals("2")) {
                Contact addContact = new Contact();
                addContact.searchContact();
            }
            else if(choice.equals("3")) {
                Contact addContact = new Contact();
                addContact.displayALlContacts();
            }
            else if(choice.equals("4")) {
                running = false;
            }

        }






    }

}

