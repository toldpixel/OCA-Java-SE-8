package Controller;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class GameController extends InitController {
      
    public GameController() {
        System.out.println("OK - GameController initialized!");
    }

    public void game() {
        int option;
        do {
            getGameUI().clearConsoleScreen();
            getGameUI().printGameMenu();
            getGameUI().printLine("Option: ");
            option = scanner.nextInt();
            switch(option) {
                case 1:
                    start();
                    break;
                case 2:
                    getGameUI().printLine("Game Options");
                    break;
                default:
            }
        } while(option != 0);
        getGameUI().printLine("End of Game!");
    }

    public void start() {
            setPlayer();
            getGameUI().clearConsoleScreen();
            getGameUI().printLine("Hello Friend - its " + getTime() + " today is your first day!");
            
            try {
                    getGameUI().printLine("Please enter your Name:");
                    scanner.nextLine();
                    getPlayer().setName(scanner.nextLine().trim());
                    getGameUI().printLine("Please enter your Age:");
                    getPlayer().setAge(scanner.nextInt());
                    scanner.nextLine();
                    getGameUI().printLine("Please enter your Country:");
                    getPlayer().setCountry(scanner.nextLine().trim());
                    getGameUI().printLine("Started Game");
            } catch (InputMismatchException e) {
                System.out.println("Shit happened!");
            }

        
            
           
            

            scanner.nextLine();
          
    }
}