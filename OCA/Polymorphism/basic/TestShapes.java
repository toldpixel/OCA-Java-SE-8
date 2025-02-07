class GameShape {
    public void displayShape() {
        System.out.println("displaying shape");
    }
}

class PlayerPiece extends GameShape {
    public void movePiece() {
        System.out.println("moving game piece");
    }
}

class TilePiece extends GameShape {
    public void getAdjacent() {
        System.out.println("getting adjacent tiles");
    }
}

public class TestShapes {
    public static void main (String[] args) {
        PlayerPiece player = new PlayerPiece();
        TilePiece tile = new TilePiece();
        TilePiece tile2 = new TilePiece();
        PlayerPiece player2 = new PlayerPiece();

        GameShape[] arr = {player, player2, tile, tile2};
        //doShapes(player);
        //doShapes(tile);

        filterShapes(arr);
    }

    public static void doShapes(GameShape shape) {
        shape.displayShape();
    }

    public static void filterShapes(GameShape[] arr) {
        for(GameShape x : arr) {
            if(x instanceof PlayerPiece) {
                ((PlayerPiece)x).movePiece();
            } else {
                ((TilePiece)x).getAdjacent();
            } 
            
        }
    }
}