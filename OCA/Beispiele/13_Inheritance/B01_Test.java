// Z:\JAV1\examples\13_Inheritance

public class B01_Test extends Abstract implements Iface
{
  private int var;
  
  B01_Test(int var)
  {
    this.var = var;
  }
  
  public static void main(String[] args)
  {
    B01_Test t1 = new B01_Test(42);
    B01_Test t2 = new B01_Test(21);
    B01_Test t3 = new B01_Test(42);
    String   s1 = new String("x");
    
    if (!t1.equals(t2))
      System.out.println("not equal");
    
    if (t1 instanceof Object)
      System.out.println("t1 is an Object");
    
    System.out.println(t1);
    System.out.println(t2);
    
    System.out.println(t1.equals(t2));
    System.out.println(t1.equals(t3));
    System.out.println(t1.equals(null));
    System.out.println(t1.equals(s1));
    
    new B01_Test(1).saySomething();
  }
  
  public boolean equals(Object obj)
  {
    return    (obj != null)                 // nicht null
           && (obj instanceof B01_Test)     // Klasse überprüfen
           && (var == ((B01_Test)obj).var); // variablen prüfen
  }
  
  // Iface.z = 4;
  int y = Iface.z;
  
  public void doIt() {}
  public void doMore() {}
}

interface Iface
{
  public static final int z = 3;
  void doMore();
  
  default void saySomething()
  {
    System.out.println("default void saySomething()");
  }
}

abstract class Abstract
{
  public abstract void doIt();
}