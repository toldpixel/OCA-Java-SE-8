// Z:\JAV1\examples\14_polymorphie\TestShapes\03

class Logo extends GameShape implements Animatable
{
  public void animate()
  {
    System.out.println("animating..." + getClass().getName());
  }
}