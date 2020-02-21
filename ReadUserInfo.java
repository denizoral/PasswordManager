import java.io.*;
import java.util.Scanner;

public class ReadUserInfo {
    public ReadUserInfo(String website){
        try {
            File open = new File("/saved/" + website + ".txt");
            Scanner scan = new Scanner(open);
            System.out.format("%-17s %-20s%n", "|Username|", "|Password|");
            while(scan.hasNextLine()){
                String username = scan.nextLine();
                String password = scan.nextLine();
                System.out.format("%-18s %-21s%n", username, password);
            }
            scan.close();
        } catch (FileNotFoundException e){
            System.out.println(e);
        }
    }
}
