public class Strings {
    final String GREET = "Welcome to password manager v1.0";
    final String HELP = "type 'help' for all commands.";
    final String COMMANDS = "\nCommands:" +
                "\n1-Add a website\n2-List all websites\n3-Delete a website\n4-List your username and password\n" +
                "5-exit";
    
    public void greet(){
        System.out.println(GREET + "\n" + HELP);
    }
    public void commands(){
        System.out.println(COMMANDS);
    }
}
