import Controller.*;

class Starter {
    public static void main(String[] args) {
        InitController c1 = new InitController();
        InitController gameController = (InitController) c1.init();
        ((GameController)gameController).game();
    }
}