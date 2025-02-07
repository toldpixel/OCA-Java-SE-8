// Z:\JAV1\examples\14_polymorphie\TestShapes\01

class PlayerPiece extends GameShape implements Animatable
{
  public void movePiece()
  {
    System.out.println("moving: " + getClass().getName());
  }
  
  public void animate()
  {
    System.out.println("animating..." + getClass().getName());
  }
}

/*
    Erbt die generische Methode displayShape, und fügt eigene
    Methoden hinzu.
*/