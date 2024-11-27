import services.ContactService;
import services.Home;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ContactService contactManager = new ContactService();
        Home displayHome = new Home(contactManager, scanner);

        displayHome.homeMenu();

    }

}

