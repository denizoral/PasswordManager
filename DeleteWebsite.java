import java.io.IOException;
import java.nio.file.*;
public class DeleteWebsite {
    public DeleteWebsite(String website){
        try{
            Files.deleteIfExists(Paths.get("/saved/" + website + ".txt"));
            System.out.println("Operation complete!");
        } catch (NoSuchFileException e) {
            e.printStackTrace();
        } catch (IOException e){
            System.out.println("This website does not exist.");
        }
    }
}
