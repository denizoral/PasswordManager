import java.io.*;
public class ReadWebsites {
    public String Table(){
        File[] open = new File("/saved/").listFiles();
        System.out.println("You currently registered in these websites: ");
        String noExt = null;
        for (File file : open){
            if (file != null && file.exists()) {
                String name = file.getName();
                noExt = name.replaceFirst("[.][^.]+$", "");
            }
        }

        return noExt + "\n============";
    }
}
