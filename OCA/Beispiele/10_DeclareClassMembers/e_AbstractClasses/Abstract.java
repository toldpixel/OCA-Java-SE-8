// Z:\JAV1\examples\10_DeclareClassMembers\e_AbstractClasses

// public class Abstract
// Abstract is not abstract

public abstract class Abstract
{
  public static void main(String[] args)
  {
    new Concrete().doIt();
    new Concrete().doMore();
  }
  
  // public abstract void doIt()
  //  error: ';' expected
  
  public abstract void doIt();
  // error: abstract methods cannot have a body
  /*
  {
    System.out.println("Abstract.public abstract void doIt()");
  }
  */
  
  // public final abstract void doMore();
  // error: illegal combination of modifiers
}