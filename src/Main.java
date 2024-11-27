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

            if(choice.equals("1")) {
                contactManager.addContact(scanner);
            }
            else if(choice.equals("2")) {
                contactManager.searchContact(scanner);
            }
            else if(choice.equals("3")) {
                contactManager.displayALlContacts();
            }
            else if(choice.equals("4")) {
                running = false;
            }

        }






    }

}

