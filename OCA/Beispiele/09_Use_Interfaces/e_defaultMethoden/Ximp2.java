// Z:\JAV1\examples\09_Use_Interfaces\e_defaultMethoden

public class Ximp2 implements X
{
  @Override
  public void m1()
  {
    System.out.println("Methode m1()");
  }
  
  public void m2()
  {
    System.out.println("Methode m2() in Ximp2");
  }
  
  public static void main(String[] args)
  {
    X x = new Ximp2();
    x.m2();
    x.m3();
    
    new Ximp1().main(null);
  }
}