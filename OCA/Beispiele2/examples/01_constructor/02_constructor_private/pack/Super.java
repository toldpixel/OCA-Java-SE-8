// Z:\JAV2\examples\01_constructor\02_constructor_private

package pack;

public class Super
{
  private static Super sup = null;
  
  private Super()
  {
 // sup = new Super();
 // Exception in thread "main" java.lang.StackOverflowError
  }
  
  public static Super factory()
  {
 // sup = sup == null ? new Super() : sup;
    return sup;
  }
  
  public static class SuperSub extends Super
  {
    @Override
    public void saySomething()
    {
      super.saySomething();
    }
  }
  
  protected void saySomething()
  {
    System.out.println("protected void saySomething()");
  }
  
  // Das Super-Objekt wird wenn die Klasse geladen wird erzeugt.
  // Daher braucht die factory-Methode keine Prüfung zu machen.
  static
  {
    sup = new Super();
  }
}