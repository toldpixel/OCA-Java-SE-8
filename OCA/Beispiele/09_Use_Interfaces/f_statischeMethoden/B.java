// Z:\JAV1\examples\09_Use_Interfaces\f_statischeMethoden

public class B implements X 
{
  public static void main(String[] args)
  {
    B b = new B();
    
    // b.m();
    // error: cannot find symbol
    
    // B.m();
    // error: cannot find symbol
    
    X.m();
    // Statische Interface-Methoden sind NUR über den Interface-Namen
    // erreichbar.
  }
}