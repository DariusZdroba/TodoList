import java.util.Scanner;
public class ConsoleAction {
    private static Scanner scanner = new Scanner(System.in);
    private static int input = 0;
    public static void start(){
        System.out.println("For adding items press 1");
        System.out.println("For showing current list, press 2");
        System.out.println("Or press 0 to Exit.");
        System.out.println("\n");
    }
    public static OutputType consoleOperation(){
        input = scanner.nextInt();
        scanner.nextLine();
        while(input !=0) {
                if (input == 1) return OutputType.Add;
                if (input == 2) return OutputType.Show;
                else {
                    System.out.println("Please enter 1 or 2, press 0 to exit");
                    System.out.println("Or press 0 to Exit.");
                    System.out.println("\n");
                    input = scanner.nextInt();
                    scanner.nextLine();
                }
            }


        return OutputType.Default;
    }
    public static String consoleAdd(){
        String line = scanner.nextLine();
        return line;
    }
}
