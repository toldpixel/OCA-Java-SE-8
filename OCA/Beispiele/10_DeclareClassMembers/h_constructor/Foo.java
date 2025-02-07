// Z:\JAV1\examples\10_DeclareClassMembers\h_constructor

public class Foo
{
  private int x = 42;
  
  public Foo(int x)
  {
    super();
    this.x = x;
  }
  
  public Foo()
  {
    // super();
    // error: call to this must be first statement in constructor
    this(21);
    // super();
    // error: call to super must be first statement in constructor
  }
  
  public void doIt()
  {
  }
  
  private Foo(long y)
  {
  }
  
  // public final Foo(short s) {}
  // error: modifier final not allowed here
  
  public final void Foo(short s) {}
  
  // abstract Foo(double d);
  // Unsinn!!
}

class Bar extends Foo
{
  /*
  public Bar()
  {
    super();
  }
  */
  
  public Bar()
  {
    super();
    super.doIt();
  }
}

// Bill ist ein Singleton
class Bill
{
  private static Bill bill;
  
  private Bill()
  {
  }
  
  public static Bill getBill()
  {
    if (bill == null) bill = new Bill();
    return bill;
  }
}