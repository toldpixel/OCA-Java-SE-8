// 1_java_building_block\07_references_and_primitives 

public class B07_referenzen
{
  public static void main(String[] args)
  {
    Object o = new Object();
    System.out.println(o);
    
    o = null;
    System.out.println(o);
    
    o = 15;
    System.out.println(o);
    
    int i = 0;
    // i = null;
    
    System.out.println(o.toString());
    // System.out.println(i.toString());
  }
}