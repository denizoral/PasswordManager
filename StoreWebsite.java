import java.io.*;
import java.io.IOException;

public class StoreWebsite {
    public StoreWebsite(String website, String username, String password) {
        FileWriter write;
        try {
            write = new FileWriter("/saved/" + website + ".txt", true);
            write.write(username + "\n" + password + "\n");
            write.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
