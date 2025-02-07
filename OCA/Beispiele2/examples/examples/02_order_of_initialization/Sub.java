// Z:\JAV2\examples\02_order_of_initialization

public class Sub extends Super
{
  public static int subStatVar = initStatVar();
  public        int subObjAttr = initObjAttr();
  
  private static int initStatVar()
  {
    System.out.println(" 3 - Sub   - statische Variable");
    return 1;
  }
  
  private static int initObjAttr()
  {
    System.out.println(" 8 - Sub   - Objektattribut");
    return 1;    
  }
  
  static
  {
    System.out.println(" 4 - Sub   - statischer Code");
  }
  
  // freier Code
  {
    System.out.println(" 9 - Sub   - freier Code");
  }
  
  public Sub()
  {
    System.out.println("10 - Sub   - Constructor");
  }
}