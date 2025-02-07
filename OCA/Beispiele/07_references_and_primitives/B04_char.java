// 1_java_building_block\07_references_and_primitives 

public class B04_char
{
  public static void main(String[] args)
  {
    char c1, c2, c3, c4, c5, c6, c7, c8, c9, c10;
    int  i1, i2;
    
    c1 = 65;
    System.out.println(c1);
    
    // c2 = -1;
    
    c3 = 'A';
    System.out.println(c3);
    
    i1 = c3;
    System.out.println(i1);
    
    i2 = 'A';
    System.out.println(i2);
    
    c4 = '\101';              // char als Oktalzahl
    System.out.println(c4);
    
    c5 = '\u0041';            // char als Unicode
    System.out.println(c5);
    
    // c6 = '\\u41';          // unicode MUSS vierstellig sein
    
    c7 = \u0037;
    System.out.println(c7);
    
    c8 = '\u0037';
    System.out.println(c8);
    
    c9 = 65535;
    System.out.println(c9);
    
    c10 = (char) (c9 + 1);
    System.out.println("-" + c10 );
  }
}