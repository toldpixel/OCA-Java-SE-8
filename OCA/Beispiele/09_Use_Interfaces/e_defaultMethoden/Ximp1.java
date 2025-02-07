// Z:\JAV1\examples\09_Use_Interfaces\e_defaultMethoden

public class Ximp1 implements X
{
  @Override
  public void m1()
  {
    System.out.println("Methode m1()");
  }
  
  public static void main(String[] args)
  {
    X x = new Ximp1();
    x.m2();
    x.m3();
  }
}