// Z:\JAV1\examples\10_DeclareClassMembers\c_finalMethods

public class Sub extends Super
{
  public static void main(String[] args)
  {
    new Sub().doIt();
    new Sub().doMore();
  }
  
  public void doIt()
  {
    System.out.println("Sub.public void doIt()");    
  }
  
  /*
  public void doMore()
  {
    System.out.println("Sub.public final void doMore()");
  }
      error: doMore() in Sub cannot override doMore() in Super
      public void doMore()
                  ^
      overridden method is final
  */
}