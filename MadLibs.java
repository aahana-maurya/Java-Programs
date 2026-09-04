import java.util.Scanner;

public class MadLibs{

    public static void main(String[] args){
        // MAD LIBS GAME

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.println("Enter an adjective(descriptive): ");
        adjective1 = scanner.nextLine();

        System.out.println("Enter a noun (food or dish): ");
        noun1 = scanner.nextLine();

        System.out.println("Enter an adjective(descriptive): ");
        adjective2 = scanner.nextLine();

        System.out.println("Enter a verb: ");
        verb1 = scanner.nextLine();

        System.out.println("Enter an adjective(descriptive)");
        adjective3 = scanner.nextLine();

        System.out.println("Yesterday, a/an " + adjective1 + " chef tried to cook a gourmet " + noun1 + " for dinner.");
        System.out.println("The kitchen smelled completely " + adjective2 + ",");
        System.out.println("forcing the chef to " + verb1 + " out the window.");
        System.out.println("The neighbors called it a truly " + adjective3 + " meal! ");


        scanner.close();



    }
}