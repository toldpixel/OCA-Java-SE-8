package Controller;
import View.*;
import java.util.*;
import Model.*;

public class InitController {
    private static Player player;
    private static GameUI gameUI;
    private static GameController gameController;
    public static final Scanner scanner = new Scanner(System.in);
    

    public void setGameUI() {
        gameUI = new GameUI();
    } 

    public GameUI getGameUI() {
        return gameUI;
    }

    public void setGameController() {
        gameController = new GameController();
    }

    private GameController getGameController() {
        return gameController;
    }

    public GameController init() {
        setGameUI();
        setGameController();

        return getGameController();
    }

    public String getTime() {
        return TimeHandler.getStartDate();
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer() {
        player = new Player();
    }
}