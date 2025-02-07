// Z:\JAV1\examples\09_Use_Interfaces\e_defaultMethoden

public interface X
{
  public abstract void m1();
  
  public default void m2()
  {
    System.out.println("Methode m2()");
  }
  
  default void m3()
  {
    System.out.println("Methode m3()");
    m1();
  }
}