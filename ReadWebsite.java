import java.io.*;
public class ReadWebsite {
    public void Table(){
        File[] open = new File("/saved/").listFiles();
        System.out.println("You currently registered in these websites: ");
        String noExt = null;
        for (File file : open){
            if (file != null && file.exists()) {
                String name = file.getName();
                noExt = name.replaceFirst("[.][^.]+$", "");
                System.out.println(">> " + noExt);
            }
        }
    }
}
