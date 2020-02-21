import org.w3c.dom.ls.LSOutput;

import java.awt.*;
import java.util.Scanner;

public class Main {

    //Initialize variables
    static Strings str = new Strings();
    static Scanner scan = new Scanner(System.in);
    static Scanner intScanner = new Scanner(System.in);
    static boolean run = true;
    static ReadWebsite read = new ReadWebsite();
    static String newTable;



    public static void main(String[] args) {
        str.greet();
        //Start program
        runProgram();
    }


    public static void runProgram(){
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
                    StoreWebsite init = new StoreWebsite(website, username, password);
                    newTable = website;
                    System.out.println("New website added: " + newTable + "\n");
                    break;
                case "2":
                    read.Table();
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
                    System.out.format("(%s) >>", selection);
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
