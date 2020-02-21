public class Strings {
    public void greet(){
        final String GREET = "Welcome to password manager v1.0";
        final String HELP = "type 'help' for all commands.";
        System.out.println(GREET + "\n" + HELP);
    }
    public void commands(){
        final String COMMANDS = "\nCommands:" +
                "\n1-Add a website\n2-List all websites\n3-Delete a website\n4-List your username and password\n" +
                "5-exit";
        System.out.println(COMMANDS);
    }
}
