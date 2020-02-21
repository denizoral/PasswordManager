import java.io.IOException;
import java.nio.file.*;
public class DeleteWebsite {
    public DeleteWebsite(String website){
        try{
            if(Files.deleteIfExists(Paths.get("/saved/" + website + ".txt"))){
                System.out.println("Operation complete!");
            } else {
                System.out.println("Website not found.");
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
