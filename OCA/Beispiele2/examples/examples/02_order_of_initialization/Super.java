// Z:\JAV2\examples\02_order_of_initialization

public class Super
{
  public static int superStatVar = initStatVar();
  public        int superObjAttr = initObjAttr();
  
  private static int initStatVar()
  {
    System.out.println(" 1 - Super - statische Variable");
    return 1;
  }
  
  private static int initObjAttr()
  {
    System.out.println(" 5 - Super - Objektattribut");
    return 1;
  }
  
  static
  {
    System.out.println(" 2 - Super - statischer Code");
  } 
  
  // freier code
  {
    System.out.println(" 6 - Super - freier Code");
  }
  
  public Super()
  {
    System.out.println(" 7 - Super - Constructor");
  }
}