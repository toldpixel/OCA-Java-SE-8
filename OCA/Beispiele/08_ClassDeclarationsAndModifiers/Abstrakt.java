// Z:\JAV1\examples\08_ClassDeclarationsAndModifiers

// public class Abstrakt
// error: Abstrakt is not abstract and does not override abstract
// method doSomething() in Abstrakt

public abstract class Abstrakt
{
  public static void main(String[] args)
  {
    System.out.println("Abstrakt");
    
 // Abstrakt abs = new Abstrakt();
 // error: Abstrakt is abstract; cannot be instantiated
 
    Abstrakt a = new Konkret();
    a.doSomething();
  }
  
  // public void doSomething();
  // error: missing method body, or declare abstract
  
  // public static abstract void doSomething();
  // error: illegal combination of modifiers: abstract and static
  
  public abstract void doSomething();
  
  /*
  public void doSomething()
  {
    System.out.println("Nöh!");
  }
  error: method doSomething() is already defined in class Abstrakt
  */
}

// class Konkret extends Abstrakt
// error: Konkret is not abstract and does not override abstract 
// method doSomething() in Abstrakt

class Konkret extends Abstrakt
{
  @Override
  public void doSomething()
  {
    System.out.println("Ok, mach ich!");
  }
}