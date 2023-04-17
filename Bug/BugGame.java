/*  Alice Lily
    Allows the user to control a Bug object created from the Bug class
    They can move the bug one at a time, turn it around, and display its
    position on the screen. The user can exit at any time.              */

//Import for Scanner
import java.util.Scanner;
import bugpkg.Bug;

public class BugGame {

    public static void main(String[] args) {
        //Initialize new bug for game, scanner for input and boolean to keep loop active
        Bug bug = new Bug();
        Scanner scan = new Scanner(System.in);
        boolean play = true;

        //List off the options and display the starting status of the bug
        System.out.println("Welcome to the bug moving game! Here are your commands: ");
        System.out.println("1 - Move the bug in it's current direction.");
        System.out.println("2 - Turn the bug to the other direction.");
        System.out.println("3 - Output the current status of the bug.");
        System.out.println("4 - Start over in a new position. ");
        System.out.println("Any other number - Exit the game. \n");
        System.out.println(bug.toString());

        while (play) {

            //Prompt for command
            System.out.println("Please enter a command (enter 5 to show the commands again): ");
            int command = scan.nextInt();


            switch (command) {
                case 1:         //Move bug when 1 is entered
                    bug.move();
                    break;
                case 2:         //Turn bug when 2 is entered
                    bug.turn();
                    break;
                case 3:         //Display status of bug when 3 is entered
                    System.out.println(bug.toString());
                    break;
                case 4:         //Initialize new bug when 4 is entered
                    bug = new Bug();
                    System.out.println("Restarting... \n" + bug.toString());
                    break;
                case 5:         //Re-display commands when 5 is entered
                    System.out.println("1 - Move the bug in it's current direction.");
                    System.out.println("2 - Turn the bug to the other direction.");
                    System.out.println("3 - Output the current status of the bug.");
                    System.out.println("4 - Start over in a new position. ");
                    System.out.println("Any other number - Exit the game. \n");
                    break;
                default:        //If any other number entered, prompt to confirm end of game.
                    System.out.println("Are you sure you'd like to quit? 0 to confirm," +
                                            " anything else to keep playing:");
                    if (scan.nextInt() == 0) {
                        System.out.println("Thank you for playing!");
                        play = false;
                        break;
                    } else
                        System.out.println("Returning to the game!");
                        break;
            }
        }
    }
}
