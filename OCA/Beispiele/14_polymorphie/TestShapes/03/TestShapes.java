// Z:\JAV1\examples\14_polymorphie\TestShapes\01

public class TestShapes
{
  public static void main(String[] args)
  {
    PlayerPiece shape = new PlayerPiece();
    TilePiece   tile  = new TilePiece();
    Logo        logo  = new Logo();

    GameShape[] shapes = {shape, tile, logo};
    
    for (GameShape gs : shapes)
    {
      doShapes(gs);

      if (gs instanceof PlayerPiece)
        ((PlayerPiece)gs).movePiece();
      
      if (gs instanceof Animatable)
        doAnimation((Animatable)gs);
    }
  }
  
  public static void doShapes(GameShape shape)
  {
    shape.displayShape();
  }
  
  public static void doAnimation(Animatable piece)
  {
    piece.animate();
  }
}