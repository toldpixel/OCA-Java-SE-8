package View;

public class GameUI implements GameInterfaceView {

    public GameUI() {
        System.out.println("OK - GameUI initialized!");
    }

    public void printGameMenu() {
        System.out.printf("Game of Consiousness\n");
        System.out.printf("Please choose your option\n");
        System.out.printf("[1] Start Game\n");
        System.out.printf("[0] End Program\n");
    }

    public void printLine(String msg) {
        System.out.printf("%s\n",msg);
    }

    public void clearConsoleScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}