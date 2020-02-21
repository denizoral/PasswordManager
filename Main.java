import org.w3c.dom.ls.LSOutput;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Initialize variables
        Strings str = new Strings();
        str.greet();
        Scanner scan = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);
        boolean run = true;
        ReadWebsites read = new ReadWebsites();
        String newTable;

        //Start program
        while (run) {
            System.out.print(">> ");
            String selection = intScanner.nextLine().toLowerCase();
            switch (selection) {
                case "1":
                    System.out.print("Please enter website name: ");
                    String website = scan.nextLine();
                    System.out.print("Enter your username for this website: ");
                    String username = scan.nextLine();
                    System.out.print("Enter password for this website: ");
                    String password = scan.nextLine();
                    System.out.println();
                    System.out.println("==================================");
                    System.out.println("Saving your information to a file");
                    System.out.println("==================================\n");
                    Websites init = new Websites(website, username, password);
                    newTable = website;
                    System.out.println("New website added: " + newTable + "\n");
                    break;
                case "2":
                    System.out.println(read.Table());
                    System.out.println();
                    break;
                case "3":
                    System.out.print("Enter website name >> ");
                    String delweb = scan.nextLine();
                    DeleteWebsite del = new DeleteWebsite(delweb);
                    System.out.println();
                    break;
                case "4":
                    System.out.println("From which website are you requesting your user info? ");
                    String input = scan.nextLine();
                    ReadUserInfo user = new ReadUserInfo(input);
                    System.out.println();
                    break;
                case "5":
                    System.out.println("Goodbye!");
                    run = false;
                    break;
                case "help":
                    str.commands();
                    System.out.println();
                    break;
                default:
                    System.out.println(selection + " is not recognized");
                    System.out.println();
                    break;
            }
        }
    }
}
