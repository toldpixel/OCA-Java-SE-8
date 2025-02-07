// Z:\JAV1\examples\17_kovarianter_Rueckgabetyp

public class Hof
{
  public static void main(String[] args)
  {
    Kuh   kuh;
    Schaf schaf;
    
    KuhStall   kuhstall   = new KuhStall();
    SchafStall schafstall = new SchafStall();
    
    kuh   = kuhstall.gibWas();
    schaf = schafstall.gibWas();
    
    System.out.println(kuh.getClass());
    System.out.println(schaf.getClass());
    
    Stall stall1 = new KuhStall();
    Stall stall2 = new SchafStall();
    
    Kuh   t1 = (Kuh)stall1.gibWas();
    Schaf t2 = (Schaf)stall2.gibWas();
    
    t1.gibMilch();
    t2.gibWolle();
    
    stall1 = new HuehnerStall();
    Huhn  t3 = (Huhn)stall1.gibWas();
    System.out.println(t3.getClass());
  }
}