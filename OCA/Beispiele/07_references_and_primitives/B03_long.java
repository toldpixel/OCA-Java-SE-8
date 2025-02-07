// 1_java_building_block\07_references_and_primitives 

public class B03_long
{
  public static void main(String[] args)
  {
    int  i1, i2, i3, i4, i5, i6, i7;
    long x1, x2, x3, x4, x5, x6;
    
    i1 = 2147483647;    // größte int
 // i2 = 2147483648;
    x1 = 2147483648L;
    x2 = 2147483648l;
    x3 = 0x800000000L;
    x4 = Long.MAX_VALUE;
    System.out.println(x4);
    
    // i3 = 1L;
    x5 = 1;
    
    i4 = (int) 1L;
    
    i5 = (int) 2147483648L;
    System.out.println(i5);
    
    i6 = i5 * (-1);
    System.out.println(i6);
  }
}