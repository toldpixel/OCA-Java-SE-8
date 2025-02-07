// Z:\JAV1\examples\09_Use_Interfaces\h_Comparable

public class Abstand
{
  // compareTo(<T> bezeichner)
  
  public static void main(String[] args)
  {
    System.out.println("A".compareTo("A"));
    System.out.println("C".compareTo("A"));
    System.out.println("A".compareTo("C"));
    System.out.println("ACxx".compareTo("AAAy"));
 // System.out.println("ACxx".compareTo(null));
 // Exception in thread "main" java.lang.NullPointerException
 
    Haus haus1 = new Haus(300000, 400);
    Haus haus2 = new Haus(400000, 300);
    
    System.out.println(haus1.compareTo(haus2));
  }
}